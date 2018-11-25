<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" language="java" %>
<div class="panel panel-default">

    <div class="panel-heading">
        <div class="row">
            <h1 class="h1 col-md-6">新增员工</h1>
        </div>
    </div>

    <div class="panel-body">
        <form class="form" action="/PMIS/employee/new" method="post">

            <div class="row">
                <div class="col-md-3">
                    <div class="row">
                        <label class="control-label col-md-3 text-right" style="padding: 7px 0px 0px 0px;">工号</label>
                        <div class="col-md-9">
                            <input type="text" class="form-control" value="${workId}" readonly="readonly" name="workId">
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <label class="control-label col-md-3 text-right" style="padding: 7px 0px 0px 0px;">姓名</label>
                        <div class="col-md-9">
                            <input type="text" class="form-control" name="name">
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <label class="control-label col-md-3 text-right" style="padding: 7px 0px 0px 0px;">出生日期</label>
                        <div class="col-md-9">
                            <input type="date" class="form-control" name="birthDay">
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <label class="control-label col-md-3 text-right" style="padding: 7px 0px 0px 0px;">性别</label>
                        <div class="col-md-9">
                            <select class="form-control" name="sex">
                                <option value="1">男</option>
                                <option value="0">女</option>
                            </select>
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <label class="control-label col-md-3 text-right" style="padding: 7px 0px 0px 0px;">民族</label>
                        <div class="col-md-9">
                            <input type="text" class="form-control" name="nation">
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <label class="control-label col-md-3 text-right" style="padding: 7px 0px 0px 0px;">身份证号</label>
                        <div class="col-md-9">
                            <input type="number" class="form-control" name="personId">
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <label class="control-label col-md-3 text-right" style="padding: 7px 0px 0px 0px;">移动电话</label>
                        <div class="col-md-9">
                            <input type="number" class="form-control" name="phone">
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <label class="control-label col-md-3 text-right" style="padding: 7px 0px 0px 0px;">居住地址</label>
                        <div class="col-md-9">
                            <input type="text" class="form-control" name="address">
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <label class="control-label col-md-3 text-right" style="padding: 7px 0px 0px 0px;">邮箱</label>
                        <div class="col-md-9">
                            <input type="text" class="form-control" name="email">
                        </div>
                    </div>
                    <br>

                </div>

                <div class="col-md-3">
                    <div class="row">
                        <div class="row">
                            <label class="control-label col-md-3 text-right"
                                   style="padding: 7px 0px 0px 0px;">状态</label>
                            <div class="col-md-9">
                                <select class="form-control" name="state">
                                    <option value="internship">实习</option>
                                    <option value="onJob">在职</option>
                                </select>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <label class="control-label col-md-3 text-right"
                                   style="padding: 7px 0px 0px 0px;">岗位</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="job">
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <label class="control-label col-md-3 text-right"
                                   style="padding: 7px 0px 0px 0px;">职务</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="duty">
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <label class="control-label col-md-3 text-right"
                                   style="padding: 7px 0px 0px 0px;">职务类型：</label>
                            <div class="col-md-9">
                                <select class="form-control" name="dutyType">
                                    <option value="it">技术</option>
                                    <option value="management">管理</option>
                                    <option value="hr">人力</option>
                                    <option value="finance">财务</option>
                                </select>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <label class="control-label col-md-3 text-right"
                                   style="padding: 7px 0px 0px 0px;">职称：</label>
                            <div class="col-md-9">
                                <select class="form-control" name="jobTitle">
                                    <option value="P1">P1</option>
                                    <option value="P2">P2</option>
                                    <option value="P3">P3</option>
                                    <option value="P4">P4</option>
                                    <option value="P5">P5</option>
                                    <option value="P6">P6</option>
                                    <option value="P7">P7</option>
                                    <option value="P8">P8</option>
                                    <option value="P9">P9</option>
                                    <option value="P10">P10</option>
                                    <option value="P11">P11</option>
                                    <option value="P12">P12</option>
                                    <option value="P13">P13</option>
                                </select>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <label class="control-label col-md-3 text-right"
                                   style="padding: 7px 0px 0px 0px;">职责描述：</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="dutyDescription">
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <label class="control-label col-md-3 text-right"
                                   style="padding: 7px 0px 0px 0px;">办公室：</label>
                            <div class="col-md-9">
                                <select class="form-control" name="office">
                                    <c:forEach items="${allDepartments}" var="department">
                                        <option value="${department.office}">${department.office}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <label class="control-label col-md-3 text-right"
                                   style="padding: 7px 0px 0px 0px;">部门：</label>
                            <div class="col-md-9">
                                <select class="form-control" name="departmentId">
                                    <c:forEach items="${allDepartments}" var="department">
                                        <option value="${department.id}">${department.name}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <label class="control-label col-md-3 text-right" style="padding: 7px 0px 0px 0px;">直接上级：</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="superiorId">
                            </div>
                        </div>
                        <br>
                    </div>
                </div>

                <div class="col-md-3">


                    <div class="row">
                        <label class="control-label col-md-3 text-right" style="padding: 7px 0px 0px 0px;">账号：</label>
                        <div class="col-md-9">
                            <input type="text" class="form-control" name="account">
                        </div>
                    </div>
                    <br>

                    <div class="row">
                        <label class="control-label col-md-3 text-right" style="padding: 7px 0px 0px 0px;">密码：</label>
                        <div class="col-md-9">
                            <input type="password" class="form-control" name="password">
                        </div>
                    </div>
                    <br>

                    <div class="form-group" style="margin: 10px 0px 0px 0px;">
                        <button type="submit" name="submit" class="btn btn-success center-block">上传
                        </button>
                    </div>
                </div>


            </div>
        </form>
    </div>


</div>

