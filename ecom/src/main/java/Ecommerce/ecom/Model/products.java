package Ecommerce.ecom.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@SequenceGenerator(name = "product_sequence", sequenceName = "product_sequence", initialValue = 1000, allocationSize = 1)
public class products {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_sequence")
    @Column(name = "product_ID")
    private Long productId;

    @ManyToOne
    @JoinColumn(name = "seller_ID")
    private sellers seller;

    @ManyToOne
    @JoinColumn(name = "category_ID")
    private category category;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_price")
    private float productPrice;

    public products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public products(Long productId, sellers seller, Ecommerce.ecom.Model.category category, String productName,
			float productPrice, String productImage, String productThumbnail, Boolean productAvailability,
			Integer productQuantity, String productDescription) {
		super();
		this.productId = productId;
		this.seller = seller;
		this.category = category;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productImage = productImage;
		this.productThumbnail = productThumbnail;
		this.productAvailability = productAvailability;
		this.productQuantity = productQuantity;
		this.productDescription = productDescription;
	}

	@Override
	public String toString() {
		return "products [productId=" + productId + ", seller=" + seller + ", category=" + category + ", productName="
				+ productName + ", productPrice=" + productPrice + ", productImage=" + productImage
				+ ", productThumbnail=" + productThumbnail + ", productAvailability=" + productAvailability
				+ ", productQuantity=" + productQuantity + ", productDescription=" + productDescription + "]";
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public sellers getSeller() {
		return seller;
	}

	public void setSeller(sellers seller) {
		this.seller = seller;
	}

	public category getCategory() {
		return category;
	}

	public void setCategory(category category) {
		this.category = category;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public String getProductThumbnail() {
		return productThumbnail;
	}

	public void setProductThumbnail(String productThumbnail) {
		this.productThumbnail = productThumbnail;
	}

	public Boolean getProductAvailability() {
		return productAvailability;
	}

	public void setProductAvailability(Boolean productAvailability) {
		this.productAvailability = productAvailability;
	}

	public Integer getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	@Column(name = "product_image")
    private String productImage;

    @Column(name = "product_thumbnail")
    private String productThumbnail;

    @Column(name = "product_availability")
    private Boolean productAvailability;

    @Column(name = "product_quantity")
    private Integer productQuantity;

    @Column(name = "product_description")
    private String productDescription;

    // Getters and setters
}