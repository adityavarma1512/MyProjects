package com.prismit.student.handler;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prismit.student.dao.StudentDaoImpl;

public class StudentTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDaoImpl studentDaoImpl = context.getBean("studentDao", StudentDaoImpl.class);
		//StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
  
		studentDaoImpl.getstudentlist();
		context.close();
	} 
	
}
