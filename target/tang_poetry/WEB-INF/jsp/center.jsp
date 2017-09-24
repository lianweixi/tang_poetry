<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>唐诗内容</title>
<style type="text/css">
.text {
	text-align: center;
	letter-spacing: 20px;
	font-size: large;
}
</style>
</head>
<body>
	<h2 style="text-align: center;">欢迎使用唐诗检索</h2>
	<div style="float: left; padding: 50px;">
		${msg}
		<c:forEach items="${poetries}" var="poetry">
			<div style="margin: 50px">
				<div class="text">《${poetry.title}》</div>
				<div class="text">${poetry.poet.name}</div>
				<div style="border-style: dashed; border-radius: 10px;">
					<c:forTokens items="${poetry.content}" delims="。 " var="subcontent">
						<c:choose>
							<c:when test="${fn:contains(subcontent,param.searchContent)}">
								<p class="text" style="color: red;">${subcontent}</p>
								<hr>
							</c:when>
							<c:otherwise>
								<p class="text">${subcontent}</p>
								<hr>
							</c:otherwise>
						</c:choose>
					</c:forTokens>
				</div>
			</div>
		</c:forEach>
		<div style="clear: both">
			<s:set name="pager" value="#request.page" />
			<s:set name="way" value="#request.way" />
			<s:set name="searchContent" value="#request.searchContent" />
			<s:if test="#pager.hasFirst">
				<a href="${pageContext.request.contextPath}/searchAction!search.action?pageNo=1&way=<s:property value="#way"/>&searchContent=<s:property  value="#searchContent"/>">首页</a>
			</s:if>
			<s:if test="#pager.hasPrevious">
				<a href="${pageContext.request.contextPath}/searchAction!search.action?pageNo=<s:property value="#pager.pageNo-1"/>&way=<s:property value="#way"/>&searchContent=<s:property value="#searchContent"/>">上一页</a>
			</s:if>
			<s:if test="#pager.hasNext">
				<a href="${pageContext.request.contextPath}/searchAction!search.action?pageNo=<s:property value="#pager.pageNo+1"/>&way=<s:property value="#way"/>&searchContent=<s:property value="#searchContent"/>">下一页</a>
			</s:if>
			<s:if test="#pager.hasLast">
				<a href="${pageContext.request.contextPath}/searchAction!search.action?pageNo=<s:property value="#pager.pageCount"/>&way=<s:property  value="#way"/>&searchContent=<s:property value="#searchContent"/>">尾页</a>
			</s:if>
<!-- 			<br> 当前第 -->
<%-- 			<s:property value="#pager.pageNo" /> --%>
<!-- 			页, 总共 -->
<%-- 			<s:property value="#pager.pageCount" /> --%>
<!-- 			页 -->
		</div>
	</div>
</body>
</html>