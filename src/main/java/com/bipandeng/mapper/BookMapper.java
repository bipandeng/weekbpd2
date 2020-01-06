package com.bipandeng.mapper;
import java.util.List;
import java.util.Map;

import com.bipandeng.bean.Book;
public interface BookMapper {

	//添加数据
	void addBook(Book book);

	//查询列表
	public  List<Book> queryBook(Map<String, Object> map);
	//回显
	public  Book showBookOne(Integer bid);
	//修改
	public  int  updBook(Book book);
	

}
