<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" isELIgnored="false" %>
<div class="panel panel-default">
    <div class="panel-heading">
        <div class="row">
            <h1 class="col-md-6">员工管理</h1>

            <div class="col-md-1"></div>

            <form class="col-md-4" action="#" method="post" style="margin-top: 22px;">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="请输入姓名" name="findByName">
                    <span class="input-group-addon btn">搜索</span>
                </div>
            </form>
            <button class="btn btn-success col-md-1" style="margin-top: 22px"
            onclick="httpGetUrl('/PMIS/employee/new')">新增用户</button>
        </div>
    </div>

    <table class="table table-bordered">
        <thead>
        <tr class="text-center break-all">
            <th class="text-center">工号</th>
            <th class="text-center">姓名</th>
            <th class="text-center">岗位</th>
            <th class="text-center">职称</th>
            <th class="text-center">部门</th>
            <th class="text-center">邮箱</th>
            <th class="text-center">操作</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${infoList}" var="permission">
            <tr class="text-center break-all">
                <td>${permission.workId}</td>
                <td>${permission.name}</td>
                <td>${permission.job}</td>
                <td>${permission.jobTitle}</td>
                <td>${permission.departmentName}</td>
                <td>${permission.email}</td>
                <td>
                    <div class="row">
                        <button type="button" class="btn btn-info btn-xs"
                                onclick="httpGetUrl()">详细信息
                        </button>
                        <button type="button" class="btn btn-warning btn-xs"
                                onclick="httpGetUrl('/PMIS/department/modify/${permission.workId}')">修改
                        </button>
                        <button type="button" class="btn btn-danger btn-xs"
                                onclick="httpDeleteUrl('/PMIS/department/delete/${permission.workId}')">删除
                        </button>
                    </div>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <div class="panel-footer"></div>
</div>
