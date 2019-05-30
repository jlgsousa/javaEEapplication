<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Catalog of scientific journals</title>
</head>
<body>

	<h1 style="text-align:center">Welcome to the scientific journal catalogue</h1>
	<h2 style="text-align:center">Property of João Sousa</h2>
	<h1 style="color: gray">
		<font size="4">Operations</font>
	</h1>
	
	<form action="main" method="post">
	<table width="100%" border="1" align="center">
		<tr bgcolor="#00e6e6"><th>Action</th><th>Perform</th></tr>
		
		<tr><th>All publications, detailed info (without citations)</th>
		<th><input type="submit" name="action1" value="Search" /></th></tr>
		
		<tr><th>One publication, detailed info (without citations)</th>
		<th>Title: <select name="action2" >
			<c:forEach var="itemTitle" items="${myListOfTitles}" varStatus="loop1">
				<option>${itemTitle}</option>
			</c:forEach>
		</select>
		<input type = "submit" name="action21" value="Search" /></th></tr>
		
		<tr><th>One publication, all citations</th>
		<th>Title: <select name="action3" >
			<c:forEach var="itemTitle" items="${myListOfTitles}" varStatus="loop1">
				<option>${itemTitle}</option>
			</c:forEach>
		</select>
		<input type = "submit" name="action31" value="Search" /></th></tr>
		
		<tr><th>All publications, all info</th>
		<th><input type = "submit" name="action4" value="Search" /></th></tr>
		
		<tr><th>All publications, all info, by attribute</th>
		<th>Attribute: <select name="action51">
			<option>title</option>
			<option>authors</option>
			<option>conference</option>
			<option>description</option>
			<option>journal</option>
			<option>publisher</option>
			<option>scholar_artic</option>
			<option>date</option>
			<option>issue</option>
			<option>n_citations</option>
		</select>
		Order by: <select name="action52">
			<option>ASC</option>
			<option>DESC</option>
		</select>
		<input type = "submit" name="action53" value="Search" /></th></tr>
		
		<tr><th>One publication, all info</th>
		<th>Title: <select name="action6" >
			<c:forEach var="itemTitle" items="${myListOfTitles}" varStatus="loop1">
				<option>${itemTitle}</option>
			</c:forEach>
		</select>
		<input type = "submit" name="action61" value="Search" /></th></tr>
		
	</table>
	</form>
	
	<br />
	
	<h1 style="color: gray">
		<font size="4">Journal Titles</font>
	</h1>
	<table width="100%" border="1" align="center">
		<tr bgcolor="#00e6e6">
			<th>Number</th><th>Title of Publication</th>
		</tr>
		<c:forEach var="item" items="${myListOfTitles}" varStatus="loop">  
			<tr>
				<th>${loop.index+1}</th><th>${item}</th>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
