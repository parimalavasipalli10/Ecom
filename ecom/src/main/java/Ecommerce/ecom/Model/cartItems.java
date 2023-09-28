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
@SequenceGenerator(name = "cartitem_sequence", sequenceName = "cartitem_sequence", initialValue = 1, allocationSize = 1)
public class cartItems {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cartitem_sequence")
    @Column(name = "cartItem_ID")
    private Long cartItemId;

    @ManyToOne
    @JoinColumn(name = "cart_ID")
    private cart cart;

    @ManyToOne
    @JoinColumn(name = "product_ID")
    private products product;

    public cartItems(Long cartItemId, Ecommerce.ecom.Model.cart cart, products product, Integer quantity,
			BigDecimal productCost) {
		super();
		this.cartItemId = cartItemId;
		this.cart = cart;
		this.product = product;
		this.quantity = quantity;
		this.productCost = productCost;
	}

	public cartItems() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Column(name = "quantity")
    private Integer quantity;

    @Column(name = "product_cost")
    private BigDecimal productCost;

	@Override
	public String toString() {
		return "cartItems [cartItemId=" + cartItemId + ", cart=" + cart + ", product=" + product + ", quantity="
				+ quantity + ", productCost=" + productCost + "]";
	}

	public Long getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(Long cartItemId) {
		this.cartItemId = cartItemId;
	}

	public cart getCart() {
		return cart;
	}

	public void setCart(cart cart) {
		this.cart = cart;
	}

	public products getProduct() {
		return product;
	}

	public void setProduct(products product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getProductCost() {
		return productCost;
	}

	public void setProductCost(BigDecimal productCost) {
		this.productCost = productCost;
	}

    // Getters and setters
}