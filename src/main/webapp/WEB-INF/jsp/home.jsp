<%@page contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" href="/PMIS/css/bootstrap.min.css"/>

    <script type="text/javascript" src="/PMIS/js/jquery-1-12-4.min.js"></script>
    <script type="text/javascript" src="/PMIS/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-default navbar-static-top" style="margin-bottom:0px;">
    <div class="navbar-header">
        <a href="" class="nav navbar-brand">管理信息系统</a>

    </div>

    <form action="#" class="navbar-form navbar-right">
        <div class="dropdown">
            <div class="btn btn-success dropdown-toggle" id="dropdownMenu1"
                 data-toggle="dropdown" style="margin-right: 20px; " aria-expanded="false">

                <span class="glyphicon glyphicon-user">admin</span>
                <span class="caret"></span>
            </div>
            <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
                <li role="presentation">
                    <a role="menuitem" tabindex="-1" href="#">
                        <span class="glyphicon glyphicon-cog pull-right"></span>
                        修改个人信息
                    </a>
                </li>
                <!---分割线----->
                <li role="presentation" class="divider"></li>
                <li role="presentation">
                    <a role="menuitem" tabindex="-1" href="#">
                        <span class="glyphicon glyphicon-off pull-right"></span>
                        注销
                    </a>
                </li>
            </ul>
        </div>
    </form>

</nav>

<div class="row">


    <div id="menu" class="col-md-2" style="background: #F8F8F8; padding-right: 15px;">
        <ul class="nav nav-pills nav-stacked" id="nav">
            <li class="active"><a href="/admin/showCourse">课程管理<span class="badge pull-right">8</span></a></li>
            <li><a href="/admin/showStudent">学生管理<span class="badge pull-right">59</span></a></li>
            <li><a href="/admin/showTeacher">教师管理<span class="badge pull-right">10</span></a></li>
            <li><a href="/admin/userPasswordRest">账号密码重置
                <sapn class="glyphicon glyphicon-repeat pull-right"/>
            </a></li>
            <li><a href="/admin/passwordRest">修改密码
                <sapn class="glyphicon glyphicon-pencil pull-right"/>
            </a></li>
            <li><a href="/logout">退出系统
                <sapn class="glyphicon glyphicon-log-out pull-right"/>
            </a></li>
            <li class="disabled"><a href="##">Responsive</a></li>
        </ul>
    </div>

    <div class="col-md-10" style="padding-left: 0px;">
        <div class="panel panel-default">
            <div class="panel-heading">
                <div class="row">
                    <h1 class="col-md-6">人力资源管理</h1>
                    <form class="col-md-4" action="#" method="post" style="margin-top: 22px;">
                        <div class="input-group">
                            <input type="text" class="form-control" placeholder="请输入姓名" name="findByName">
                            <span class="input-group-addon btn">搜索</span>
                        </div>
                    </form>
                    <button class="btn btn-default col-md-2" style="margin-top: 22px">添加用户信息<span
                            class="glyphicon glyphicon-plus"></span></button>
                </div>
            </div>
            <table class="table table-hover table-bordered">
                <thead>
                <tr>
                    <th>是否在线</th>
                    <th>编号</th>
                    <th>姓名</th>
                    <th>分部</th>
                    <th>部门</th>
                    <th>岗位</th>
                    <th>电话</th>
                    <th>电子邮件</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <tr class="text-center break-all">
                    <td>否</td>
                    <td>w20152125</td>
                    <td>连是超</td>
                    <td>总部</td>
                    <td>IT技术部</td>
                    <td>技术总监</td>
                    <td>18911112222</td>
                    <td>lianshichao@lzbc.com</td>
                    <td>
                        <div class="row">
                            <button type="button" class="btn btn-danger btn-xs">删除</button>
                            <button type="button" class="btn btn-warning btn-xs">修改</button>
                        </div>
                    </td>
                </tr>
                <tr class="text-center break-all">
                    <td>否</td>
                    <td>w20152125</td>
                    <td>连是超</td>
                    <td>总部</td>
                    <td>IT技术部</td>
                    <td>技术总监</td>
                    <td>18911112222</td>
                    <td>lianshichao@lzbc.com</td>
                    <td>
                        <div class="row">
                            <button type="button" class="btn btn-danger btn-xs">删除</button>
                            <button type="button" class="btn btn-warning btn-xs">修改</button>
                        </div>
                    </td>
                </tr>
                <tr class="text-center break-all">
                    <td>否</td>
                    <td>w20152125</td>
                    <td>连是超</td>
                    <td>总部</td>
                    <td>IT技术部</td>
                    <td>技术总监</td>
                    <td>18911112222</td>
                    <td>lianshichao@lzbc.com</td>
                    <td>
                        <div class="row">
                            <button type="button" class="btn btn-danger btn-xs">删除</button>
                            <button type="button" class="btn btn-warning btn-xs">修改</button>
                        </div>
                    </td>
                </tr>
                <tr class="text-center break-all">
                    <td>否</td>
                    <td>w20152125</td>
                    <td>连是超</td>
                    <td>总部</td>
                    <td>IT技术部</td>
                    <td>技术总监</td>
                    <td>18911112222</td>
                    <td>lianshichao@lzbc.com</td>
                    <td>
                        <div class="row">
                            <button type="button" class="btn btn-danger btn-xs">删除</button>
                            <button type="button" class="btn btn-warning btn-xs">修改</button>
                        </div>
                    </td>
                </tr>
                <tr class="text-center break-all">
                    <td>否</td>
                    <td>w20152125</td>
                    <td>连是超</td>
                    <td>总部</td>
                    <td>IT技术部</td>
                    <td>技术总监</td>
                    <td>18911112222</td>
                    <td>lianshichao@lzbc.com</td>
                    <td>
                        <div class="row">
                            <button type="button" class="btn btn-danger btn-xs">删除</button>
                            <button type="button" class="btn btn-warning btn-xs">修改</button>
                        </div>
                    </td>
                </tr>
                <tr class="text-center break-all">
                    <td>否</td>
                    <td>w20152125</td>
                    <td>连是超</td>
                    <td>总部</td>
                    <td>IT技术部</td>
                    <td>技术总监</td>
                    <td>18911112222</td>
                    <td>lianshichao@lzbc.com</td>
                    <td>
                        <div class="row">
                            <button type="button" class="btn btn-danger btn-xs">删除</button>
                            <button type="button" class="btn btn-warning btn-xs">修改</button>
                        </div>
                    </td>
                </tr>
                <tr class="text-center break-all">
                    <td>否</td>
                    <td>w20152125</td>
                    <td>连是超</td>
                    <td>总部</td>
                    <td>IT技术部</td>
                    <td>技术总监</td>
                    <td>18911112222</td>
                    <td>lianshichao@lzbc.com</td>
                    <td>
                        <div class="row">
                            <button type="button" class="btn btn-danger btn-xs">删除</button>
                            <button type="button" class="btn btn-warning btn-xs">修改</button>
                        </div>
                    </td>
                </tr>
                <tr class="text-center break-all">
                    <td>否</td>
                    <td>w20152125</td>
                    <td>连是超</td>
                    <td>总部</td>
                    <td>IT技术部</td>
                    <td>技术总监</td>
                    <td>18911112222</td>
                    <td>lianshichao@lzbc.com</td>
                    <td>
                        <div class="row">
                            <button type="button" class="btn btn-danger btn-xs">删除</button>
                            <button type="button" class="btn btn-warning btn-xs">修改</button>
                        </div>
                    </td>
                </tr>
                <tr class="text-center break-all">
                    <td>否</td>
                    <td>w20152125</td>
                    <td>连是超</td>
                    <td>总部</td>
                    <td>IT技术部</td>
                    <td>技术总监</td>
                    <td>18911112222</td>
                    <td>lianshichao@lzbc.com</td>
                    <td>
                        <div class="row">
                            <button type="button" class="btn btn-danger btn-xs">删除</button>
                            <button type="button" class="btn btn-warning btn-xs">修改</button>
                        </div>
                    </td>
                </tr>
                <tr class="text-center break-all">
                    <td>否</td>
                    <td>w20152125</td>
                    <td>连是超</td>
                    <td>总部</td>
                    <td>IT技术部</td>
                    <td>技术总监</td>
                    <td>18911112222</td>
                    <td>lianshichao@lzbc.com</td>
                    <td>
                        <div class="row">
                            <button type="button" class="btn btn-danger btn-xs">删除</button>
                            <button type="button" class="btn btn-warning btn-xs">修改</button>
                        </div>
                    </td>
                </tr>
                <tr class="text-center break-all">
                    <td>否</td>
                    <td>w20152125</td>
                    <td>连是超</td>
                    <td>总部</td>
                    <td>IT技术部</td>
                    <td>技术总监</td>
                    <td>18911112222</td>
                    <td>lianshichao@lzbc.com</td>
                    <td>
                        <div class="row">
                            <button type="button" class="btn btn-danger btn-xs">删除</button>
                            <button type="button" class="btn btn-warning btn-xs">修改</button>
                        </div>
                    </td>
                </tr>
                <tr class="text-center break-all">
                    <td>否</td>
                    <td>w20152125</td>
                    <td>连是超</td>
                    <td>总部</td>
                    <td>IT技术部</td>
                    <td>技术总监</td>
                    <td>18911112222</td>
                    <td>lianshichao@lzbc.com</td>
                    <td>
                        <div class="row">
                            <button type="button" class="btn btn-danger btn-xs">删除</button>
                            <button type="button" class="btn btn-warning btn-xs">修改</button>
                        </div>
                    </td>
                </tr>
                <tr class="text-center break-all">
                    <td>否</td>
                    <td>w20152125</td>
                    <td>连是超</td>
                    <td>总部</td>
                    <td>IT技术部</td>
                    <td>技术总监</td>
                    <td>18911112222</td>
                    <td>lianshichao@lzbc.com</td>
                    <td>
                        <div class="row">
                            <button type="button" class="btn btn-danger btn-xs">删除</button>
                            <button type="button" class="btn btn-warning btn-xs">修改</button>
                        </div>
                    </td>
                </tr>
                <tr class="text-center break-all">
                    <td>否</td>
                    <td>w20152125</td>
                    <td>连是超</td>
                    <td>总部</td>
                    <td>IT技术部</td>
                    <td>技术总监</td>
                    <td>18911112222</td>
                    <td>lianshichao@lzbc.com</td>
                    <td>
                        <div class="row">
                            <button type="button" class="btn btn-danger btn-xs">删除</button>
                            <button type="button" class="btn btn-warning btn-xs">修改</button>
                        </div>
                    </td>
                </tr>
                <tr class="text-center break-all">
                    <td>否</td>
                    <td>w20152125</td>
                    <td>连是超</td>
                    <td>总部</td>
                    <td>IT技术部</td>
                    <td>技术总监</td>
                    <td>18911112222</td>
                    <td>lianshichao@lzbc.com</td>
                    <td>
                        <div class="row">
                            <button type="button" class="btn btn-danger btn-xs">删除</button>
                            <button type="button" class="btn btn-warning btn-xs">修改</button>
                        </div>
                    </td>
                </tr>
                </tbody>
            </table>
            <div class="panel-footer"></div>
        </div>
    </div>

</div>

</body>

</html>