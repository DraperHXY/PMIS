<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" language="java" %>
<div class="container-fluid text-center">

    <div style="">

        <div class="row">

            <div class="col-lg-4 col-lg-push-4 col-md-6 col-md-push-3 col-sm-8 col-sm-push-2 col-xs-10 col-xs-push-1">
                <div class="jumbotron" style="padding-top: 40px; padding-bottom: 30px;">
                    <div class="h3 text-center">新增部门</div>

                    <div class="row">
                        <div class="col-md-12">
                            <form class="form" action="/PMIS/department/new" method="post">
                                <div class="form-group">
                                    <label class="sr-only" for="name">Email address</label>
                                    <input type="text" class="form-control" id="name"
                                           name="name"
                                           placeholder="部门名称">
                                </div>
                                <div class="clearfix"></div>
                                <div class="form-group">
                                    <label class="sr-only" for="fromDepartmentId">Password</label>
                                    <input type="number" class="form-control" id="fromDepartmentId"
                                           name="fromDepartmentId"
                                           placeholder="部门所属">
                                </div>
                                <div class="clearfix"></div>
                                <div class="form-group">
                                    <label class="sr-only" for="departmentLeaderId">Password</label>
                                    <input type="number" class="form-control" id="departmentLeaderId"
                                           name="departmentLeaderId"
                                           placeholder="部门领导">
                                </div>
                                <div class="clearfix"></div>
                                <div class="form-group">
                                    <label class="sr-only" for="departmentPhone">Password</label>
                                    <input type="number" class="form-control" id="departmentPhone"
                                           name="departmentPhone"
                                           placeholder="部门电话">
                                </div>
                                <div class="clearfix"></div>
                                <div class="form-group">
                                    <label class="sr-only" for="office">Password</label>
                                    <input type="text" class="form-control" id="office"
                                           name="office"
                                           placeholder="办公室">
                                </div>
                                <div class="clearfix"></div>
                                <div class="form-group">
                                    <label class="sr-only" for="note">Password</label>
                                    <input type="text" class="form-control" id="note"
                                           name="note"
                                           placeholder="备注">
                                </div>
                                <div class="clearfix"></div>


                                <div class="form-group" style="margin: 10px 0px 0px 0px;">
                                    <button type="submit" name="submit" class="btn btn-lg btn-success center-block">添加
                                    </button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>

            </div>

        </div>

    </div>


</div>

