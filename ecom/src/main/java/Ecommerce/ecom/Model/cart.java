package Ecommerce.ecom.Model;

import java.math.BigDecimal;

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
@SequenceGenerator(name = "cart_sequence", sequenceName = "cart_sequence", initialValue = 1, allocationSize = 1)
public class cart {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cart_sequence")
    @Column(name = "cart_ID")
    private Long cartId;

    @ManyToOne
    @JoinColumn(name = "user_ID")
    private Users user;

    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    public cart(Long cartId, Users user, BigDecimal totalAmount, Integer numberOfItems) {
		super();
		this.cartId = cartId;
		this.user = user;
		this.totalAmount = totalAmount;
		this.numberOfItems = numberOfItems;
	}

	@Override
	public String toString() {
		return "cart [cartId=" + cartId + ", user=" + user + ", totalAmount=" + totalAmount + ", numberOfItems="
				+ numberOfItems + "]";
	}

	public Long getCartId() {
		return cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Integer getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(Integer numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	@Column(name = "number_of_items")
    private Integer numberOfItems;

	public cart() {
		super();
		// TODO Auto-generated constructor stub
	}

    // Getters and setters
}