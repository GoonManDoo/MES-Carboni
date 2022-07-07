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
	margin-right: 20px;
	text-align: right;
}

#container {
	clear: both;
}
h1 {
	margin: 20px 10px 10px 20px;
}
</style>
<body>

	<h1>사원 관리</h1>
	<div id="menu">
		<a href="#">홈</a> > 사원 > <b>사원관리</b>
	</div>
	<div id="container">


		<div class="card mb-4">
			<div class="card-body">
				<table id="datatablesSimple">
					<thead>
						<tr>
							<th><input type="checkbox"></th>
							<th>사원코드</th>
							<th>권한코드</th>
							<th>이름</th>
							<th>입사일</th>
							<th>직책</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><input type="checkbox"></td>
							<td>emp-001</td>
							<td>a</td>
							<td>Steven King</td>
							<td>1990-02-11</td>
							<td>CEO</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>

	</div>

</body>
</html>