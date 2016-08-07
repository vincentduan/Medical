<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<!-- start: JavaScript-->
		
		<!-- Vendor JS-->				
		<script src="<%=basePath%>resources/theme/assets/vendor/js/jquery.min.js"></script>
		<script src="<%=basePath%>resources/theme/assets/vendor/js/jquery-2.1.1.min.js"></script>
		<script src="<%=basePath%>resources/theme/assets/vendor/js/jquery-migrate-1.2.1.min.js"></script>
		<script src="<%=basePath%>resources/theme/assets/vendor/bootstrap/js/bootstrap.min.js"></script>
		<script src="<%=basePath%>resources/theme/assets/vendor/skycons/js/skycons.js"></script>		
		
		<!-- Plugins JS-->		
		<script src="<%=basePath%>resources/theme/assets/plugins/jquery-ui/js/jquery-ui-1.10.4.min.js"></script>
		<script src="<%=basePath%>resources/theme/assets/plugins/scrollbar/js/jquery.mCustomScrollbar.concat.min.js"></script>
		<script src="<%=basePath%>resources/theme/assets/plugins/bootkit/js/bootkit.js"></script>
		<script src="<%=basePath%>resources/theme/assets/plugins/moment/js/moment.min.js"></script>	
		<script src="<%=basePath%>resources/theme/assets/plugins/fullcalendar/js/fullcalendar.min.js"></script>
		<script src="<%=basePath%>resources/theme/assets/plugins/touchpunch/js/jquery.ui.touch-punch.min.js"></script>
		<script src="<%=basePath%>resources/theme/assets/plugins/flot/js/jquery.flot.min.js"></script>
		<script src="<%=basePath%>resources/theme/assets/plugins/flot/js/jquery.flot.pie.min.js"></script>
		<script src="<%=basePath%>resources/theme/assets/plugins/flot/js/jquery.flot.resize.min.js"></script>
		<script src="<%=basePath%>resources/theme/assets/plugins/flot/js/jquery.flot.stack.min.js"></script>
		<script src="<%=basePath%>resources/theme/assets/plugins/flot/js/jquery.flot.time.min.js"></script>
		<script src="<%=basePath%>resources/theme/assets/plugins/xcharts/js/xcharts.min.js"></script>
		<script src="<%=basePath%>resources/theme/assets/plugins/autosize/jquery.autosize.min.js"></script>
		<script src="<%=basePath%>resources/theme/assets/plugins/placeholder/js/jquery.placeholder.min.js"></script>
		<script src="<%=basePath%>resources/theme/assets/plugins/datatables/js/dataTables.bootstrap.min.js"></script>
		<script src="<%=basePath%>resources/theme/assets/plugins/datatables/js/jquery.dataTables.min.js"></script>
		<script src="<%=basePath%>resources/theme/assets/plugins/raphael/js/raphael.min.js"></script>
		<script src="<%=basePath%>resources/theme/assets/plugins/morris/js/morris.min.js"></script>
		<script src="<%=basePath%>resources/theme/assets/plugins/gauge/js/gauge.min.js"></script>		
		<script src="<%=basePath%>resources/theme/assets/plugins/d3/js/d3.min.js"></script>		
		
		<!-- Theme JS -->		
		<script src="<%=basePath%>resources/theme/assets/js/jquery.mmenu.min.js"></script>
		<script src="<%=basePath%>resources/theme/assets/js/core.min.js"></script>
		
		<!-- Pages JS -->
		<script src="<%=basePath%>resources/theme/assets/js/pages/index.js"></script>
		
		<!-- end: JavaScript-->
