<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result</title>
</head>
<body>

	<h1 style="color: gray">
		<font size="4">Operation: ${operationDone}</font>
	</h1>
	
	<c:set var="pastCit" value="0"/>
	
	<c:forEach var="item" items="${journalTitles}" varStatus="status1">
	
		<c:set var="NPub" value="${status1.index+1}"/>
		<div><font size="5">Publication: ${NPub}</font></div>
	
		<table width="100%" border="2" align="center">
			<c:forEach var="item1" items="${journalFields}" varStatus="status2">
				<c:set var="NField" value="${flagNewPub[status1.index]+status2.index}"/>
				<tr>
					<th bgcolor="#eff5f5"><span style="color: #008080">${item1}</span></th><th align="left">${journalInfo[NField]}</th>
				</tr>
			</c:forEach>
		</table>
		
		<c:choose>
   			<c:when test="${infoOption == '1'}">
   				
   				<table width="100%" border="2" align="center">
   					<tr bgcolor="#b1cdcd">
						<th>Number</th><th>Cited by:</th>
					</tr>
					
					<c:set var="START" value="${flagNewCit[status1.index]+ pastCit}"/>
					<c:set var="END" value="${START + flagNewCit[status1.index+1]}"/>
					<c:forEach begin="${START}" end="${END-1}" varStatus="status3">
						<tr>
							<th bgcolor="#58FAF4">${status3.index + 1 - START}</th><th align="left">${listCitations[status3.index]}</th>
						</tr>
					</c:forEach>
				</table>
				
				<c:set var="pastCit" value="${flagNewCit[status1.index]+pastCit}"/>
			</c:when>
		</c:choose>
		
		<br/>
	</c:forEach>

</body>
</html>