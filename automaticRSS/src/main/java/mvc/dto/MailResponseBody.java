package mvc.dto;

import com.fasterxml.jackson.annotation.JsonView;

public class MailResponseBody {

	@JsonView(Views.Public.class)
	String id;
	
	@JsonView(Views.Public.class)
	String title;
	
	@JsonView(Views.Public.class)
	String target;
	
	@JsonView(Views.Public.class)
	String time;
	
	@JsonView(Views.Public.class)
	String status;
	
	@JsonView(Views.Public.class)
	String sendNumber;
	
	@JsonView(Views.Public.class)
	String errorNumber;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSendNumber() {
		return sendNumber;
	}
	public void setSendNumber(String sendNumber) {
		this.sendNumber = sendNumber;
	}
	public String getErrorNumber() {
		return errorNumber;
	}
	public void setErrorNumber(String errorNumber) {
		this.errorNumber = errorNumber;
	}
	
	
	
	
	
}
