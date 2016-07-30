Medical
======

##接口：
1. 引导图：
	URL：http://localhost:8080/Medical/index/guidePic 
	return:["http://localhost:8080/Medical/resources/image/guide_pic1.jpg","http://localhost:8080/Medical/resources/image/guide_pic2.jpg"]
2. 首页：
	URL：http://localhost:8080/Medical/index/main
	return：["fenlei1","fenlei2"]
3. 注册：
	URL：http://localhost:8080/Medical/customer/regist  
	POST：username："abc",password:"123" 
	return:成功{"status":"100"} 失败：{"status":"101"}
4. 登录：
	URL：http://localhost:8080/Medical/customer/login?username="%abc"
	return："username"
5. 忘记密码
	URL：http://localhost:8080/Medical/customer/forgetPassword  
	POST：telphone：""
	return 可以修改：{"status":"1001"} 不可以修改：{"status":"1002"}
6. 根据分类找医生：
	URL:http://localhost:8080/Medical/doctor/findDoctorByCategory
	POST: category: ""
	return {"category":"","doctor1":{"name":""},"doctor2":{"name":""}}
