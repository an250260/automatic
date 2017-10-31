package mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import mvc.dto.AffiliatersResponseBody;
import mvc.dto.AffiliatersSearchConditionSubmitBody;
import mvc.dto.MailResponseBody;
import mvc.dto.MailSubmitBody;
import mvc.util.ComboBoxResponseBody;
import mvc.util.Constant;
import mvc.util.Utility;

public class AffiliatesDao {
	
	private DataSource dataSource;
	Utility util;
	Constant cons;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public List<AffiliatersResponseBody> searchAffiliatesList(AffiliatersSearchConditionSubmitBody req){
		
		boolean isMutipleId = false;
		String[] searchId = req.getAffiliatesId().trim().split(",");
		
		if(searchId.length > 1){
			isMutipleId = true;
		}
		
		
		String sql = "SELECT tAf.id, firstname_kanji, lastname_kanji, tRank.name AS rankName, email, status, mail_permission, mail_err, register_date " +
		"FROM affiliater AS tAf " +
		"LEFT JOIN const_affiliates_rank AS tRank ON tAf.rank =  tRank.id " +
/*		"LEFT JOIN const_mailling_status AS tMStatus ON tAf.mail_permission = tMStatus.id " +
		"LEFT JOIN const_affiliates_status AS tAStatus ON tAf.status = tAStatus.id " +*/
		"WHERE ";
		
		String whereStm = "";

		if(!util.checkStringNullAndBlank(req.getAffiliatesId())){
			
			if(!isMutipleId){
				if(util.isInteger(req.getAffiliatesId().trim())){
				whereStm += " tAf.id = ?id AND ";
				whereStm = whereStm.replace("?id", req.getAffiliatesId().trim());
				}else{
					whereStm += " tAf.id = -1 AND ";
				}
			}else{
				
				int count = 0;
				for(String item:searchId){
					if(util.isInteger(item.trim())){
						count++;
					}
				}
				
				if(count > 0){
					whereStm += " ( ";
					for(String item:searchId){
						if(util.isInteger(item.trim())){
							whereStm += " tAf.id = ?id OR ";
							whereStm = whereStm.replace("?id", item.trim());
						}
					}
					whereStm = whereStm.substring(0, whereStm.length() - 3);
					whereStm += ") AND ";
				}else{
					whereStm += " tAf.id = -1 AND ";
				}

			}
			
		}
		if(!util.checkStringNullAndBlank(req.getLastName())){
			whereStm += " tAf.lastname_kanji LIKE '%?lastname_kanji%' AND ";
			whereStm = whereStm.replace("?lastname_kanji", req.getLastName().trim());
		}
		if(!util.checkStringNullAndBlank(req.getFirstName())){
			whereStm += " tAf.firstname_kanji LIKE '%?firstname_kanji%' AND ";
			whereStm = whereStm.replace("?firstname_kanji", req.getFirstName().trim());
		}
		 if(!util.checkStringNullAndBlank(req.getEmail())){
			whereStm += " tAf.email = '?email' AND ";
			whereStm = whereStm.replace("?email", req.getEmail().trim());
		}
		 if(!(req.getRank() == -1)){
			whereStm += " tAf.rank = ?rank AND ";
			whereStm = whereStm.replace("?rank", String.valueOf(req.getRank()));
		}
		 if(!(req.getStatus() == -1)){
			whereStm += " tAf.status = ?status AND ";
			whereStm = whereStm.replace("?status", String.valueOf(req.getStatus()));
		}
		 if(!(req.getPermit() == -1)){
			whereStm += " tAf.mail_permission = ?mail_permission AND ";
			whereStm = whereStm.replace("?mail_permission", String.valueOf(req.getPermit()));
		}
		 if(!util.checkStringNullAndBlank(req.getIp())){
			whereStm += " tAf.ip = '?ip' AND ";
			whereStm = whereStm.replace("?ip", req.getIp().trim());
		}
		 if(!util.checkStringNullAndBlank(req.getDateFrom()) && !util.checkStringNullAndBlank(req.getDateTo())){
			whereStm += " '?register_dateFrom' <= tAf.register_date AND tAf.register_date <= '?register_dateTo' AND ";
			whereStm = whereStm.replace("?register_dateFrom", req.getDateFrom());
			whereStm = whereStm.replace("?register_dateTo", req.getDateTo());
		}
		 if(!util.checkStringNullAndBlank(req.getDateFrom()) && util.checkStringNullAndBlank(req.getDateTo())){
			whereStm += " '?register_dateFrom' <= tAf.register_date AND ";
			whereStm = whereStm.replace("?register_dateFrom", req.getDateFrom());
		}
		 if(util.checkStringNullAndBlank(req.getDateFrom()) && !util.checkStringNullAndBlank(req.getDateTo())){
			whereStm += " tAf.register_date <= '?register_dateTo' AND ";
			whereStm = whereStm.replace("?register_dateTo", req.getDateTo());
		}
		whereStm += " 1=1 ORDER BY tAf.register_date DESC";
		sql += whereStm;
		
		System.out.println(sql);
		
		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			
			AffiliatersResponseBody temp = null;
			List<AffiliatersResponseBody> result = new ArrayList<AffiliatersResponseBody>();
			
			while (rs.next()) {
				temp = new AffiliatersResponseBody();
				temp.setId(rs.getString("id"));
				temp.setFirstname_kanji(rs.getString("firstname_kanji"));
				temp.setLastname_kanji(rs.getString("lastname_kanji"));
				temp.setRank(rs.getString("rankName"));
				temp.setEmail(rs.getString("email"));
				temp.setStatus(cons.setAffiliattesStatusName(rs.getInt("status")));
				temp.setMail_permission(cons.setMaillingStatusName(rs.getInt("mail_permission")));
				temp.setMail_err(rs.getString("mail_err"));
				temp.setRegister_date(rs.getString("register_date"));
				result.add(temp);
			}
			rs.close();
			ps.close();
			
			
			return result;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {}
			}
		}
	}

	public boolean checkValidAffilates(String id){

		String sql = "SELECT status, mail_permission FROM affiliater WHERE id = ?";

		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			boolean valid = false;
			while (rs.next()) {
				if(rs.getString("status").equals("1") && rs.getString("mail_permission").equals("1")){
					valid = true;
				}else{
					valid = false;
				}
			}
			rs.close();
			ps.close();
			

			return valid;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {}
			}
		}
	}
	
	public boolean checkAffiliatesDuplicateMail(String mail){
		boolean isDup = false;
		String sql = "SELECT email FROM affiliater WHERE email = ?";

		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, mail);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				isDup = true;
			}
			rs.close();
			ps.close();
			

			return isDup;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {}
			}
		}
	}
}
