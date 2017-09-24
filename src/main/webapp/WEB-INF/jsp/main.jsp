<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.css" rel="stylesheet">
<title>全唐诗搜索</title>
</head>
<body>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<img alt="140x140" src="${pageContext.request.contextPath}/img/logo.png" />
		</div>
	</div>
	<div class="row clearfix" style="margin-top: 20px; ">
		<div class="col-md-3 column">
			<form role="form" action="${pageContext.request.contextPath}/search" method="get" target="main_iframe">
				<div class="form-group">
			    	<select class="form-control" name="way">
			      		<option value="name">诗人名称检索</option>
			      		<option value="title">诗名检索</option>
			      		<option value="content">名句检索</option>
			    	</select> 
			  	</div>
			  	<div class="form-group">
					<input type="text" class="form-control" id="searchContent" name="searchContent" placeholder="请输入要检索的内容">
				</div>
				<input type="hidden" name="pageNo" value="1" />
				<div class="form-group">
					<input type="submit" class="btn btn-default" value="检索">
				</div>
				
		  	</form>
		</div>
		<div class="col-md-9 column">
			<iframe frameborder="1" name="main_iframe" src="${pageContext.request.contextPath}/center" width="100%" height="500px"></iframe>
			
		</div>
	</div>
</div>
</body>
</html>