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

import java.math.BigDecimal;
import java.util.Date;

@Entity
@SequenceGenerator(name = "order_sequence", sequenceName = "order_sequence", initialValue = 1, allocationSize = 1)
public class orders {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_sequence")
    @Column(name = "order_ID")
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "user_ID")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "seller_ID")
    private sellers seller;

    @Column(name = "order_amount")
    private BigDecimal orderAmount;

    @Column(name = "order_status")
    private String orderStatus;

    public orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public orders(Long orderId, Users user, sellers seller, BigDecimal orderAmount, String orderStatus,
			Date orderDate) {
		super();
		this.orderId = orderId;
		this.user = user;
		this.seller = seller;
		this.orderAmount = orderAmount;
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "orders [orderId=" + orderId + ", user=" + user + ", seller=" + seller + ", orderAmount=" + orderAmount
				+ ", orderStatus=" + orderStatus + ", orderDate=" + orderDate + "]";
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public sellers getSeller() {
		return seller;
	}

	public void setSeller(sellers seller) {
		this.seller = seller;
	}

	public BigDecimal getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Column(name = "order_date")
    private Date orderDate;

    // Getters and setters
}