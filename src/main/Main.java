package main;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Student;

public class Main 
{

	public static void main(String[] args) 
	{
		testSqlSessionTemplate();
	}

	public static void testSqlSessionTemplate() 
	{
		//spring-config.xml像下面这样写是放在src文件夹里面，不是工程文件夹里面！（即不是和src在同一个目录下）
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		SqlSessionTemplate sqlSessionTemplate = ctx.getBean(SqlSessionTemplate.class);
		Student student = new Student();
		
		student = sqlSessionTemplate.selectOne("mapper.StudentMapper.selectStudentById", 1);
		
		System.out.print(student);
		
	}
}
