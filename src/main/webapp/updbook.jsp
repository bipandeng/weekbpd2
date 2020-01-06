<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css3/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
   <form onsubmit="return false" id="form">
  编号: <input type="text" name="bid" value="${book.bid }"><br>
  关键字: <input type="text" name="bname" value="${book.bname }"><br>
  描述: <input type="text" name="bdesc" value="${book.bdesc }"><br>
 公司名称:  <input type="text" name="bcname" value="${book.bcname }"><br>
  主营产品 <input type="text" name="product" value="${book.product }"><br>
 地址:  <input type="text" name="address" value="${book.address }"><br>
 注册资本（万元）:  <input type="text" name="price" value="${book.price }"><br>
  成立时间: <input type="text" name="bctime" value="${book.bctime }"><br>
 年检时间 : <input type="text" name="bjtime" value="${book.bjtime }"><br>
 年检状态 : 
      <select name="status">
       <option value="1">审核通过</option>
       <option value="0">审核不通过</option>
       <option value="2">待定</option>
      </select>
 
 备注:  <input type="text" name="log" value="${book.log }"><br>
 <input type="button" onclick="go()" value="提交审核">
   </form>
   <script type="text/javascript">
   function go(){
	   $.post("updBook",$("#form").serialize(),function(msg){
		   if(msg){
			   alert("审核成功");
			   history.go(-1)
		   }else{
			   alert("审核失败");
		   }
	   },"json")
   }
   </script>
</body>
</html>