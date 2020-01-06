package com.bpd;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bipandeng.bean.Book;
import com.bipandeng.mapper.BookMapper;
import com.bw.utils.IOUtils;
import com.bw.utils.StringUtil;

public class TestInfo {

	private static final String Book = null;

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookMapper mapper = ac.getBean(BookMapper.class);
		
		List<Object[]> list = IOUtils.readFile("src//a.txt", "\t");

		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));

			// a.id值要使用isNumber()工具方法判断是不是数字（3分）
			if (!StringUtil.isNumber(objects[0] + "")) {
				System.out.println("id值要使用isNumber()工具方法判断是不是数字");
			} else if (StringUtil.isEmpty(objects[6] + "") ) {
				
				 //* 注册资本要使用hasText()方法判断有没有值，并使用 isNumber()判断是不是数字
				 
				System.out.println("为空");
			}else if (!StringUtil.isNumber(objects[6] + "")) {
				
				 //* 注册资本要使用hasText()方法判断有没有值，并使用 isNumber()判断是不是数字
				 
				System.out.println("不是数字");
			} else if (StringUtil.isEmpty(objects[2] + "")) {
				/*
				 * keywords 、description、公司名称、主营产品、地址要使用 hasText()方法判断有没有值
				 */
				System.out.println("描述为空");
			} else if (StringUtil.isEmpty(objects[1] + "")) {
				System.out.println("关键字为空");
			} else if (StringUtil.isEmpty(objects[4] + "")) {
				System.out.println("主营产品为空");
			} else if (StringUtil.isEmpty(objects[5] + "")) {
				System.out.println("地址为空");
				/**
				 * d.年检日期为null，在前端必须显示为空，不能显示null（3分） c.
				 * 成立时间要使用hasText()方法判断有没有值,判断是不是日期 类型（3分）
				 */
			} else if (StringUtil.isEmpty(objects[7] + "")) {
				System.out.println("成立时间为空");
			} else {
				/**
				 * objects[0]编号 objects[1]关键字 objects[2]描述 objects[3]公司名称
				 * objects[4]主营产品 objects[5]地址 objects[6]注册资本 objects[7]成立时间
				 * 
				 */
				/*
				 * d.将集合对象中每个年检对象通过MyBatis保存到数据库。总共316 行，少一行扣2分，最多扣20分(6分)
				 */
				Book book = new  Book(Integer.parseInt(objects[0]+""), objects[1]+"", objects[2]+"", objects[3]+"", objects[4]+"", objects[5]+"", Double.parseDouble(objects[6]+""),objects[7]+"");
				mapper.addBook(book);
			}

		}
	}
}
