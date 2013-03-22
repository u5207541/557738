package com.b2c.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "member_order")
public class MemberOrder extends BaseModel{
	@Id
	@Column(name="Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int fdId;
	
	/**
	 * 订单ID
	 * column:OrderID
	 * 备注:可视化的非重订单编号,比如:9021392932844
	 */
	@Column(name="OrderID")
	private String orderId;
	
	/**
	 * 购买者姓名
	 * column:BuyerName
	 */
	@Column(name="BuyerName")
	private String buyerName;
	
	/**
	 * 购买者地址
	 * column:BuyerAddress
	 */
	@Column(name="BuyerAddress")
	private String buyerAddress;
	
	/**
	 * 银行ID
	 * column:BankID
	 */
	@Column(name="BankID")
	private String bankId;
	
	/**
	 * 分期银行名称
	 * column:BankName
	 */
	@Column(name="BankName")
	private String bankName;
	
	/**
	 * 期数
	 * column：BankExp
	 */
	@Column(name="BankExp")
	private int bankExp;
	
	/**
	 * 首付
	 * column:BankPayment
	 */
	@Column(name="BankPayment")
	private Double bankPayment;
	
	/**
	 * 月供
	 * column:BankPayment_Month
	 */
	@Column(name="BankPayment_Month")
	private Double bankPaymentMonth;
	
	/**
	 * 订单状态
	 * column:OrderState
	 * 备注：
	 *  0：未付款订单:   仅指”未付款未发货订单” 
		10：已付款订单: 仅指”已付款未发货订单” 
		20：配货中订单: 包括”已付款配货中订单”和货到付款”未付款配货中订单” 
		30：已发货订单: 包括”已付款已发货订单”和货到付款”未付款已发货订单” 
		40：已完成订单: 这里指前台用户”确认交易”的订单或后台管理员手工”确认交易的订单 
		99：申请退款订单: 只有已发货订单才允许用户在线申请退款,且此订单尚在退款有效期限内
	 */
	@Column(name="OrderState")
	private String orderState;
	
	/**
	 * 优惠券产生时间
	 * column:Dateandtime
	 * 
	 */
	@Column(name="Dateandtime")
	private Date dateandTime;
	
	/**
	 * 支付方式
	 * 0:信用卡支付,1:块钱支付,2支付宝支付
	 */
	private String payType;
	
	/**
	 * 订单价格
	 * column:TotalPrice
	 */
	private Double totalPrice;
	
	/**
	 * 创建者ID或成员ID
	 */
	@ManyToOne(fetch=FetchType.LAZY,cascade={CascadeType.ALL})
	@JoinColumn(name="MemberId")
	private Member member;
	
	/**
	 * 优惠卷
	 */
	@OneToOne(fetch=FetchType.LAZY,cascade={CascadeType.ALL})
	@JoinColumn(name="ConponsId")
	private Coupons conpons;
	
	
	/**
	 * 产品
	 */
	@ManyToOne(fetch=FetchType.LAZY,cascade={CascadeType.ALL})
	@JoinColumn(name="productId")
	private Product product;
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Coupons getConpons() {
		return conpons;
	}

	public void setConpons(Coupons conpons) {
		this.conpons = conpons;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public int getFdId() {
		return fdId;
	}

	public void setFdId(int fdId) {
		this.fdId = fdId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerAddress() {
		return buyerAddress;
	}

	public void setBuyerAddress(String buyerAddress) {
		this.buyerAddress = buyerAddress;
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getBankExp() {
		return bankExp;
	}

	public void setBankExp(int bankExp) {
		this.bankExp = bankExp;
	}

	public Double getBankPayment() {
		return bankPayment;
	}

	public void setBankPayment(Double bankPayment) {
		this.bankPayment = bankPayment;
	}

	public Double getBankPaymentMonth() {
		return bankPaymentMonth;
	}

	public void setBankPaymentMonth(Double bankPaymentMonth) {
		this.bankPaymentMonth = bankPaymentMonth;
	}

	public String getOrderState() {
		return orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	public Date getDateandTime() {
		return dateandTime;
	}

	public void setDateandTime(Date dateandTime) {
		this.dateandTime = dateandTime;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}
