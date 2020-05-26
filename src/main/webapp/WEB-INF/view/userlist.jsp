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
    <title>用户列表</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/themes/icon.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/userlist.js"></script>

    <script type="text/javascript">
        $(function () {
            if($('#dg') != null){ //判断页面中是否存在id=dg的元素，若存在删除它
                $('#dg').remove();
            }
            $("body").append("<div id='dg'></div>");//在页面中添加一个id为dg的div元素

            $('#dg').datagrid({
                url:'${pageContext.request.contextPath}/getuserdata',
                columns:[[
                    {field:'id',title:'编号',width:100},
                    {field:'username',title:'姓名',width:100},
                    {field:'password',title:'密码',width:100}
                ]],
                pagination:true,
                pageNumber:1,
                pageSize:2,
                pageList:[2,4,10,20,30,40,50],
                toolbar: [{
                    iconCls: 'icon-add',
                    text:'添加',
                    handler: function() {
                        add();
                        // alert("添加成功");
                    }
                },'-',{
                    iconCls: 'icon-edit',
                    text:'更新',
                    handler: function(){
                        var row=$('#dg').datagrid("getSelections");
                        if(row && row.length>0){
                            if(row.length>1){
                                alert("一次只能更新一条记录");
                                return false;
                            }else{
                                update(row);
                            }
                        }else{
                            alert("请选择你要更新数据行，才能进行更新操作");
                        }
                    }
                },'-',{
                    iconCls: 'icon-cancel',
                    text:'删除',
                    handler: function(){
                        //返回所有被选中的行，当没有记录被选中的时候将返回一个空数组
                        var rows=$("#dg").datagrid("getSelections");
                        if(rows && rows.length>0){
                            del(rows);
                        }else{
                            $.messager.alert('警告','请选择要删除数据行，才能进行删除操作');
                        }
                    }
                },'-',{
                    iconCls: 'icon-help',
                    text:'帮助',
                    handler: function(){alert('帮助按钮')}
                }]
            });
        });
    </script>
</head>
<body>
</body>
</html>
