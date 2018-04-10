<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th><s:text name="ID" /></th>
			<th><s:text name="name" /></th>
			<th><s:text name="kind" /></th>
			<th><s:text name="操作"/></th>
		</tr>
		<s:iterator value="stateList" var="state">
			<tr>
				<td><s:property value="stateID" /></td>
				<td><s:property value="stateName" /></td>
				<td><s:property value="stateKind" /></td>
				<s:url var="delaction" action="delState.action">
				<s:param name="id" value="%{stateID}"></s:param>
				<s:param name="kind" value="%{stateKind}"></s:param>
					<s:param name="name" value="%{stateName}"></s:param>
				</s:url>
				<s:url var="upaction" value="setStateValue.action">
				<s:param name="id" value="%{stateID}"></s:param>
				<s:param name="kind" value="%{stateKind}"></s:param>
					<s:param name="name" value="%{stateName}"></s:param>
				</s:url>
				<td>
				<s:a href="%{delaction}">删除</s:a>
				<s:a href="%{upaction}">修改</s:a>
				</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>