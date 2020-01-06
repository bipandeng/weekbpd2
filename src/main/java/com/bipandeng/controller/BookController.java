package com.bipandeng.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bipandeng.bean.Book;
import com.bipandeng.service.BookService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class BookController {

	@Resource
	private BookService bookService;

	
	//回显
	@RequestMapping("showBook")
	public  String  showBook(Integer bid,Model mod){
		 Book book = bookService.showBookOne(bid);
		 mod.addAttribute("book", book);
		 return "updbook";
	}
	//修改
	@RequestMapping("updBook")
	@ResponseBody
	public  Boolean updbook(Book book){
		 if(book.getStatus()==1){
			 int i = bookService.updBook(book);
			  if(i>0){
				  return  true;
			  } 
		 }
		  return false;
	}
	// 查询
	@RequestMapping("list")
	public String queryBook(Model mod, @RequestParam(defaultValue = "1") Integer pageNum, Integer bid, String bname,
			String bdesc, String bcname, String product, String address, String price, String status, String s1,
			String s2, String e1, String e2) {
		PageHelper.startPage(pageNum, 3);
		Map<String, Object> map = new HashMap<String, Object>();
        map.put("bid", bid);
        map.put("bname", bname);
        map.put("bdesc", bdesc);
        map.put("bcname", bcname);
        map.put("product", product);
        map.put("address", address);
        map.put("price", price);
        map.put("status", status);
        map.put("s1", s1);
        map.put("s2", s2);
        map.put("e1", e1);
        map.put("e2", e2);
		List<Book> list = bookService.queryBook(map);
		PageInfo<Book> pp = new PageInfo<Book>(list);
		mod.addAttribute("pp", pp);
		mod.addAttribute("map", map);
		return "listBook";
	}
}
