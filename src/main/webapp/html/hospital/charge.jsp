<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>收费项目登记</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../Css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="../Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="../Css/style.css" />
    <script type="text/javascript" src="../Js/jquery.js"></script>
    <script type="text/javascript" src="../Js/jquery.sorted.js"></script>
    <script type="text/javascript" src="../Js/bootstrap.js"></script>
    <script type="text/javascript" src="../Js/ckform.js"></script>
    <script type="text/javascript" src="../Js/common.js"></script>

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
    <%--时间格式化--%>
    <script type="text/javascript">
        function getMyDate(str) {
            var oDate = new Date(str),
                oYear = oDate.getFullYear(),
                oMonth = oDate.getMonth()+1,
                oDay = oDate.getDate(),
                oHour = oDate.getHours(),
                oMin = oDate.getMinutes(),
                oSen = oDate.getSeconds(),
                oTime = oYear +'-'+ addZero(oMonth) +'-'+ addZero(oDay);
            return oTime;
        }

        //补零操作
        function addZero(num){
            if(parseInt(num) < 10){
                num = '0'+num;
            }
            return num;
        }


        $(function () {
            $.ajax({
                type:'GET',
                dataType:'json',
                url:'${pageContext.request.contextPath}/Chargeproject/chargeprojectShowAll',
                success:function (resultData) {
                    $("#tables tr:gt(0)").remove();
                    $("#tables tr").not(':eq(0)').remove();
                    $(resultData).each(function (index,item) {
                            var dateTime = getMyDate(parseInt(item.cmdate));
                            var tr = "<tr> <td style='vertical-align:middle;'>"+item.cmid+"</td>"
                                +"<td style='vertical-align:middle;'>"+item.cmname+"</td>"
                                +"<td style='vertical-align:middle;'>"+item.cmmoney+"</td>"
                                +"<td style='vertical-align:middle;'>"+dateTime+"</td>"
                                +"<td style='vertical-align:middle;'>"
                                +"<a href='${pageContext.request.contextPath}/Chargeproject/chargeprojectUpdateGetone?id="+item.cmid+"'> 修改 </a>"
                                +"<a href='javascript:void(0)' onclick='del("+item.cmid+")'> 删除 </a>"
                                +"<a href='${pageContext.request.contextPath}/Chargeproject/chargeprojectLookone?id="+item.cmid+"'> 查看详情 </a></td></tr>";
                            $("#tr_th").after(tr);
                    });
                }
            });
        });

        //模糊查询
        function querys(){
            $("#tables tr:gt(0)").remove();
            $("#tables tr").not(':eq(0)').remove();
            $.ajax({
                type:'get',
                dataType:'json',
                data:{"cmName":$("#cmName").val()},
                url:'${pageContext.request.contextPath}/Chargeproject/chargeprojectQuery',
                success:function (resultData) {
                    $(resultData).each(function (index,item) {
                        var dateTime = getMyDate(parseInt(item.cmdate));
                        var tr = "<tr> <td style='vertical-align:middle;'>"+item.cmid+"</td>"
                            +"<td style='vertical-align:middle;'>"+item.cmname+"</td>"
                            +"<td style='vertical-align:middle;'>"+item.cmmoney+"</td>"
                            +"<td style='vertical-align:middle;'>"+dateTime+"</td>"
                            +"<td style='vertical-align:middle;'>"
                            +"<a href='${pageContext.request.contextPath}/Chargeproject/chargeprojectUpdateGetone?id="+item.cmid+"'> 修改 </a>"
                            +"<a href='javascript:void(0)' onclick='del("+item.cmid+")'> 删除 </a>"
                            +"<a href='${pageContext.request.contextPath}/Chargeproject/chargeprojectLookone?id="+item.cmid+"'> 查看详情 </a></td></tr>";
                        $("#tr_th").after(tr);
                    });
                }

            });
        }
        //清空按钮
        function clearform(){
            window.location.reload();
        }

        function del(id){
            if(confirm("确定删除吗")){
                location.href="${pageContext.request.contextPath}/Chargeproject/chargeprojectDeleteGetone?id="+id;
            }else{
                location.href="charge.jsp";
            }
        }

	 $(function () {
		$('#newNav').click(function(){
				window.location.href="charge-add.jsp";
		 });
    });
	
    	function checkall(){
			var alls=document.getElementsByName("check");
			var ch=document.getElementById("checkall");
			if(ch.checked){
				for(var i=0;i<alls.length;i++){
					alls[i].checked=true;	
				}	
			}else{
				for(var i=0;i<alls.length;i++){
					alls[i].checked=false;	
				}	
			}
		}
		function delAll(){
			var alls=document.getElementsByName("check");
			var ids=new Array();
			for(var i=0;i<alls.length;i++){
				if(alls[i].checked){
					ids.push(alls[i].value);
				}		
			}
			if(ids.length>0){
				if(confirm("确认操作?")){
					alert("成功!");
				}
			}else{
				alert("请选中要操作的项");
			}
		}
    $(function () {       
		$('#backid').click(function(){
				window.location.href="dispensing.html";
		 });

    });

    </script>
</head>
<body>
   
<form id="forms" action="${pageContext.request.contextPath}/Chargeproject/chargeprojectQuery" method="post" class="definewidth m20">
<table class="table table-bordered table-hover definewidth m10">
    <tr>
        <td width="10%" class="tableleft">收费项目名称：</td>
        <td width="10%"><input id="cmName" type="text" name="cmName"/></td>
		
        <td>
		    <button  class="btn btn-primary"  type="button" onclick="querys()">查询</button>
            <button id="claerform"  class="btn btn-primary" onclick="clearform()" type="button">清空</button> </td>
    </tr>
   
</table>


</form>
<table id="tables" class="table table-bordered table-hover definewidth m10" >
   <thead id="tr_th">
    <tr>
        <th>编号</th>
        <th>收费项目名称</th>        
        <th>收费金额</th>
        <th>创建日期</th>
        <th>操作</th>
    </tr>
    </thead>
<%--    <tr id="tr2">
        <td style="vertical-align:middle;">1103</td>
        <td style="vertical-align:middle;">心脏检查</td>
        <td style="vertical-align:middle;">200</td>
        <td style="vertical-align:middle;">2015-01-04 10:34</td>
        <td style="vertical-align:middle;">
            <a href="charge-edit1.html">修改</a>
            <a href="">删除</a>
            <a href="charge-edit1.html">查看详情</a>
        </td>
    </tr>--%>
  </table>
  
  <table class="table table-bordered table-hover definewidth m10" >
  	<tr><th colspan="5">  <div class="inline pull-right page">
          <a href='#' >第一页</a> <a href='#'>上一页</a>     <span class='current'>1</span><a href='#'>2</a><a href='/chinapost/index.php?m=Label&a=index&p=3'>3</a><a href='#'>4</a><a href='#'>5</a>  <a href='#' >下一页</a> <a href='#' >最后一页</a>
		  &nbsp;&nbsp;&nbsp;共<span class='current'>32</span>条记录<span class='current'> 1/33 </span>页
		  </div>
		 <div><button type="button" class="btn btn-success" id="newNav">添加收费项目</button>
		 
		 </div>
		 
		 </th></tr>
  </table>
  
</body>
</html>
