<%--
  Created by IntelliJ IDEA.
  User: anlzou
  Date: 2020/5/4
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <h2><span>用户管理</span></h2>
        <form action="getUserInfo" method="post">
            <table border="1" width="100%">
                <tr>
                    <th>编号</th>
                    <th>用户名</th>
                    <th>密码</th>
                </tr>
                <%for(int i=1;i<5;i++){%>
                <tr>
                    <td><input type="text" name="usersList[<%=i%>].id" value="<%=i%>"></td>
                    <td><input type="text" name="usersList[<%=i%>].name" value="name<%=i%>"></td>
                    <th><input type="text" name="usersList[<%=i%>].pass" value="pass<%=i%>"></th>
                </tr>
                <%}%>
            </table>
            <p>
                <input type="submit"  value="提交"/>
            </p>
        </form>
    </div>
</body>
</html>
