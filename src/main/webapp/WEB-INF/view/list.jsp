<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<LINK href="/resources/css/bootstrap.min.css" type="text/css" rel="stylesheet">
<script src="/resources/js/jquery-3.2.1.js" type="text/javascript"></script>
<script src="/resources/js/bootstrap.min.js" type="text/javascript"></script>
</head>
<body>

<form action="list" method="post">
<br>
&nbsp;发表日期：<input type="text" name="d1" value="" > 至 <input type="text" name="d2" value="" >

&nbsp;<input type="submit" value="查询">

<select name="qt" onchange="reselect()">
	<option value="0"  >--请选择--<option/>
	<option value="1" id="time" >时间<option/>
	<option value="2" id="channel" >作者<option/>
</select>


<table class="table table-dark">



  <tr>
    <th>编号</th>
    <th>标题</th>
    <th>内容</th>
    <th>作者</th>
    <th>类型</th>
    <th>发表时间</th>
  </tr>
  <c:forEach items="${info.list }" var="list">
  <tr>
    <td>${list.id }</td>
    <td>${list.title }</td>
    <td>${list.content }</td>
    <td>${list.user.username }</td>
    <td>${list.category }</td>
    <td>${list.created }</td>
    
  </tr>
  </c:forEach>
</table>
${page }
</form>


<script type="text/javascript">

 
   function reselect(){
	   var options=$("option:selected"); 
	  alert(options.val());
	  if(options.val()==1){
		  location="list2";  
	  }
	  if(options.val()==2){
		  location="list3";  
	  }
   }


</script>

</body>
</html>