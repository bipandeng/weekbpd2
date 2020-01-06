<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css3/css.css" rel="stylesheet">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<table>
<!-- a. id编号模糊查询（2分）
b. keywords模糊查询（2分）
c. description模糊查询（2分）
d. 公司名称模糊查询（2分）
e. 主营产品模糊查询（2分）
f. 地址模糊查询（2分）
g. 注册资本范围查询（2分）
h. 成立时间范围查询（2分）
i. 年检日期范围查询（2分）
j. 年检状态选择查询，手工输入计0（2分） -->
	
	    <tr>
	    <td colspan="12">
	    <form action="list" method="post">
	    编号:<input type="text" name="bid" value="${map.bid }">
	    关键字:<input type="text" name="bname" value="${map.bname }">
	    描述:<input type="text" name="bdesc" value="${map.bdesc }">
	    公司名称:<input type="text" name="bcname" value="${map.bcname }">
	    主营产品：<input type="text" name="product" value="${map.product }">
	    地址：<input type="text" name="address" value="${map.address }">
	    注册资本：<input type="text" name="price" value="${map.price }">
	    成立时间：<input type="text" name="s1" value="${map.s1 }">-<input type="text" name="e1" value="${map.e1 }">
	    年检日期范围：<input type="text" name="s2" value="${map.s2 }">-<input type="text" name="e2" value="${map.e2 }">
	    年检状态:<input type="text" name="status" value="${map.status }">
	    <input type="submit" value="搜索">
	    </form>
	    </td>
	    </tr>
		<tr>
			<th>编号</th>
			<th>关键字</th>
			<th>描述</th>
			<th>公司名称</th>
			<th>主营产品</th>
			<th>地址</th>
			<th>注册资本（万元）</th>
			<th>成立时间</th>
			<th>年检时间</th>
			<th>年检状态</th>
			<th>备注</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${pp.list }" var="tt">
			<tr>
				<td>${tt.bid}</td>
				<td>${tt.bname}</td>
				<td>${tt.bdesc}</td>
				<td>${tt.bcname}</td>
				<td>${tt.product}</td>
				<td>${tt.address}</td>
				<td>${tt.price}</td>
				<td>${tt.bctime}</td>
				<td>${tt.bjtime}</td>
				<td>${tt.status==0?"审核不通过":tt.status==1?"审核通过":"待定"}</td>
				<td>${tt.log}</td>
				<td>
				<a href="showBook?bid=${tt.bid}"><input type="button" value="年检审核"></a>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="12">
				<!-- 列表，包含所有字段，不全或者发生错误，计0（2分）
b.分页，格式为:总记录/总页数 页码编号系列 比如 2,3,4...
   跳转X页, 必须完整并正确,否则计0（3分）
     --> 总记录数:${pp.total } 总页数:${pp.pages } <a
				href="list?pageNum=${pp.prePage }"><<<</a> <c:forEach begin="1"
					end="${pp.pages }" step="1" var="e">
					<a href="list?pageNum=${e }">${e }</a>
				</c:forEach> <a href="list?pageNum=${pp.nextPage }">>>></a>
			</td>
		</tr>
	</table>

</body>
</html>