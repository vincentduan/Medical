<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<!-- Import google fonts -->
      <link href="http://fonts.useso.com/css?family=Open+Sans:300,400,600,700,800|Shadows+Into+Light" rel="stylesheet" type="text/css" />
<!-- Favicon and touch icons -->
<link rel="shortcut icon" href="<%=basePath%>resources/theme/assets/ico/favicon.ico" type="image/x-icon" />
<link rel="apple-touch-icon" href="<%=basePath%>resources/theme/assets/ico/apple-touch-icon.png" />
<link rel="apple-touch-icon" sizes="57x57" href="<%=basePath%>resources/theme/assets/ico/apple-touch-icon-57x57.png" />
<link rel="apple-touch-icon" sizes="72x72" href="<%=basePath%>resources/theme/assets/ico/apple-touch-icon-72x72.png" />
<link rel="apple-touch-icon" sizes="76x76" href="<%=basePath%>resources/theme/assets/ico/apple-touch-icon-76x76.png" />
<link rel="apple-touch-icon" sizes="114x114" href="<%=basePath%>resources/theme/assets/ico/apple-touch-icon-114x114.png" />
<link rel="apple-touch-icon" sizes="120x120" href="<%=basePath%>resources/theme/assets/ico/apple-touch-icon-120x120.png" />
<link rel="apple-touch-icon" sizes="144x144" href="<%=basePath%>resources/theme/assets/ico/apple-touch-icon-144x144.png" />
<link rel="apple-touch-icon" sizes="152x152" href="<%=basePath%>resources/theme/assets/ico/apple-touch-icon-152x152.png" />

   <!-- start: CSS file-->

<!-- Vendor CSS-->
<link href="<%=basePath%>resources/theme/assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<link href="<%=basePath%>resources/theme/assets/vendor/skycons/css/skycons.css" rel="stylesheet" />
<link href="<%=basePath%>resources/theme/assets/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" />

<!-- Plugins CSS-->		
<link href="<%=basePath%>resources/theme/assets/plugins/bootkit/css/bootkit.css" rel="stylesheet" />	
<link href="<%=basePath%>resources/theme/assets/plugins/scrollbar/css/mCustomScrollbar.css" rel="stylesheet" />
<link href="<%=basePath%>resources/theme/assets/plugins/fullcalendar/css/fullcalendar.css" rel="stylesheet" />
<link href="<%=basePath%>resources/theme/assets/plugins/jquery-ui/css/jquery-ui-1.10.4.min.css" rel="stylesheet" />
<link href="<%=basePath%>resources/theme/assets/plugins/xcharts/css/xcharts.min.css" rel="stylesheet" />
<link href="<%=basePath%>resources/theme/assets/plugins/morris/css/morris.css" rel="stylesheet" />

<!-- Theme CSS -->
<link href="<%=basePath%>resources/theme/assets/css/jquery.mmenu.css" rel="stylesheet" />

<!-- Page CSS -->		
<link href="<%=basePath%>resources/theme/assets/css/style.css" rel="stylesheet" />
<link href="<%=basePath%>resources/theme/assets/css/add-ons.min.css" rel="stylesheet" />

<!-- end: CSS file-->	
   

<!-- Head Libs -->
<script src="<%=basePath%>resources/theme/assets/plugins/modernizr/js/modernizr.js"></script>
