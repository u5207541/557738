package com.b2c.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="product")
public class Product extends BaseModel{
	@Id
	@Column(name="Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int fdId;
	
	/**
	 * 产品名称
	 */
	@Column(name="ProductName")
	private String productName;
	/**
	 * 产品描述
	 */
	@Column(name="ProductInfo")
	private String productInfo;
	
	/**
	 * 创建时间
	 */
	@Column(name="Dateandtime")
	private Date dateandTime;
	
	/**
	 * 价格
	 */
	@Column(name="Price")
	private double Price;
	
	/**
	 * 图片路径
	 */
	@Column(name="Imageurl")
	private String imageUrl;
	
	/**
	 * 产品明细
	 */
	@OneToMany(mappedBy="product")
	List<ProductPsf> productPsfs= new ArrayList<ProductPsf>();
	
	/**
	 * 订单号
	 */
	@OneToMany(mappedBy="product")
	List<MemberOrder> memberOrders=new ArrayList<MemberOrder>();
	
	public List<MemberOrder> getMemberOrders() {
		return memberOrders;
	}

	public void setMemberOrders(List<MemberOrder> memberOrders) {
		this.memberOrders = memberOrders;
	}

	public List<ProductPsf> getProductPsfs() {
		return productPsfs;
	}

	public void setProductPsfs(List<ProductPsf> productPsfs) {
		this.productPsfs = productPsfs;
	}

	public int getFdId() {
		return fdId;
	}

	public void setFdId(int fdId) {
		this.fdId = fdId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(String productInfo) {
		this.productInfo = productInfo;
	}

	public Date getDateandTime() {
		return dateandTime;
	}

	public void setDateandTime(Date dateandTime) {
		this.dateandTime = dateandTime;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	
}
