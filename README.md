Medical
======

##接口：
1. 引导图：
	URL：http://localhost:8080/Medical/index/guidePic 
	return:["http://localhost:8080/Medical/resources/image/guide_pic1.jpg","http://localhost:8080/Medical/resources/image/guide_pic2.jpg"]
2.登录：http://localhost:8080/Medical/index/login?telphone=15812345678&password=222
失败：
{"user":null,"status":"101","message":"wrong telphone or password"}	
成功：
{"user":{"id":1,"username":"abc","password":"111","telphone":"15812345678","isVip":null,"accounttype":"1","balance":null,"isrealname":null,"status":null,"createtime":null,"updatetime":null,"role":null,"email":null,"brief":null,"info":null,"gender":null,"birthday":null,"isdel":false},"status":"100","message":"success"}
3.注册：http://localhost:8080/Medical/index/register?telphone=15812345677&password=111&username=vin
成功：{"user":{"id":null,"username":"vin","password":"111","telphone":"15812345677","isVip":null,"accounttype":null,"balance":null,"isrealname":null,"status":null,"createtime":null,"updatetime":null,"role":null,"email":null,"brief":null,"info":null,"gender":null,"birthday":null,"isdel":null},"status":"103","message":"success"}
失败：
{"user":null,"status":"104","message":"username or telphone have already exist"}
4.获得所有医生http://101.200.233.227:8080/Medical/doctor/findAllDoctors
5.获得所有文章http://101.200.233.227:8080/Medical/article/findAllArticles

