<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" isELIgnored="false" %>
<div class="panel panel-default">
    <div class="panel-heading">
        <div class="row">
            <h1 class="col-md-6">权限管理</h1>

            <div class="col-md-5"></div>

            <button class="btn btn-success col-md-1" style="margin-top: 22px"
                    onclick="httpGetUrl('/PMIS/permission/new')">新增权限
            </button>
        </div>
    </div>

    <table class="table table-bordered">
        <thead>
        <tr class="text-center break-all">
            <th class="text-center">序号</th>
            <th class="text-center">权限</th>
            <th class="text-center">描述</th>
            <th class="text-center">操作</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${allPermission}" var="permission">
            <tr class="text-center break-all">
                <td>${permission.id}</td>
                <td>${permission.permission}</td>
                <td>${permission.description}</td>
                <td>
                    <div class="row">
                        <button type="button" class="btn btn-info btn-xs"
                                onclick="httpGetUrl()">详细信息
                        </button>
                        <button type="button" class="btn btn-warning btn-xs"
                                onclick="httpGetUrl('/PMIS/department/modify/${permission.id}')">修改
                        </button>
                        <button type="button" class="btn btn-danger btn-xs"
                                onclick="httpDeleteUrl('/PMIS/department/delete/${permission.id}')">删除
                        </button>
                    </div>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <div class="panel-footer"></div>
</div>
