/**
 * @Author：anlzou 
 * @Date：2020/5/26 23:29
 * @Descritpion：
 * @param： * @param null
*/
function del(rows) {
    var delid={};//创建一个空的对象，利用对象存放用户删除数据行的id
    var id="";
    //通过遍历获取用户选择要删除数据行的id值
    $.each(rows,function (i,item) {
        id+=item["id"]+",";
    })
    delid.id=id.substr(0,id.length-1);
    $.ajax( //采用异步通讯向后台的json控制器的requestJson方法发送json数据
        {
            type:"POST", //发出请求方式
            url:"${pageContext.request.contextPath}/deluser", //控制器
            //指定数据格式为 json
            contentType:"application/json;charset=UTF-8",
            data:JSON.stringify(delid),//发送json数据
            dataType:"json",//后台控制器返回的数据类型
            success:function(data){ //发送成功后进行处理
                if(data.success){
                    alert("删除成功");
                    $('#dg').datagrid("reload");
                }else{
                    alert("删除失败");
                }
            }}
    )
}

/**
 * @Author：anlzou 
 * @Date：2020/5/26 23:27
 * @Descritpion：
 * @param： * @param null
*/
function update(row) {
    if($('#dd') != null){
        $('#dd').remove();
    }
    $("body").append("<div id='dd'></div>");
    $('#dd').dialog({
        title: '更新用户信息',
        width: 400,
        height: 200,
        closed: false,
        cache: false,
        modal: true,
        buttons:[{
            text:'更新',
            handler:function(){
                var user={};
                user.name=$("#name").val();
                user.pass=$("#pass").val();
                $.ajax( //采用异步通讯向后台的json控制器的requestJson方法发送json数据
                    {
                        type:"POST", //发出请求方式
                        url:"${pageContext.request.contextPath}/updateuser", //控制器
                        //指定数据格式为 json
                        contentType:"application/json;charset=UTF-8",
                        data:JSON.stringify(user),//发送json数据
                        dataType:"json",//后台控制器返回的数据类型
                        success:function(data){ //发送成功后进行处理
                            if(data.success){
                                alert("更新成功");
                                $('#dd').dialog("close");//关闭对话框
                                $('#dg').datagrid("reload");
                            }else{
                                alert("更新失败");
                            }
                        }}
                )
            }
        },{
            text:'关闭',
            handler:function(){
                $('#dd').dialog("close");//关闭对话框
            }
        }]
    });
    var str="";
    str+='<form id="ff" method="post">\n' +
        '        <table>\n' +
        '            <tr>\n' +
        '                <td>用户名：</td>\n' +
        '                <td><input type="text" id="name" name="name" /></td>\n' +
        '            </tr>\n' +
        '            <tr>\n' +
        '                <td>密  码：</td>\n' +
        '                <td><input type="password" id="pass" name="pass" /><input type="hidden" id="id" name="id" /></td>\n' +
        '            </tr>\n' +
        '        </table>\n' +
        '    </form>';
    $('#dd').html(str);
    $('#ff').form('load',row[0]);//为表单加载数据。
}

/**
 * @Author：anlzou 
 * @Date：2020/5/26 23:26
 * @Descritpion：
 * @param： * @param null
*/
function add(){
    if($('#dd') != null){
        $('#dd').remove();
    }
    $("body").append("<div id='dd'></div>");
    $('#dd').dialog({
        title: '添加用户信息',
        width: 400,
        height: 200,
        closed: false,
        cache: false,
        modal: true,
        buttons:[{
            text:'添加',
            handler:function(){
                var user={};
                user.name=$("#name").val();
                user.pass=$("#pass").val();
                $.ajax( //采用异步通讯向后台的json控制器的requestJson方法发送json数据
                    {
                        type:"POST", //发出请求方式
                        url:"${pageContext.request.contextPath}/adduser", //控制器
                        //指定数据格式为 json
                        contentType:"application/json;charset=UTF-8",
                        data:JSON.stringify(user),//发送json数据
                        dataType:"json",//后台控制器返回的数据类型
                        success:function(data){ //发送成功后进行处理
                            if(data.success){
                                alert("添加成功");
                                $('#dd').dialog("close");//关闭对话框
                                $('#dg').datagrid("reload");
                            }else{
                                alert("添加失败");
                            }
                        }})
            }
        },{
            text:'关闭',
            handler:function(){
                $('#dd').dialog("close");//关闭对话框
            }
        }]
    });
    var str="";
    str+='<form id="ff" method="post">\n' +
        '        <table>\n' +
        '            <tr>\n' +
        '                <td>用户名：</td>\n' +
        '                <td><input type="text" id="name" name="name" /></td>\n' +
        '            </tr>\n' +
        '            <tr>\n' +
        '                <td>密  码：</td>\n' +
        '                <td><input type="password" id="pass" name="pass" /></td>\n' +
        '            </tr>\n' +
        '        </table>\n' +
        '    </form>';
    $('#dd').html(str);
}