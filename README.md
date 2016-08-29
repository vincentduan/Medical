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
	查询科室id为1的所有医生
	URL:http://localhost:8080/Medical/doctor/findDoctorsByDepartment?departmentid=1
	POST: category: ""
	return [{"id":1,"username":"姓名","password":"密码","accounttype":"账户类型","isrealname":"是否为真实姓名","licensenum":"医师执照id","telphone":"手机号","status":"状态","role":"用户角色","email":"2546469650@qq.com","hospital":"医院","department":科室id,"brief":"简介","info":"信息","score":评分,"fansnum":粉丝数,"price":价格,"advantage":"擅长","background":"北京","achievement":"成就","avatar":头像路径,"createtime":添加时间,"updatetime":修改时间,"isdel":是否删除,"englishname":"英文名","education":"教育程度","workingexp":"工作经验","haspersonalclinic":"是否有个人诊所","personalclinicinfo":"诊所信息"},{"id":2,"username":"doc2","password":"222","accounttype":"2","isrealname":"2","licensenum":"2313","telphone":"22222","status":"2","role":"2","email":"222","hospital":"11q","department":1,"brief":"df","info":"ss","score":20.00,"fansnum":99,"price":80,"advantage":"xinzang","background":"w","achievement":"sf","avatar":null,"createtime":null,"updatetime":null,"isdel":false,"englishname":"suck","education":"nuc","workingexp":"sdf","haspersonalclinic":"wf","personalclinicinfo":"f"}]
7. 获得所有医生
	URL：http://localhost:8080/Medical/doctor/findAllDoctors
	return [{"id":1,"username":"姓名","password":"密码","accounttype":"账户类型","isrealname":"是否为真实姓名","licensenum":"医师执照id","telphone":"手机号","status":"状态","role":"用户角色","email":"2546469650@qq.com","hospital":"医院","department":科室id,"brief":"简介","info":"信息","score":评分,"fansnum":粉丝数,"price":价格,"advantage":"擅长","background":"北京","achievement":"成就","avatar":头像路径,"createtime":添加时间,"updatetime":修改时间,"isdel":是否删除,"englishname":"英文名","education":"教育程度","workingexp":"工作经验","haspersonalclinic":"是否有个人诊所","personalclinicinfo":"诊所信息"},{"id":2,"username":"doc2","password":"222","accounttype":"2","isrealname":"2","licensenum":"2313","telphone":"22222","status":"2","role":"2","email":"222","hospital":"11q","department":1,"brief":"df","info":"ss","score":20.00,"fansnum":99,"price":80,"advantage":"xinzang","background":"w","achievement":"sf","avatar":null,"createtime":null,"updatetime":null,"isdel":false,"englishname":"suck","education":"nuc","workingexp":"sdf","haspersonalclinic":"wf","personalclinicinfo":"f"}]
8.登录：http://localhost:8080/Medical/index/login?telphone=15812345678&password=222
失败：
{"user":null,"status":"101","message":"wrong telphone or password"}	
成功：
{"user":{"id":1,"username":"abc","password":"111","telphone":"15812345678","isVip":null,"accounttype":"1","balance":null,"isrealname":null,"status":null,"createtime":null,"updatetime":null,"role":null,"email":null,"brief":null,"info":null,"gender":null,"birthday":null,"isdel":false},"status":"100","message":"success"}
9.注册：http://localhost:8080/Medical/index/register?telphone=15812345677&password=111&username=vin
成功：{"user":{"id":null,"username":"vin","password":"111","telphone":"15812345677","isVip":null,"accounttype":null,"balance":null,"isrealname":null,"status":null,"createtime":null,"updatetime":null,"role":null,"email":null,"brief":null,"info":null,"gender":null,"birthday":null,"isdel":null},"status":"103","message":"success"}
失败：
{"user":null,"status":"104","message":"username or telphone have already exist"}

