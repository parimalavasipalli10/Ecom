package Ecommerce.ecom.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@SequenceGenerator(name = "sellers_sequence", sequenceName = "sellers_sequence", initialValue = 1000, allocationSize = 1)
public class sellers {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sellers_sequence")
    @Column(name = "seller_ID")
    private Long sellerId;

    @Column(name = "seller_name")
    private String sellerName;

    @Column(name = "seller_password")
    private String sellerPassword;

    public sellers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public sellers(Long sellerId, String sellerName, String sellerPassword, String sellerBusinessName,
			String sellerEmail, String sellerPhoneNumber) {
		super();
		this.sellerId = sellerId;
		this.sellerName = sellerName;
		this.sellerPassword = sellerPassword;
		this.sellerBusinessName = sellerBusinessName;
		this.sellerEmail = sellerEmail;
		this.sellerPhoneNumber = sellerPhoneNumber;
	}

	@Override
	public String toString() {
		return "sellers [sellerId=" + sellerId + ", sellerName=" + sellerName + ", sellerPassword=" + sellerPassword
				+ ", sellerBusinessName=" + sellerBusinessName + ", sellerEmail=" + sellerEmail + ", sellerPhoneNumber="
				+ sellerPhoneNumber + "]";
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerPassword() {
		return sellerPassword;
	}

	public void setSellerPassword(String sellerPassword) {
		this.sellerPassword = sellerPassword;
	}

	public String getSellerBusinessName() {
		return sellerBusinessName;
	}

	public void setSellerBusinessName(String sellerBusinessName) {
		this.sellerBusinessName = sellerBusinessName;
	}

	public String getSellerEmail() {
		return sellerEmail;
	}

	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}

	public String getSellerPhoneNumber() {
		return sellerPhoneNumber;
	}

	public void setSellerPhoneNumber(String sellerPhoneNumber) {
		this.sellerPhoneNumber = sellerPhoneNumber;
	}

	@Column(name = "seller_businessName")
    private String sellerBusinessName;

    @Column(name = "sellerEmail")
    private String sellerEmail;

    @Column(name = "seller_phonenumber")
    private String sellerPhoneNumber;

    // Getters and setters
}