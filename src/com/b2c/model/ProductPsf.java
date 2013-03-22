package com.b2c.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="product_psf")
public class ProductPsf extends BaseModel{
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int fdId;
	/**
	 * 颜色
	 */
	@Column(name = "Color")
	private String color;

	/**
	 * 版本
	 */
	@Column(name = "Edition")
	private String edition;

	/**
	 * 售价
	 */
	@Column(name = "Price")
	private double price;

	/**
	 * 库存
	 */
	@Column(name = "Stock")
	private int stock;

	/**
	 * 缩略图地址
	 */
	@Column(name = "ImageUrl")
	private int imageUrl;
	
	/**
	 * 产品ID
	 */
	@ManyToOne(fetch=FetchType.LAZY,cascade={CascadeType.ALL})
	@JoinColumn(name="productId")
	private Product product= new Product();

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getFdId() {
		return fdId;
	}

	public void setFdId(int fdId) {
		this.fdId = fdId;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(int imageUrl) {
		this.imageUrl = imageUrl;
	}
	
}	
