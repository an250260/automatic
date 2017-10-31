package mvc.dao;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import mvc.dto.AffiliatersResponseBody;
import mvc.dto.MailResponseBody;
import mvc.dto.MailSubmitBody;
import mvc.util.ComboBoxResponseBody;
import mvc.util.Constant;

public class ConstDao {
	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public List<ComboBoxResponseBody> getAffiliatesRankList(){
		String sql = "SELECT id, name FROM const_affiliates_rank";

		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			ComboBoxResponseBody temp = null;
			List<ComboBoxResponseBody> result = new ArrayList<ComboBoxResponseBody>();
			
			while (rs.next()) {
				temp = new ComboBoxResponseBody();
				temp.setItemID(rs.getString("id"));
				temp.setItemName(rs.getString("name"));		
				
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
	
	
	public void getApi() throws JsonProcessingException, IOException
	{
	    final String uri = "http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1";
	     
	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);
	    ObjectMapper mapper = new ObjectMapper();
	    JsonNode rootNode = mapper.readTree(result);
	    
	    System.out.println(rootNode.get("coord").get("lon"));
	}
}
