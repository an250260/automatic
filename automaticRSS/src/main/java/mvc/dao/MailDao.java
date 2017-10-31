package mvc.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import mvc.dto.AffiliatersResponseBody;
import mvc.dto.MailResponseBody;
import mvc.dto.MailSubmitBody;
import mvc.util.Constant;

public class MailDao {
	
	private DataSource dataSource;
	private Constant cons;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public MailSubmitBody getMailData(String id){

		MailSubmitBody result = new MailSubmitBody();
		String sql = "SELECT title, send_target, send_time, sender_name, sender_address, mail_title, mail_content, mail_note FROM crew_management.mail_service WHERE id = ?";

		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			
			
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				result.setId(id);
				result.setTitle(rs.getString("title"));
				result.setSend_target(rs.getString("send_target"));
				result.setSend_time(rs.getString("send_time"));
				result.setSender_name(rs.getString("sender_name"));
				result.setSender_address(rs.getString("sender_address"));
				result.setMail_title(rs.getString("mail_title"));
				result.setMail_content(rs.getString("mail_content"));
				result.setMail_note(rs.getString("mail_note"));
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
	
	public void insertMailData(MailSubmitBody request){

		String sql = "INSERT INTO mail_service(title, send_target, send_time, sender_name, sender_address, mail_title, mail_content, mail_note, send_num, send_error_num, status) VALUES(?,?,?,?,?,?,?,?,0,0,1)";

		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, request.getTitle());
			ps.setString(2, request.getSend_target());
			ps.setString(3, request.getSend_time());
			ps.setString(4, request.getSender_name());
			ps.setString(5, request.getSender_address());
			ps.setString(6, request.getMail_title());
			ps.setString(7, request.getMail_content());		
			ps.setString(8, request.getMail_note());	
			
			ps.execute();
			ps.close();
			
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
	
	public List<MailResponseBody> getMailList(){

		String sql = "SELECT id, title, send_target, send_time, status, send_num, send_error_num FROM mail_service ORDER BY status DESC";

		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			MailResponseBody temp = null;
			List<MailResponseBody> result = new ArrayList<MailResponseBody>();
			
			while (rs.next()) {
				temp = new MailResponseBody();
				temp.setId(rs.getString("id"));
				temp.setTitle(rs.getString("title"));
				temp.setTarget(rs.getString("send_target"));
				temp.setTime(rs.getString("send_time"));
				temp.setStatus(cons.setMailScheduletatusName(rs.getInt("status")));
				temp.setSendNumber(rs.getString("send_num"));
				temp.setErrorNumber(rs.getString("send_error_num"));
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
	
	public void updateMailData(MailSubmitBody request){

		String sql = "UPDATE mail_service SET " +
		"title = ?, " +
		"send_target = ?, " +
		"send_time = ?, " +
		"sender_name = ?, " +
		"sender_address = ?, " +
		"mail_title = ?, " +
		"mail_content = ?, " +
		"mail_note = ? " +
		"WHERE id = ? ";
		
		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, request.getTitle());
			ps.setString(2, request.getSend_target());
			ps.setString(3, request.getSend_time());
			ps.setString(4, request.getSender_name());
			ps.setString(5, request.getSender_address());
			ps.setString(6, request.getMail_title());
			ps.setString(7, request.getMail_content());		
			ps.setString(8, request.getMail_note());	
			ps.setString(9, request.getId());	
			
			ps.executeUpdate();
			ps.close();
			
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
	
	public void deleteMailData(String id){

		String sql = "DELETE FROM mail_service WHERE id = ?";
		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, id);

			ps.execute();
			ps.close();
			
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
