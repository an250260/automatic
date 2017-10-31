package mvc.dto;

import com.fasterxml.jackson.annotation.JsonView;

public class AffiliatersResponseBody {

	@JsonView(Views.Public.class)
	String id;
	
	@JsonView(Views.Public.class)
	String password;
	
	@JsonView(Views.Public.class)
	String firstname_kanji;
	
	@JsonView(Views.Public.class)
	String lastname_kanji;
	
	@JsonView(Views.Public.class)
	String firstname_furi;
	
	@JsonView(Views.Public.class)
	String lastname_furi;
	
	@JsonView(Views.Public.class)
	String email;
	
	@JsonView(Views.Public.class)
	String rank;
	
	@JsonView(Views.Public.class)
	String status;
	
	@JsonView(Views.Public.class)
	String mail_permission;
	
	@JsonView(Views.Public.class)
	String mail_err;
	
	@JsonView(Views.Public.class)
	String register_date;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMail_permission() {
		return mail_permission;
	}

	public void setMail_permission(String mail_permission) {
		this.mail_permission = mail_permission;
	}

	public String getMail_err() {
		return mail_err;
	}

	public void setMail_err(String mail_err) {
		this.mail_err = mail_err;
	}

	public String getRegister_date() {
		return register_date;
	}

	public void setRegister_date(String register_date) {
		this.register_date = register_date;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname_kanji() {
		return firstname_kanji;
	}

	public void setFirstname_kanji(String firstname_kanji) {
		this.firstname_kanji = firstname_kanji;
	}

	public String getLastname_kanji() {
		return lastname_kanji;
	}

	public void setLastname_kanji(String lastname_kanji) {
		this.lastname_kanji = lastname_kanji;
	}

	public String getFirstname_furi() {
		return firstname_furi;
	}

	public void setFirstname_furi(String firstname_furi) {
		this.firstname_furi = firstname_furi;
	}

	public String getLastname_furi() {
		return lastname_furi;
	}

	public void setLastname_furi(String lastname_furi) {
		this.lastname_furi = lastname_furi;
	}
	
	
}
