package com.mashensoft.model;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.mashensoft.util.MyBatisSqlSessionFactory;

public class Test {
	static Logger logger = Logger.getLogger(Test.class);
	public static void main(String[] args) {
		logger.debug("这是我的THIS IS MYBATIS");
		
		
		UserMapper um = MyBatisSqlSessionFactory.getSession().getMapper(UserMapper.class);
		List<User> list = um.findAllUsers();
		System.out.println(list.size());
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			User user = (User) iterator.next();
			System.out.println(user.getUsername()+","+user.getPassword());
		}
	}

}
