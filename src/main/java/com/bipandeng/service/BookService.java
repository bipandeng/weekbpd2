package com.bipandeng.service;

import java.util.List;
import java.util.Map;

import com.bipandeng.bean.Book;

public interface BookService {

	public List<Book> queryBook(Map<String, Object> map);

	// 回显
	public Book showBookOne(Integer bid);

	// 修改
	public int updBook(Book book);
}
