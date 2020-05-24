<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/19
  Time: 22:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        /*定义一个空对象*/
        var useremp={};
        useremp.id=1; //对象属性赋值
        useremp.name="xiaoli";
        useremp.pass="xiaoli";
        document.write("读取由｛｝创建对象的属性<br />")
        document.write("useremp.id="+useremp.id+"<br />");
        document.write("useremp.name="+useremp["name"]+"<br />");
        document.write("useremp.pass="+useremp.pass+"<br />");
        /*用Object对象创建*/
        var userObject=new Object();
        userObject.id=1;  //对象属性赋值
        userObject.name="xiaoli";
        userObject.pass="xiaoli";
        document.write("读取由Objec创建对象的属性<br />")
        document.write("userObject.id="+userObject.id+"<br />");
        document.write("userObject.name="+userObject["name"]+"<br />");
        document.write("userObject.pass="+userObject.pass+"<br />");
        /*定义了一个对象user并进行初始化操作*/
        var user={"id":1,"name":"lili","pass":"zhangsan"};
        /*下面三个语句用于读user对象的属性*/
        document.write("读取创建并初始化对象的属性<br />")
        document.write("user.id="+user.id+"<br />");
        document.write("user.name="+user["name"]+"<br />");
        document.write("user.pass="+user.pass+"<br />");
        /*对象嵌套*/
        var users={"user":[
                {"id":1,"name":"xiaoli","pass":"xiaoli"},
                {"id":2,"name":"xiaozhang","pass":"xiaozhang"},
                {"id":3,"name":"xiaowang","pass":"xiaowang"}
            ]};
        /*访问嵌套对象的属性（第二个用户信息，即id为2的用户)*/
        document.write("读取嵌套对象的属性<br />")
        document.write("users.id="+users["user"][1].id+"<br />");
        document.write("users.name="+users["user"][1]["name"]+"<br />");
        document.write("users.pass="+users["user"][1].pass+"<br />");
    </script>
</head>
<body>

</body>
</html>