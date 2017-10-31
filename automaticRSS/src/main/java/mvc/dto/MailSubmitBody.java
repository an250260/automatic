package mvc.dto;

public class MailSubmitBody {

	String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setMail_note(String mail_note) {
		this.mail_note = mail_note;
	}

	String title;

	String send_target;

	String send_time;

	String sender_name;

	String sender_address;
	
	String mail_title;
	
	String mail_content;
	
	String mail_note;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSend_target() {
		return send_target;
	}

	public void setSend_target(String send_target) {
		this.send_target = send_target;
	}

	public String getSend_time() {
		return send_time;
	}

	public void setSend_time(String send_time) {
		this.send_time = send_time;
	}

	public String getSender_name() {
		return sender_name;
	}

	public void setSender_name(String sender_name) {
		this.sender_name = sender_name;
	}

	public String getSender_address() {
		return sender_address;
	}

	public void setSender_address(String sender_address) {
		this.sender_address = sender_address;
	}

	public String getMail_title() {
		return mail_title;
	}

	public void setMail_title(String mail_title) {
		this.mail_title = mail_title;
	}

	public String getMail_content() {
		return mail_content;
	}

	public void setMail_content(String mail_content) {
		this.mail_content = mail_content;
	}

	public String getMail_note() {
		return mail_note;
	}

	public void setMai_note(String mai_note) {
		this.mail_note = mai_note;
	}
	
	
	
	
}
