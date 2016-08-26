<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>CMS</title>

<%@include file="/WEB-INF/cms/common/head.jsp"%>
<%@include file="/WEB-INF/cms/common/taglib.jsp"%>
<jsp:include page="/WEB-INF/cms/common/themeHead.jsp"></jsp:include>
<script type="text/javascript" src="<%=basePath%>resources/js/jquery.validate.js"></script>
<script type="text/javascript">
$(function(){
	
});
</script>
<style type="text/css">
.valerror{
color: #a94442;
}
</style>
</head>
<body>
		<jsp:include page="/WEB-INF/cms/common/navbar.jsp"></jsp:include>
		<div class="copyrights">医生后台管理系统</a></div>
		<!-- Start: Content -->
		<div class="container-fluid content">	
			<div class="row">
			
				<jsp:include page="/WEB-INF/cms/common/sidebar.jsp"></jsp:include>
		
				<!-- Main Page -->
				<div class="main ">
					<!-- Page Header -->
					<div class="page-header">
						<div class="pull-left">
							<ol class="breadcrumb visible-sm visible-md visible-lg">								
								<li><a href="index.html"><i class="icon fa fa-home"></i>Home</a></li>
								<li class="active"><i class="fa fa-list-alt"></i>文章管理</li>
							</ol>						
						</div>
						<div class="pull-right">
							<h2>Article</h2>
						</div>					
					</div>
					<!-- End Page Header -->								
					<div class="row">
						<div class="col-md-3">
						</div>
						<div class="col-md-6">
							<div class="panel">
								<div class="panel-heading bk-bg-primary">
									<h6><i class="fa fa-indent red"></i>添加文章</h6>							
								</div>
								<div class="panel-body">
									<form id="formAdd" action="<%=basePath%>cms/article/modify" method="post" class="form-horizontal form-bordered">
										<input type="hidden" id="id" name="id" value="${article.id}">
										<div class="form-group">
											<label class="col-md-2 control-label">文章标题</label>
											<div class="col-md-10">
												<input type="text" id="title" name="title" class="form-control" value="${article.title }" placeholder="title">
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-2 control-label" for="text-input">文章分类</label>
											<div class="col-md-10">
												<input type="text" id="category" name="category" class="form-control" value="${article.category}" placeholder="category">
											</div>
										</div>
										<div class="form-group">
											<div class="col-md-1"></div>
											<div class="col-md-11">
												<script id="content" name="content" type="text/plain">${article.document}</script>
											</div>
										</div>
										<div class="form-group">
											<div class="col-md-5"></div>
											<div class="col-md-7">
												<button onclick="submit()" class="bk-margin-5 btn btn-default" ><c:if test="${empty article.id }">添加文章</c:if><c:if test="${!empty article.id }">修改文章</c:if></button>
											</div>
										</div>
										<br>
									</form>
								</div>	
							</div>	
						</div>
					</div>
				</div>
				<!-- End Main Page -->
			</div>
		</div><!--/container-->
		<div class="clearfix"></div>
		
<jsp:include page="/WEB-INF/cms/common/themeFoot.jsp"></jsp:include>	
<script type="text/javascript" src="<%=basePath%>resources/js/form-validate.js"></script>
<!-- 实例化编辑器 -->
<script src="<%=basePath%>resources/ueditor/ueditor.config.js" charset="utf-8" type="text/javascript"></script>
<script src="<%=basePath%>resources/ueditor/ueditor.all.js" type="text/javascript" charset="utf-8" > </script>
<script type="text/javascript" charset="utf-8" src="<%=basePath%>resources/ueditor/lang/zh-cn/zh-cn.js"></script>
<script type="text/javascript">
	var ue = UE.getEditor("content",{
	    toolbars: [
	               ['fullscreen', 'source', '|', 'undo', 'redo', '|',
	                'bold', 'italic', 'underline', 'fontborder', 'superscript', 'subscript', 'removeformat', 'formatmatch', 'pasteplain', '|', 'forecolor', 'backcolor', 'insertorderedlist', 'insertunorderedlist', '|',
	                'rowspacingtop', 'rowspacingbottom', 'lineheight', '|',
	                'customstyle', 'paragraph', 'fontfamily', 'fontsize', '|',
	                'justifyleft', 'justifycenter', 'justifyright', 'justifyjustify', '|',
	                'link', 'unlink','|',
	                'simpleupload','|',
	                'preview']
	           ],
	           autoHeightEnabled: true,
	           autoFloatEnabled: true
	});
	function submit() {
        var content = ue.getContent();
        var id = $("#id").val();
        var title = $("#title").val();
        var category = $("#category").val();
        $.ajax({
        	  type: "POST",
        	  url: "<%=basePath%>cms/article/modify",
        	  data: {id:id,title:title,category:category,content:content},
        	  success: success,
        	  dataType: dataType
        	});
    }
</script>
</body>
</html>