package Ecommerce.ecom.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
//import jakarta.persistence.Table;

@Entity
@Table(name="users")
@SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence", initialValue = 1000, allocationSize = 1)
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
    @Column(name = "user_id")
    private Long user_id;

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "user_firstname")
    private String user_firstname;

    @Column(name = "user_lastname")
    private String user_lastname;

    @Column(name = "user_Email")
    private String user_Email;

    @Column(name = "user_phonenumber")
    private String user_phonenumber;

    @Column(name = "user_password")
    private String user_password;

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_firstname() {
		return user_firstname;
	}

	public void setUser_firstname(String user_firstname) {
		this.user_firstname = user_firstname;
	}

	public String getUser_lastname() {
		return user_lastname;
	}

	public void setUser_lastname(String user_lastname) {
		this.user_lastname = user_lastname;
	}

	public String getUser_Email() {
		return user_Email;
	}

	public void setUser_Email(String user_Email) {
		this.user_Email = user_Email;
	}

	public String getUser_phonenumber() {
		return user_phonenumber;
	}

	public void setUser_phonenumber(String user_phonenumber) {
		this.user_phonenumber = user_phonenumber;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	@Override
	public String toString() {
		return "users [user_id=" + user_id + ", user_name=" + user_name + ", user_firstname=" + user_firstname
				+ ", user_lastname=" + user_lastname + ", user_Email=" + user_Email + ", user_phonenumber="
				+ user_phonenumber + ", user_password=" + user_password + "]";
	}

	public Users(Long user_id, String user_name, String user_firstname, String user_lastname, String user_Email,
			String user_phonenumber, String user_password) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_firstname = user_firstname;
		this.user_lastname = user_lastname;
		this.user_Email = user_Email;
		this.user_phonenumber = user_phonenumber;
		this.user_password = user_password;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}