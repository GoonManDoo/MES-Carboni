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
#menu {
	float: right;
}

#container {
	clear: both;
}
</style>
<body>

	<h1>공정코드 관리</h1>
	<div id="menu">
		<a href="#">홈</a> > <a href="#">기준정보관리</a> > 공정코드 관리
	</div>
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
</html>