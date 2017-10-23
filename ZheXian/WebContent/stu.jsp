<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Radar Chart</title>
<script src="${pageContext.request.contextPath }/js/Chart.js"></script>
<script src="${pageContext.request.contextPath }/js/jquery-3.2.1.min.js"></script>
<meta name="viewport" content="initial-scale = 1, user-scalable = no">
<style>
canvas {
	
}
</style>
</head>

<body>
	<h2>学生成绩</h2>
<table id="mytb" border="1">
	<tr>
		<td>编号</td><td>姓名</td><td>语文</td><td>数学</td><td>英文</td><td>物理</td><td>化学</td><td>管理</td>
	</tr>
</table>
<h6>${stu.sname }成绩</h6>
	<div style="width: 30%">
		<canvas id="canvas" height="450" width="450"></canvas>
	</div>
</body>
</html>
<script>
var yuwen = ${stu.yuwen };
var shuxue = ${stu.shuxue };
var yinwu = ${stu.yinwu};
var wuli = ${stu.wuli};
var huaxue = ${stu.huaxue};
	$(function(){
		$("#mytb tr:not(:first)").remove();
		//获取所有学生成绩
		$.get("stuAction_findstu",null,function(data){
			$.each(data.stuList,function(i,v){
				var str = "<tr>";
					str+= "<td>"+(i+1)+"</td>";
					str+= "<td>"+v.sname+"</td>";
					str+= "<td>"+v.yuwen+"</td>";
					str+= "<td>"+v.shuxue+"</td>";
					str+= "<td>"+v.yinwu+"</td>";
					str+= "<td>"+v.wuli+"</td>";
					str+= "<td>"+v.huaxue+"</td>";
					str+= "<td><a href='stuAction_findstuById?s.sno="+v.sno+"'>查询</a></td>";
					str+= "</tr>";
				$("#mytb").append(str);
			});
		},"json");
	})


//-------------------------------------------------------------------------------------------
		window.onload = function() {
			var ctx = document.getElementById("canvas").getContext("2d");
			ctx.fillRect(10, 10, 20, 20);
		};
		var radarChartData = {
			labels : [ "语文", "数学", "英语", "物理", "化学"],
			datasets : [	
			{
				label : "My Second dataset",
				fillColor : "rgba(151,187,205,0.2)",
				strokeColor : "rgba(151,187,205,1)",
				pointColor : "rgba(151,187,205,1)",
				pointStrokeColor : "#fff",
				pointHighlightFill : "#fff",
				pointHighlightStroke : "rgba(151,187,205,1)",
				data : [ yuwen, shuxue, yinwu, wuli, huaxue ]
			}
			]
		};
		window.onload = function() {
			window.myRadar = new Chart(document.getElementById("canvas")
					.getContext("2d")).Radar(radarChartData, {
				responsive : true
			});
		}
</script>