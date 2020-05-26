<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/26
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试 eaayui</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/themes/icon.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui-lang-zh_CN.js"></script>

    <script type="text/javascript">
        $(function () {
            if ($('#dg') != null){//判断是否存在 id = dg 的元素，若存在删除它
                $('#dg').remove();
            }
            $('body').append('<div id="dg"></div>');//在页面中添加一个id为dg的div标签

            $('#dg').datagrid({
                url:'${pageContext.request.contextPath}/getuserdata',
                columns:[[
                    {field:'id',title:'编号',width:100},
                    {field:'name',title:'姓名',width:100},
                    {field:'pass',title:'密码',width:100}
                ]]
            });
        })
    </script>
</head>
<body>
</body>
</html>
