package Ecommerce.ecom.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@SequenceGenerator(name = "category_sequence", sequenceName = "category_sequence", initialValue = 1, allocationSize = 1)
public class category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_sequence")
    @Column(name = "category_ID")
    private Long categoryId;

    @Column(name = "category_name")
    private String categoryName;
    
    @Column(name="thumbnail")
    private String thumbnail;
    
	public category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	@Override
	public String toString() {
		return "category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", thumbnail=" + thumbnail
				+ "]";
	}

	public category(Long categoryId, String categoryName, String thumbnail) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.thumbnail = thumbnail;
	}

	
}