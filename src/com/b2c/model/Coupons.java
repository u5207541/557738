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
@Table(name = "coupons")
public class Coupons extends BaseModel{
	@Id
	@Column(name="Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int fdId;
	
	
	/**
	 * 优惠券描述
	 */
	@Column(name="CouponsInfo")
	private String couponsInfo;
	
	/**
	 * 优惠券名称
	 */
	@Column(name="CouponsName")
	private String couponsName;
	
	/**
	 * 优惠券金额
	 */
	@Column(name="CouponsPrice")
	private Double couponsPrice;
	
	/**
	 * 有效期-开始日期
	 */
	@Column(name="Time_start")
	private Date time_start;
	
	/**
	 * 有效期-结束日期
	 */
	@Column(name="Time_end")
	private Date time_end;
	
	/**
	 * 条件：0为不限制，大于0则必须订单金额达到要求才可使用。
	 */
	@Column(name="Condition_other")
	private Double condition;


	/**
	 *订单Id 
	 */
	@OneToOne(mappedBy="conpons")
	private MemberOrder memberOrder;
	
	/**
	 * 成员Id
	 */
	@ManyToOne(cascade={CascadeType.ALL},fetch=FetchType.LAZY)
	@JoinColumn(name="memberId")
	private Member member;
	
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public MemberOrder getMemberOrder() {
		return memberOrder;
	}

	public void setMemberOrder(MemberOrder memberOrder) {
		this.memberOrder = memberOrder;
	}

	public int getFdId() {
		return fdId;
	}

	public void setFdId(int fdId) {
		this.fdId = fdId;
	}

	public String getCouponsInfo() {
		return couponsInfo;
	}

	public void setCouponsInfo(String couponsInfo) {
		this.couponsInfo = couponsInfo;
	}

	public String getCouponsName() {
		return couponsName;
	}

	public void setCouponsName(String couponsName) {
		this.couponsName = couponsName;
	}

	
	public Date getTime_start() {
		return time_start;
	}

	public void setTime_start(Date time_start) {
		this.time_start = time_start;
	}

	public Date getTime_end() {
		return time_end;
	}

	public void setTime_end(Date time_end) {
		this.time_end = time_end;
	}
	public Double getCouponsPrice() {
		return couponsPrice;
	}

	public void setCouponsPrice(Double couponsPrice) {
		this.couponsPrice = couponsPrice;
	}

	public Double getCondition() {
		return condition;
	}

	public void setCondition(Double condition) {
		this.condition = condition;
	}
}
