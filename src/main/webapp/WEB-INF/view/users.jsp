<%--
  Created by IntelliJ IDEA.
  User: anlzou
  Date: 2020/5/4
  Time: 16:53
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
        <form action="deleteUser" method="post">
            <table border="1" width="100%">
                <tr>
                    <th>选择删除</th>
                    <th>编号</th>
                    <th>用户名</th>
                </tr>

                <%for(int i=1;i<5;i++){%>
                <tr>
                    <th><input type="checkbox" name="usersId" value="<%=i%>"></th>
                    <td><%=i%></td>
                    <td><%="userName"+i%></td>
                </tr>
                <%}%>
            </table>

            <p>
                <input type="submit"  value="删除选择项"/>
            </p>
        </form>
    </div>
</body>
</html>
