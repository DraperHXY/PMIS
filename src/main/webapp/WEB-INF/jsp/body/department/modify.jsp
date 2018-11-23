<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" isELIgnored="false" %>
<div class="panel panel-default">
    <div class="panel-heading">
        <div class="row">
            <h1 class="col-md-6">修改</h1>
            <form class="col-md-4" action="#" method="post" style="margin-top: 22px;">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="请输入姓名" name="findByName">
                    <span class="input-group-addon btn">搜索</span>
                </div>
            </form>
        </div>
    </div>

    <div class="panel-body">
        <div class="form-group">
            <form action="/PMIS/department/modify/${id}" method="post">
                <select name="key">
                    <option value="name">部门名称</option>
                    <option value="fromDepartmentId">部门所属</option>
                    <option value="departmentLeaderId">部门领导</option>
                    <option value="departmentPhone">部门电话</option>
                    <option value="office">办公室</option>
                    <option value="note">备注</option>
                </select>

                <input type="text" name="value">

                <button class="btn btn-xs btn-success">
                    修改
                </button>

            </form>

        </div>
    </div>

    <div class="panel-footer"></div>
</div>
