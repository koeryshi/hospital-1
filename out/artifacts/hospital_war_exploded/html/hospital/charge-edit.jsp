<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>添加收费项目--中软高科-2015</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../Css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="../Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="../Css/style.css" />
    <script type="text/javascript" src="../Js/jquery.js"></script>
    <script type="text/javascript" src="../Js/jquery.sorted.js"></script>
    <script type="text/javascript" src="../Js/bootstrap.js"></script>
    <script type="text/javascript" src="../Js/ckform.js"></script>
    <script type="text/javascript" src="../Js/common.js"></script>
    <script type="text/javascript" src="../Js/ckeditor/ckeditor.js"></script>
 

    <style type="text/css">
        body {
            padding-bottom: 40px;
        }
        .sidebar-nav {
            padding: 9px 0;
        }

        @media (max-width: 980px) {
            /* Enable use of floated navbar text */
            .navbar-text.pull-right {
                float: none;
                padding-left: 5px;
                padding-right: 5px;
            }
        }


    </style>
    <script type="text/javascript">
    $(function () {       
		$('#backid').click(function(){
				window.location.href="charge.jsp";
		 });
    });
    </script>
</head>
<body>
<form action="${pageContext.request.contextPath}/Chargeproject/chargeprojectUpdate" method="post" class="definewidth m20">
    <input type="hidden" name="cmid" value="${chargeproject.cmid}">
    <table class="table table-bordered table-hover definewidth m10">
    <tr>
        <td width="10%" class="tableleft">编号</td>
        <td>${chargeproject.cmid}</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft"><font color="red">*</font>收费项目名称</td>
        <td><input type="text" name="cmname" value="${chargeproject.cmname}" /></td>
    </tr>

    <tr>
        <td width="10%" class="tableleft"><font color="red">*</font>收费金额</td>
        <td><input type="text" name="cmmoney" value="${chargeproject.cmmoney}"/></td>
    </tr>
    <tr>
        <td colspan="2">
			<center>
				<button type="submit" class="btn btn-primary" type="button">保存</button> &nbsp;&nbsp;<button type="button" class="btn btn-success" name="backid" id="backid">返回列表</button>
			</center>
		</td>
    </tr>
</table>
</form>
</body>
</html>