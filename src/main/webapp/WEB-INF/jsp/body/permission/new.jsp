<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" language="java" %>
<div class="panel panel-default">

    <div class="panel-heading">
        <div class="row">
            <h1 class="h1 col-md-6">新增权限</h1>
        </div>
    </div>

    <div class="panel-body">
        <form class="form" action="/PMIS/permission/new" method="post">

            <div class="row">
                <div class="col-md-3">
                    <div class="row">
                        <label class="control-label col-md-3 text-right" style="padding: 7px 0px 0px 0px;">权限</label>
                        <div class="col-md-9">
                            <input type="text" class="form-control" name="permission">
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <label class="control-label col-md-3 text-right" style="padding: 7px 0px 0px 0px;">描述</label>
                        <div class="col-md-9">
                            <input type="text" class="form-control" name="description">
                        </div>
                    </div>
                    <br>
                </div>

                <div class="col-md-3">
                </div>

                <div class="col-md-3">
                    <div class="form-group" style="margin: 10px 0px 0px 0px;">
                        <button type="submit" name="submit" class="btn btn-success center-block">添加
                        </button>
                    </div>
                </div>


            </div>
        </form>
    </div>


</div>

