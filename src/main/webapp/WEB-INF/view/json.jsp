<%--
  Created by IntelliJ IDEA.
  User: anlzou
  Date: 2020/5/19
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>

    <script type="text/javascript">

        /*定义了一个对象user*/

        var user={"id":1,"name":"lili","pass":"zhangsan"};

        /*下面三个语句用于读user对象的属性*/

        document.write("id="+user.id+"<br />");

        document.write("name="+user["name"]+"<br />");

        document.write("pass="+user.pass+"<br />");

        /*对象嵌套*/

        var users={"user":[

                {"id":1,"name":"xiaoli","pass":"xiaoli"},

                {"id":2,"name":"xiaozhang","pass":"xiaozhang"},

                {"id":3,"name":"xiaowang","pass":"xiaowang"}

            ]

        };

        /*访问嵌套对象的属性（第二个用户信息，即id为2的用户)*/

        document.write("读取嵌套对象的属性<br />")

        document.write("id="+users["user"][1].id+"<br />");

        document.write("name="+users["user"][1]["name"]+"<br />");

        document.write("pass="+users["user"][1].pass+"<br />");

    </script>

</head>

<body>

</body>

</html>
