<!DOCTYPE html>
<!--suppress ALL -->
<html>

<head lang="en">
    <meta charset="UTF-8" />
    <title>主页</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <style>
        div {
            border: 1px;
        }
        label{
            padding: 10px;
        }
    </style>


</head>

<body>
<!--头部信息-->
<div class="container">
    <div class="row">
        <div class="col-lg-7">
            <h1 align="center">信息管理界面</h1>
        </div>
        <div class="col-lg-1">
            <#if loginUser??>
                <img id="imgLogin" src=${loginUser.avator} class="img-circle" width="80" height="80" />
            <#else>
                <img id="imgLogin" src="/images/kong.jpg" class="img-circle" width="80" height="80" />
            </#if>
        </div>
        <div class="col-lg-4" style="padding-top: 20px;padding-left: 20px;">
            <button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#loginModal">登录</button>
            <button class="btn btn-primary btn-lg" data-toggle="modal" onclick="logout()">注销</button>
            <!--登录模态框-->
            <div class="modal fade" id="loginModal" tabindex="-1" role="dialog" aria-labelledby="loginLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4 id="login" class="modal-title" id="addModalLabel" align="center" style="padding-top: 20px;font-size: 30px;">登录</h4>
                        </div>
                        <div class="modal-body">
                            <div>
                                <div>
                                    <label for="loginUsername">用戶名：</label>
                                    <input type="text" class="form-control" id="loginUsername" placeholder="请输入您的用戶名" required="required"">
                                    <label for="loginPassword">密码：</label>
                                    <input type="password" class="form-control" id="loginPassword" placeholder="请输入您的密码" required="required">
                                </div>
                                <span id="loginTip"></span>
                                <br/>
                                <div align="center">
                                    <button id="btnLogin" type="button" class="btn btn-default" style="align-content:" >登录</button>
                                    <button type="button" class="btn btn-default" data-dismiss="modal" style="color:">关闭</button>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                        </div>
                    </div>
                    <!-- /.modal-content -->
                </div>
                <!-- /.modal -->
            </div>
        </div>
    </div>
</div>
<!--表格主体信息-->
<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <!--添加信息-->
            <div align="right" style="padding-right: 90px;padding-bottom: 35px;">

            <#if loginUser??>

                <button class="btn btn-primary pull-right" data-toggle="modal" data-target="#addInfoModal">添加</button>
            <#else>
                <button type="button" class="btn btn-primary pull-right" data-toggle="tooltip" data-placement="top" style="background: gray" title="请先登录！"> 添加</button>
            </#if>
            </div>
            <!--添加信息模态窗口-->
            <div class="modal fade" id="addInfoModal" tabindex="-1" role="dialog" aria-labelledby="addInfoLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4 class="modal-title" id="myModalLabel" align="center" style="padding-top: 20px;font-size: 30px;">添加信息</h4>
                        </div>
                        <div class="modal-body">
                            <form id="formSaveInfo" role="form" class="form-inline">
                                <div class="form-group" id="divNameAndPwd">
                                    <label class="form-label">用戶名：</label>
                                    <input name="name" type="text"  class="form-control" id="username" placeholder="请输入用戶名" onblur="checkName()">
                                    <label for="password">密&nbsp;&nbsp;&nbsp;&nbsp;码：</label>
                                    <input name="pwd" type="password"  class="form-control" id="password" placeholder="请输入密码">
                                </div>
                                <strong id ="strNameTip" class="strEditNameTip" style='color: red'></strong>
                                <div class="form-group">
                                    <label>性&nbsp;&nbsp;&nbsp;&nbsp;别：</label>
                                    <input name="sex" type="text" class="form-control" id="sex" placeholder="请输入性别">
                                    <label>电&nbsp;&nbsp;&nbsp;&nbsp;话：</label>
                                    <input name="mobilePhone" type="text" class="form-control" id="mobilePhone" placeholder="请输入电话">
                                </div>
                                <div class="form-group">
                                    <label>状&nbsp;&nbsp;&nbsp;&nbsp;态：</label>
                                    <input name="status" type="text" class="form-control" id="status" placeholder="请输入状态">
                                    <label>邮&nbsp;&nbsp;&nbsp;&nbsp;箱：</label>
                                    <input name="email" type="email" class="form-control" id="email" placeholder="请输入邮箱">
                                </div>
                                <div class="form-group">
                                    <label>头&nbsp;&nbsp;&nbsp;&nbsp;像：</label>
                                    <input type="file" class="form-control" id="file" onchange="setImg(this)">
                                    <img id="imgAdd" class="img-circle" width="80" height="80" />
                                    <!--img-->
                                    <input name="avator" type="hidden" class="form-control" id="avator" value="123"/>
                                </div>
                                <div align="center">
                                    <button  id="btnSave" type="button" class="btn btn-default" style="align-content: center;" onclick="butSaveInfo()">提交</button>
                                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                                </div>
                            </form>
                        </div>
                        <div class="modal-footer">
                        </div>
                    </div>
                    <!-- /.modal-content -->
                </div>
                <!-- /.modal -->
            </div>
            <table class="table table-striped table-bordered table-hover">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Avator</th>
                    <th>Username</th>
                    <#--<th>Password</th>-->
                    <th>Sex</th>
                    <th>mobilePhone</th>
                    <th>E-mail</th>
                    <th>Status</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <#if allUserInfo??>
                <#list allUserInfo as userInfo>
                <tr>
                    <td>${userInfo.id}</td>
                    <td><img src=${userInfo.avator} class="img-circle" width="80" height="80" /></td>
                    <td>${userInfo.name}</td>
                    <#--<td>${userInfo.pwd}</td>-->
                    <td>${userInfo.sex}</td>
                    <td>${userInfo.mobilePhone}</td>
                    <td>${userInfo.email}</td>
                    <td>${userInfo.status}</td>
                    <td>
                        <#if loginUser??>
                            <a id="aEdit" data-toggle="modal" data-target="#editInfoModal" href="#" sid="${userInfo.id}" onclick="editInfo(this)">编辑</a>
                            <a id="aDelete" href="#" sid="${userInfo.id}" onclick="deleteInfo(this)">删除</a>
                        <#else>
                            <a href="#" data-toggle="tooltip" data-placement="top" title="请先登录！" style="color:gray">编辑</a>
                            <a href="#" data-toggle="tooltip" data-placement="top" title="请先登录！" style="color:gray">删除</a>
                        </#if>
                    </td>
                </tr>
                </#list>
                </#if>
                </tbody>
            </table>
        </div>
    </div>
</div>
<!--编辑信息模态窗口-->
<div class="modal fade" id="editInfoModal" tabindex="-1" role="dialog" aria-labelledby="editInfoLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title" id="editModalLabel" align="center" style="padding-top: 20px;font-size: 30px;">编辑信息</h4>
            </div>
            <div class="modal-body">
                <form id="formEditInfo" role="form" class="form-inline">
                    <div class="form-group" id="divEditNameAndPwd">
                        <!--ID-->
                        <input name="id" type="hidden" class="form-control" id="editId" >
                        <label>用戶名：</label>
                        <input name="name" type="text"  class="form-control" id="editUsername" placeholder="请输入用戶名" onblur="checkEditName()">
                        <label for="password">密&nbsp;&nbsp;&nbsp;&nbsp;码：</label>
                        <input name="pwd" type="password"  class="form-control" id="editPassword" placeholder="请输入密码">
                    </div>
                    <strong id ="strEditNameTip" class="strEditNameTip" style='color: red'></strong>
                    <div class="form-group">
                        <label>性&nbsp;&nbsp;&nbsp;&nbsp;别：</label>
                        <input name="sex" type="text" class="form-control" id="editSex" placeholder="请输入性别">
                        <label>电&nbsp;&nbsp;&nbsp;&nbsp;话：</label>
                        <input name="mobilePhone" type="text" class="form-control" id="editMobilePhone" placeholder="请输入电话">
                    </div>
                    <div class="form-group">
                        <label>状&nbsp;&nbsp;&nbsp;&nbsp;态：</label>
                        <input name="status" type="text" class="form-control" id="editStatus" placeholder="请输入状态">
                        <label>邮&nbsp;&nbsp;&nbsp;&nbsp;箱：</label>
                        <input name="email" type="email" class="form-control" id="editEmail" placeholder="请输入邮箱">
                    </div>
                    <div class="form-group">
                        <label>头&nbsp;&nbsp;&nbsp;&nbsp;像：</label>
                        <input type="file" class="form-control" id="editvator" onchange="setImg(this)">
                        <img id="editImg"  class="img-circle" width="80" height="80" />
                        <!--img-->
                        <input name="avator" type="hidden" class="form-control" id="editAvator"/>
                    </div>
                    <div align="center">
                        <button  id="btnEditSave" type="button" class="btn btn-default" style="align-content: center;" onclick="updateEditInfoByID()">提交</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
            </div>
        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal -->
</div>
<!--尾部信息-->
<div class="container" style="margin-top: 10px;">
    <div class="row">
        <div class="" align="center">
            <ul class="list-inline">
                <li>
                    <a>关于我们</a>
                </li>
                <li>
                    <a>联系我们</a>
                </li>
                <li>
                    <a>招贤纳士</a>
                </li>
                <li>
                    <a>法律声明</a>
                </li>
                <li>
                    <a>友情链接</a>
                </li>
                <li>
                    <a>服务声明</a>
                </li>
                <li>
                    <a>广告声明</a>
                </li>
            </ul>
        </div>
        <div style="text-align: center;margin-top: 5px;margin-bottom:20px;">
            Copyright &copy; 2017-2018 NIIT 版权所有
        </div>
    </div>
</div>
</body>
<script type="text/javascript">
    $(document).ready(function () {
        initTable();
    })

    /**
     * 初始化数据
     * */
    var initTable=function(){
        $.ajax({
            type:"get",
            url:"/index",
            async:true
        });
    }

    /**
     * 登录事件
     */
    $("#btnLogin").click(function(){
        var username = $("#loginUsername").val();
        var password = $("#loginPassword").val();
        $.post("/login",
                {
                    username:username,
                    password:password
                },
                function(data){
                    if(data=="OK"){
                        reloadFun();
                        $("#loginModal").modal('toggle');
                        $("#loginTip").text("");
                    }else {
                        $("#loginTip").text("账号或密码错误！");

                    }
                });
    });
    /**
     * 重新加载页面
     */
    var reloadFun = function () {
        window.location.reload();
    }
    /**
     * 未登录时添加操作时提示信息
     */
    var addNotice = function () {
        $("#butAddNotice").tooltip = "请先登录！"
    }
    /**
     * 注销登录
     */
    var logout=function() {
        $.ajax({
            type:"get",
            url:"/logout",
            async:true
        });
        reloadFun();
    }
    /**
     * 检查用户名是否重复(提交新添加)
     */
    var checkName =function () {
        var name = $("#username").val();
        $.post("/checkName",
                {
                    name:name
                },
                function(res){
                    if(res == "OK"){
                        $("strong").text("");
                        $("#btnSave").attr("disabled",false);
                    }else{
                        $("strong").text("用户名已存在！");
                        $("#btnSave").attr("disabled",true);
                    }
                });
    }
    /**
     * 检查用户名是否重复(编辑)
     */
    var checkEditName =function () {
        var name = $("#editUsername").val();
        if(editUsername != name){
            $.post("/checkName",
                    {
                        name:name
                    },
                    function(res){
                        if(res == "OK"){
                            $("strong").text("");
                            $("#btnEditSave").attr("disabled",false);
                        }else{
                            $("strong").text("用户名已存在！");
                            $("#btnEditSave").attr("disabled",true);
                        }
                    });
        }
    }

    /**
     * 保存添加信息
     */
    var butSaveInfo =function () {
        var formData = new FormData($("#formSaveInfo")[0]);
        //formData.append("avator",$("#imgId")[0].src);
        $.ajax({
            url:"/saveAddInfo",
            type:"post",
            data:formData,
            contentType:false,
            processData: false,
            success:function (data) {
                if(data == "OK"){
                    //alert("保存成功！");
                    $("#editInfoModal").modal('toggle');
                     reloadFun();
                }else{
                    alert("保存失败！");
                }
            }
        });

    }
    /**
     * 编辑信息
     */
    var editUsername;
    var editInfo = function (obj) {
        var id =$(obj).attr("sid")
        $.post("/editInfo",
                {
                    id:id
                },
                function(user){
                    $("#editId").val(user.id);
                    $("#editUsername").val(user.name);
                    editUsername=user.name;
                    $("#editPassword").val(user.pwd);
                    $("#editSex").val(user.sex);
                    $("#editMobilePhone").val(user.mobilePhone);
                    $("#editStatus").val(user.status);
                    $("#editEmail").val(user.email);
                    $('#editImg').attr('src',user.avator);
                    $('#editAvator').val(user.avator);
                });
    }
    /**
     * 保存编辑信息
     */
    var updateEditInfoByID = function () {
        var formData = new FormData($("#formEditInfo")[0]);
        $.ajax({
            url:"/updateEditInfoByID",
            type:"post",
            data:formData,
            contentType:false,
            processData: false,
            success:function (data) {
                if(data == "OK"){
                    //alert("更新成功！");
                    $("#addInfoModal").modal('toggle');
                    reloadFun();
                }else{
                    alert("更新失败！");
                }
            }
        });
    }
    /**
     * 删除信息
     * @param obj
     */
    var deleteInfo =function (obj) {
        var id =$(obj).attr("sid")
        $.post("/deleteInfoById",
                {
                    id:id
                },
                function(res){
                    if(res == "OK"){
                        //alert("删除成功！");
                        reloadFun();
                    }else{
                        alert("删除失败！");
                    }
                });
    }

    /**
     * 上传图片
     */
    var setImg = function (obj) {
        var f = $(obj).val();
        if(f == null || f == undefined || f == ""){
            return false;
        }
        if(!/\.(?:png|jpg|bmp|gif|PNG|JPG|BMP|GIF)$/.test(f)){
            alert("类型必须是图片(.png|jpg|bmp|gif|PNG|JPG|BMP|GIF)");
            $(obj).val('');
            return false;
        }
        var data = new FormData();
        $.each($(obj)[0].files,function (i,file) {
            data.append("file",file);
        });
        $.ajax({
            type:"post",
            url:"/setImg",
            data:data,
            cache:false,
            contentType:false,
            async:true,
            processData:false,
            dataType:"json",
            success:function (data) {
                var src = data.fileName;
                if(src != "NO"){
                    $("#imgAdd").attr("src",src);
                    $("#avator").val(src);
                    $("#editImg").attr("src",src);
                    $("#editAvator").val(src);
                }else{
                    alert("上传失败！");
                }

            },
            error:function (e) {
                alert("上传失败！");
            }

        });
    }
</script>
</html>