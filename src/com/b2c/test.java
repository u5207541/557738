package com.b2c;

import org.hibernate.Session;

import com.b2c.util.HibernateSessionFactory;

public class test {
	public static void main(String[] args) {
		Session s=HibernateSessionFactory.getSession();
	}
}
