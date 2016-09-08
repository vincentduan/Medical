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
6.根据文章id获取文章详细信息，作者信息，浏览过这篇文章的用户信息，是否收藏了，浏览过这篇文章的用户还浏览过那些文章信息
http://101.200.233.227:8080/Medical/article/getArticleById?id=1
{"doctor":{"id":2,"username":"doc2","password":"222","accounttype":"1","isrealname":"2","licensenum":"2313","telphone":"22222","status":"1","role":"副主任","email":"222","hospital":"11q","department":"2","brief":"df","info":"ss","score":20.00,"fansnum":99,"price":80,"advantage":"xinzang","background":"w","achievement":"sf","avatar":null,"createtime":null,"updatetime":null,"englishname":"suck","workingexp":"sdf","haspersonalclinic":"1","personalclinicinfo":"f","isdel":false},"user":[{"id":1,"username":"abc","password":"111","telphone":"15812345678","isVip":null,"accounttype":"1","balance":null,"isrealname":null,"status":null,"role":null,"email":null,"brief":null,"info":null,"gender":null,"birthday":null,"createtime":null,"updatetime":null,"isdel":false},{"id":2,"username":"vin","password":"111","telphone":"15812345677","isVip":null,"accounttype":"1","balance":null,"isrealname":null,"status":null,"role":null,"email":null,"brief":null,"info":null,"gender":null,"birthday":null,"createtime":null,"updatetime":null,"isdel":false}],"message":null,"article":{"id":1,"doctorid":2,"doctorName":"doc2","title":"title1","categoryParent":1,"categoryChild":2,"status":"0","info":"sdfs","summary":"摘要1","createtime":null,"updatetime":null,"isdel":false,"document":"wenzhangneirong1"},"scanAricles":[{"id":1,"doctorid":2,"doctorName":"doc2","title":"title1","categoryParent":1,"categoryChild":2,"status":"0","info":"sdfs","summary":"摘要1","createtime":null,"updatetime":null,"isdel":false,"document":null},{"id":2,"doctorid":2,"doctorName":"doc2","title":"title2","categoryParent":1,"categoryChild":2,"status":"0","info":null,"summary":"摘要2","createtime":1472200074000,"updatetime":null,"isdel":false,"document":null}]}
7.根据文章子分类得到文章列表，及相关概要信息，作者名称等
http://localhost:8080/Medical/article/getArticlesByCategoryChild?category_child=2
8.搜索接口
http://localhost:8080/Medical/article/search?title=title1
[{"id":1,"doctorid":2,"doctorName":"doc2","title":"title1","categoryParent":1,"categoryChild":2,"status":"0","info":"sdfs","summary":"摘要1","createtime":null,"updatetime":null,"isdel":false,"document":null}]
9.收藏文章
http://localhost:8080/Medical/article/collect?title=title1

