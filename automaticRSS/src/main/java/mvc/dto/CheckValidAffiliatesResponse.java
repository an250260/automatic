package mvc.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;

public class CheckValidAffiliatesResponse {

	@JsonView(Views.Public.class)
	List<String> maillingList;
	
	@JsonView(Views.Public.class)
	int numberOfValid;

	public List<String> getMaillingList() {
		return maillingList;
	}

	public void setMaillingList(List<String> maillingList) {
		this.maillingList = maillingList;
	}

	public int getNumberOfValid() {
		return numberOfValid;
	}

	public void setNumberOfValid(int numberOfValid) {
		this.numberOfValid = numberOfValid;
	}
	
	
}
