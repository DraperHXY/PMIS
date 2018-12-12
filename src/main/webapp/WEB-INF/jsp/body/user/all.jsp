<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" isELIgnored="false" %>
<div class="panel panel-default">
    <div class="panel-heading">
        <div class="row">
            <h1 class="col-md-6">用户管理</h1>

        </div>
    </div>

    <table class="table table-bordered">
        <thead>
        <tr class="text-center break-all">
            <th class="text-center">工号</th>
            <th class="text-center">姓名</th>
            <th class="text-center">拥有角色</th>
            <%--<th class="text-center">拥有权限</th>--%>
            <th class="text-center">操作</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${infoList}" var="item">
            <tr class="text-center break-all">
                <td>${item.workId}</td>
                <td>${item.name}</td>
                <td>${item.roles}</td>
                <%--<td>${item.permissions}</td>--%>
                <td>
                    <div class="row">
                        <button type="button" class="btn btn-warning btn-xs"
                                onclick="httpGetUrl('/PMIS/user/${item.workId}')">修改
                        </button>
                        <button type="button" class="btn btn-danger btn-xs"
                                onclick="httpDeleteUrl('/PMIS/user/${item.workId}')">删除
                        </button>
                    </div>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <div class="panel-footer"></div>
</div>
