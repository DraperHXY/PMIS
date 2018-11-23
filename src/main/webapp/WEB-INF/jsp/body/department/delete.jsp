<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" isELIgnored="false" %>
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
                    class="glyphicon glyphicon-plus"></span>
            </button>
        </div>
    </div>
    <table class="table table-hover table-bordered">
        <thead>
        <tr>
            <th>部门名称</th>
            <th>部门所属</th>
            <th>部落领导</th>
            <th>部门电话</th>
            <th>办公室</th>
            <th>备注</th>
            <th>操作</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${allDepartments}" var="department">
            <tr class="text-center break-all">
                <td>${department.name}</td>
                <td>${department.fromDepartmentId}</td>
                <td>${department.departmentLeaderId}</td>
                <td>${department.departmentPhone}</td>
                <td>${department.office}</td>
                <td>${department.note}</td>
                <td>
                    <div class="row">
                        <a href="/PMIS/department/delete">
                            <button type="button" class="btn btn-danger btn-xs">删除</button>
                        </a>
                        <a href="/PMIS/department/modify">
                            <button type="button" class="btn btn-warning btn-xs">修改</button>
                        </a>
                    </div>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div class="panel-footer"></div>
</div>
