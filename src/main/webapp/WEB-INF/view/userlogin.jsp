<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/26
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/themes/icon.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui-lang-zh_CN.js"></script>

    <script type="text/javascript">
        $(function () {
            $('#dd').dialog({
                title: '登录界面',
                width: 400,
                height: 200,
                closed: false,
                cache: false,
                modal: true,
                buttons:[{
                    text:'登录',
                    handler:function(){
                        var user = {};//使用json获取前端数据，然后传送到后台
                        user.name = $("#name").val();
                        user.pass = $("#pass").val();
                        alert("user："+user.name+"，pass："+user.pass);
                    }
                },{
                    text:'关闭',
                    handler:function(){
                        $("#dd").dialog("close");
                    }
                }]

            });
        })
    </script>
</head>
<body>
    <form method="post" id="dd">
        <table>
            <tr>
                <td>用户名:</td>
                <td><input type="text" id="name" name="name"></td>
            </tr>
            <tr>
                <td>密 码:</td>
                <td><input type="password" id="pass" name="pass"></td>
            </tr>
        </table>
    </form>
</body>
</html>
