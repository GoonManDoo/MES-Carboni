<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="https://code.jquery.com/jquery-3.5.1.min.js" crossorigin="anonymous"></script>
<style>
h1 {
	margin: 20px 10px 10px 20px;
}

#myf {
	margin: 10px;
	width: 600px;
	clear: both;
}

#myf>label {
	width: 100px;
	font-size: 80%;
}

#menu {
	float: right;
	margin-right: 20px;
	text-align: right;
}
</style>
<body>

	<div id="container">

		<h1>거래처정보관리</h1>
		<div id="menu">
			<a href="/">홈</a> > 기준정보관리 > <b>거래처정보관리</b>
		</div>
		<div id="btns" class="card-header">
			<button type="button" class="btn btn-secondary">저장</button>
			<button type="button" class="btn btn-secondary">삭제</button>
		</div>
		<form action="#" id="myf">
			<label for="csCode">거래처코드</label> <input type="text" id="csCode">
			<label for="csName">거래처명</label> <input type="text" id="csName">
			<label for="csNum">사업자등록번호</label> <input type="text" id="csNum">
			<label for="csTel">전화번호</label> <input type="text" id="csTel">
			<label for="csNote">비고</label> <input type="text" id="csNote">
			<label for="csGB">거래처구분</label> <input type="text" id="csGB">
		</form>

		<div class="card mb-4">
			<div class="card-header">
				<i class="fas fa-table me-1"></i> 코드상세
			</div>
			<div class="card-body">
				<table id="datatablesSimple">
					<thead>
						<tr>
							<th><input type="checkbox"></th>
							<th>거래처코드</th>
							<th>거래처명</th>
							<th>사업자번호</th>
							<th>전화번호</th>
							<th>거래처구분</th>
							<th>비고</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><input type="checkbox"></td>
							<td>002</td>
							<td>(주)태왕테크</td>
							<td>701-09-00047</td>
							<td>010-7754-7754</td>
							<td>자재거래</td>
							<td></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>

	</div>

</body>

</html>