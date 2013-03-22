package com.b2c.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//你好的 a
@Entity
@Table(name = "member_infos")
public class Member extends BaseModel{
	@Id
	@Column(name="Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int fdId;
	/**
	 * 用户名兼邮箱 column:Usermail
	 */
	@Column(name = "Usermail")
	private String userMail;
	/**
	 * 密码 column:UserPwd 备注:用于登陆的用户密码,需要MD5加密
	 */
	@Column(name = "UserPwd")
	private String userPwd;
	/**
	 * 昵称 column:NickName
	 */
	@Column(name = "NickName")
	private String nickName;
	/**
	 * 真实姓名 column:RealName
	 */
	@Column(name = "RealName")
	private String realName;
	/**
	 * 性别 column:Sex 备注：性别,1是男性,0是女性,2是不愿透露
	 */
	@Column(name = "Sex")
	private int sex;
	/**
	 * 生日 column:Birthday
	 */
	@Column(name = "Birthday")
	private String birthday;
	/**
	 * 电话 column:Tel
	 */
	@Column(name = "Tel")
	private String tel;
	/**
	 * 身份证号 column:IDCard
	 */
	@Column(name = "IDCard")
	private String iDCard;
	/**
	 * 住宅地址 column:Address
	 */
	@Column(name = "Address")
	private String address;
	/**
	 * 在线联系方式QQ column:WebChat
	 */
	@Column(name = "WebChat")
	private String webChat;
	/**
	 * 用户信息 columb:UserInfo
	 */
	@Column(name = "UserInfo")
	private String userInfo;
	/**
	 * 注册时间 column:Dateandtime_Reg
	 */
	@Column(name = "Dateandtime_Reg")
	private Date dateandtimeReg;

	/**
	 * 用户最后登录时间 column:Dateandtime_Login
	 */
	@Column(name = "Dateandtime_Login")
	private Date dateandtimeLogin;

	/**
	 * 用户注册IP column:UserIp_Login
	 */
	@Column(name = "UserIp_Login")
	private String userIpLogin;

	/**
	 * 用户验证状态 column:UserState 备注：用户验证状态,0为未验证,1为已验证
	 */
	@Column(name = "UserState")
	private String userState;

	/**
	 * 订单ID 
	 */
	@OneToMany(mappedBy="member")
	List<MemberOrder> memberOrders= new ArrayList<MemberOrder>();
	
	/**
	 * 优惠卷ID
	 */
	@OneToMany(mappedBy="member")
	List<Coupons> coupons= new ArrayList<Coupons>();
	
	public List<Coupons> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<Coupons> coupons) {
		this.coupons = coupons;
	}

	public List<MemberOrder> getMemberOrders() {
		return memberOrders;
	}

	public void setMemberOrders(List<MemberOrder> memberOrders) {
		this.memberOrders = memberOrders;
	}

	public int getFdId() {
		return fdId;
	}

	public void setFdId(int fdId) {
		this.fdId = fdId;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getiDCard() {
		return iDCard;
	}

	public void setiDCard(String iDCard) {
		this.iDCard = iDCard;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWebChat() {
		return webChat;
	}

	public void setWebChat(String webChat) {
		this.webChat = webChat;
	}

	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}

	public Date getDateandtimeReg() {
		return dateandtimeReg;
	}

	public void setDateandtimeReg(Date dateandtimeReg) {
		this.dateandtimeReg = dateandtimeReg;
	}

	public Date getDateandtimeLogin() {
		return dateandtimeLogin;
	}

	public void setDateandtimeLogin(Date dateandtimeLogin) {
		this.dateandtimeLogin = dateandtimeLogin;
	}

	public String getUserIpLogin() {
		return userIpLogin;
	}

	public void setUserIpLogin(String userIpLogin) {
		this.userIpLogin = userIpLogin;
	}

	public String getUserState() {
		return userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}
}
