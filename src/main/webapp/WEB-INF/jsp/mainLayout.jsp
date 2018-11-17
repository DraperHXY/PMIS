<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" isELIgnored="false"
         isErrorPage="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>

<head>
    <tiles:insertAttribute name="head"/>
</head>

<body>
<tiles:insertAttribute name="header"/>
<row>
    <div id="menu" class="col-md-2" style="background: #F8F8F8; padding-right: 15px; padding-left: 0px;">
        <tiles:insertAttribute name="menu"/>
    </div>
    <div class="col-md-10" style="padding-left: 0px;">
        <tiles:insertAttribute name="body"/>
    </div>

</row>
</body>
</html>
