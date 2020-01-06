package com.bipandeng.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bipandeng.bean.Book;
import com.bipandeng.mapper.BookMapper;

@Service
public class BookServiceImpl implements BookService{

	@Resource
	private BookMapper bookMapper ;
	public List<Book> queryBook(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return bookMapper.queryBook(map);
	}
	public Book showBookOne(Integer bid) {
		// TODO Auto-generated method stub
		return bookMapper.showBookOne(bid);
	}
	public int updBook(Book book) {
		// TODO Auto-generated method stub
		return bookMapper.updBook(book);
	}

}
