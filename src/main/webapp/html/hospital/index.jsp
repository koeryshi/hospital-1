<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>入院办理--中软高科-2015</title>
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
    <script type="text/javascript">
	 $(function () {
		$('#newNav').click(function(){
				window.location.href="add.html";
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
         $.ajax({
             type:"post",
             url:"${pageContext.request.contextPath}/zhuyuan/selectInfo",
             datatype:"json",
             success:function (returndata) {
                 $(returndata).each(function (index,item) {
                     var time=formatDateTime(item.behpdate);
                     var st="<tr class='old'><td style='vertical-align:middle;'><input type='checkbox' name='check' value='1'></td>"
                         +"<td style='vertical-align:middle;'>"+item.behpid+"</td>"
                         +"<td style='vertical-align:middle;'>"+item.behpname+"</td>"
                         +"<td style='vertical-align:middle;'>"+item.behpbed+"</td>"
                         +"<td style='vertical-align:middle;'>"+item.hosregister.hosrphone+"</td>"
                         +"<td style='vertical-align:middle;'>"+item.behpmoney+"</td>"
                         +"<td style='vertical-align:middle;'>"+item.doctor.dname+"</td>"
                         +"<td style='vertical-align:middle;'>"+time+"</td>"
                         +"<td style='vertical-align:middle;'>"+item.department.departname+"</td>"
                         +"<td style='vertical-align:middle;'>"+item.state.statename+"</td>"
                         +"<td style='vertical-align:middle;'>"
                         +"<a href='look.html'>详情>></a>&nbsp;&nbsp;&nbsp;"
                         +"<a href='edit.html'>更改</a>&nbsp;&nbsp;&nbsp;"
                     if(item.state.stateid==4 || item.state.stateid==5){
                     }else {
                         st+="<a href='add_many.html'>缴纳押金</a>&nbsp;&nbsp;&nbsp;"
                     }
                     st+= "</td> </tr>"
                     $("#tr2").after(st);
                 })
             }
         })
     });
     function formatDateTime(timeStamp) {
         var date = new Date();
         date.setTime(timeStamp);
         var y = date.getFullYear();
         var m = date.getMonth() + 1;
         m = m < 10 ? ('0' + m) : m;
         var d = date.getDate();
         d = d < 10 ? ('0' + d) : d;
         /*var h = date.getHours();
         h = h < 10 ? ('0' + h) : h;
         var minute = date.getMinutes();
         var second = date.getSeconds();
         minute = minute < 10 ? ('0' + minute) : minute;
         second = second < 10 ? ('0' + second) : second;*/
         return y + '-' + m + '-' + d;
         /* return y + '-' + m + '-' + d+' '+h+':'+minute+':'+second;*/
     };
     function submit() {
         $(".old").remove();
        /* var param=$("#form1").serializeObject();*/
             $.ajax({
                 async: false,
                 type: "post",
                 dataType: "json",
                 url: "${pageContext.request.contextPath}/zhuyuan/selectInfo" ,
                 data: $('#form1').serialize(),
                 success: function (returndata) {
                     $(returndata).each(function (index,item) {

                     })
                 },
                 error : function() {
                     alert("异常！");
                 }
             });


     }
    </script>
</head>
<body>

<form  class="definewidth m20" id="form1">
<table class="table table-bordered table-hover definewidth m10">
    <tr>
        <td width="10%" class="tableleft">病例号：</td>
        <td><input type="text" name="behpid"/></td>
		
        <td width="10%" class="tableleft">主治医生：</td>
        <td><input type="text" name="behpDocId" value=""/></td>
		
        <td width="10%" class="tableleft">科室：</td>
        <td><input type="text" name="hehpDepartId" value=""/></td>
    </tr>
    <tr>
		
        <td width="10%" class="tableleft">住院时间：</td>
		
		  <td colspan="5">
			<input type="date" name="date1" value=""/>&nbsp;至&nbsp;<input type="date" name="date2" value=""/>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <button type="button" class="btn btn-primary" onclick="submit()">查询</button>
            <button type="reset" class="btn btn-primary">清空</button>
			
        </td>
    </tr>
</table>
</form>
   
<table class="table table-bordered table-hover definewidth m10" >
   <thead>
    <tr id="tr2">
    	<th><input type="checkbox" id="checkall" onChange="checkall();"></th>
        <th>病历号</th>
        <th>姓名</th>
        <th>床位号</th>
        <th>联系电话</th>
        <th>押金</th>
        <th>主治医生</th>
        <th>入院时间</th>
        <th>科室</th>
        <th>状态</th>
        <th>操作</th>
    </tr>
    </thead>
	    <%-- <tr >
         	<td style="vertical-align:middle;"><input type="checkbox" name="check" value="1"></td>
            <td style="vertical-align:middle;">1103</td>
            <td style="vertical-align:middle;">黄飞鸿</td>
            <td style="vertical-align:middle;">4343</td>
            <td style="vertical-align:middle;">13127653423</td>
            <td style="vertical-align:middle;">2000元</td>
            <td style="vertical-align:middle;">程俊</td>
            <td style="vertical-align:middle;">2015-01-05 12:33:56</td>
            <td style="vertical-align:middle;">血液科</td>
            <td style="vertical-align:middle;">已住院</td>
            <td style="vertical-align:middle;">
				<a href="look.html">详情>></a>&nbsp;&nbsp;&nbsp;
				<a href="edit.html">更改</a>&nbsp;&nbsp;&nbsp;
				<a href="add_many.html">缴纳押金</a>&nbsp;&nbsp;&nbsp;				
				
				
			</td>
        </tr>--%>

  </table>
  
  <table class="table table-bordered table-hover definewidth m10" >
  	<tr><th colspan="5">  <div class="inline pull-right page">
          <a href='#' >第一页</a> <a href='#'>上一页</a>     <span class='current'>1</span><a href='#'>2</a><a href='/chinapost/index.php?m=Label&a=index&p=3'>3</a><a href='#'>4</a><a href='#'>5</a>  <a href='#' >下一页</a> <a href='#' >最后一页</a>
		  &nbsp;&nbsp;&nbsp;共<span class='current'>32</span>条记录<span class='current'> 1/33 </span>页
		  </div>
		 <div><button type="button" class="btn btn-success" id="newNav">添加住院信息</button>&nbsp;&nbsp;&nbsp;
		 <button type="button" class="btn btn-success" id="delPro" onClick="delAll();">出院</button>&nbsp;&nbsp;&nbsp;
		 <button type="button" class="btn btn-success" id="delPro" onClick="delAll();">退院</button>&nbsp;&nbsp;&nbsp;
		 <button type="button" class="btn btn-success" id="delPro">导出Excel</button>
		 </div>
		 
		 </th></tr>
  </table>
  
</body>
</html>
