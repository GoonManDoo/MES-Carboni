<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"
	crossorigin="anonymous"></script>
<style>
h1 {
	margin: 20px 10px 10px 20px;
}

#menu {
	float: right;
	margin-right: 20px;
	text-align: right;
}

#container {
	clear: both;
}

#myf {
	margin: 10px;
	clear: both;
	width: 550px;
	display: none;
}

#myf>label {
	width: 60px;
	font-size: 80%;
}
</style>

<body>

	<h1>공정코드 관리</h1>
	<div id="menu">
		<a href="/">홈</a> > 기준정보관리 > <b>공정코드관리</b>
	</div>
	<div id="btns" class="card-header">
		<button type="button" class="btn btn-secondary" id="newbtn">신규</button>
		<button type="button" class="btn btn-secondary" id="savbtn">저장</button>
		<button type="button" class="btn btn-secondary">삭제</button>
	</div>
	<form action="#" id="myf">
		<label for="piCode">공정코드</label> <input type="text" id="piCode">
		<label for="piName">공정명</label> <input type="text" id="piName">
		<label for="piDate">소요일수</label> <input type="text" id="piDate">
		<label for="piNote">비고</label> <input type="text" id="piNote">
		<label for="pione">1차공정</label> <input type="text" id="pione">
		<label for="pitwo">2차공정</label> <input type="text" id="pitwo">
		<label for="pithree">3차공정</label> <input type="text" id="pithree">
		<label for="pifour">4차공정</label> <input type="text" id="pifour">
	</form>
	<div id="container">
		<div class="card mb-4">
			<div class="card-header">
				<i class="fas fa-table me-1"></i> 코드상세
			</div>
			<div class="card-body">
				<table id="datatablesSimple">
					<thead>
						<tr>
							<th><input type="checkbox"></th>
							<th>공정코드</th>
							<th>공정명</th>
							<th>생산일수</th>
							<th>비고</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><input type="checkbox"></td>
							<td>002</td>
							<td>7E-ABC</td>
							<td>10일</td>
							<td></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
<script>
	$('#newbtn').click(function() {
		$('#myf').show();
	})
	$('#savbtn').click(function() {
		$('#myf').hide();
	})
	
</script>
</html>