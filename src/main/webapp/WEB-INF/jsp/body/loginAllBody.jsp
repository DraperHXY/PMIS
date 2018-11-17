<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
</head>
<body>

<div class="container-fluid text-center">

    <div style="margin-top: 15%;">
        <h1 class="text-center">人事管理信息系统</h1>

        <div class="row">

            <div class="col-lg-4 col-lg-push-4 col-md-6 col-md-push-3 col-sm-8 col-sm-push-2 col-xs-10 col-xs-push-1">
                <div class="jumbotron" style="padding-top: 40px; padding-bottom: 30px;">
                    <div class="row">
                        <div class="col-md-12">
                            <form class="form" action="/PMIS/user/loginIn" method="post">
                                <div class="form-group">
                                    <label class="sr-only" for="account">Email address</label>
                                    <input type="email" class="form-control" id="account"
                                           name="account"
                                           placeholder="账号">
                                </div>
                                <div class="clearfix"></div>
                                <p></p>
                                <div class="form-group">
                                    <label class="sr-only" for="password">Password</label>
                                    <input type="password" class="form-control" id="password" name="password"
                                           placeholder="密码">
                                </div>
                                <div class="clearfix"></div>

                                <div class="form-group" style="margin: 10px 0px 0px 0px;">
                                    <button type="submit" name="submit" class="btn btn-lg btn-success center-block">登录
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
</body>
</html>