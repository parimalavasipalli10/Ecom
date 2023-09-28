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
@SequenceGenerator(name = "orderitem_sequence", sequenceName = "orderitem_sequence", initialValue = 1, allocationSize = 1)
public class orderItems {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orderitem_sequence")
    @Column(name = "orderItem_ID")
    private Long orderItemId;

    @ManyToOne
    @JoinColumn(name = "order_ID")
    private orders order;

    @ManyToOne
    @JoinColumn(name = "product_ID")
    private products product;

    @Column(name = "product_quantity")
    private Integer productQuantity;

    @Column(name = "product_cost")
    private BigDecimal productCost;

	public orderItems() {
		super();
		// TODO Auto-generated constructor stub
	}

	public orderItems(Long orderItemId, orders order, products product, Integer productQuantity,
			BigDecimal productCost) {
		super();
		this.orderItemId = orderItemId;
		this.order = order;
		this.product = product;
		this.productQuantity = productQuantity;
		this.productCost = productCost;
	}

	@Override
	public String toString() {
		return "orderItems [orderItemId=" + orderItemId + ", order=" + order + ", product=" + product
				+ ", productQuantity=" + productQuantity + ", productCost=" + productCost + "]";
	}

	public Long getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
	}

	public orders getOrder() {
		return order;
	}

	public void setOrder(orders order) {
		this.order = order;
	}

	public products getProduct() {
		return product;
	}

	public void setProduct(products product) {
		this.product = product;
	}

	public Integer getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	public BigDecimal getProductCost() {
		return productCost;
	}

	public void setProductCost(BigDecimal productCost) {
		this.productCost = productCost;
	}

    // Getters and setters
}