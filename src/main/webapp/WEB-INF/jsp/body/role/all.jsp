<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" isELIgnored="false" %>
<div class="panel panel-default">
    <div class="panel-heading">
        <div class="row">
            <h1 class="col-md-6">权限管理</h1>
        </div>
    </div>

    <table class="table table-bordered">
        <thead>
        <tr class="text-center break-all">
            <th class="text-center">序号</th>
            <th class="text-center">名字</th>
            <th class="text-center">描述</th>
            <th class="text-center">操作</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${allRoles}" var="role">
            <tr class="text-center break-all">
                <td>${role.id}</td>
                <td>${role.name}</td>
                <td>${role.description}</td>
                <td>
                    <div class="row">
                        <button type="button" class="btn btn-info btn-xs disabled"
                                onclick="httpGetUrl()">详细信息
                        </button>
                        <button type="button" class="btn btn-warning btn-xs disabled"
                                onclick="httpGetUrl('/PMIS/department/modify/${role.id}')">修改
                        </button>
                        <button type="button" class="btn btn-danger btn-xs disabled"
                                onclick="httpDeleteUrl('/PMIS/department/delete/${role.id}')">删除
                        </button>
                    </div>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <div class="panel-footer"></div>
</div>
