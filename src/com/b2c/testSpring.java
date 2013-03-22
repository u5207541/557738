package com.b2c;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.b2c.model.Member;
import com.b2c.service.IbaseService;
import com.b2c.service.MemberService;

public class testSpring {
	private MemberService memberService;
	


	public MemberService getMemberService() {
		return memberService;
	}



	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}



	public static void main(String[] args) throws Exception {
		ApplicationContext  applicationContext = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext2.xml" });
		BeanFactory factory = (BeanFactory) applicationContext;
		IbaseService memberService = (IbaseService) applicationContext.getBean("memberService");
		Member member = new Member();
		member.setBirthday("sfsdf");
		member.setAddress("江西省南昌市");
		memberService.add(member);
	}
}
