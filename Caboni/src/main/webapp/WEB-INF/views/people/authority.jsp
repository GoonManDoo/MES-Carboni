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
</style>
<body>

	<h1>권한관리</h1>
	<div id="menu">
		<a href="#">홈</a> > 사원 > <b>권한관리</b>
	</div>
	<div id="container">

		<div class="card mb-4">
			<div class="card-body">
				<table id="datatablesSimple">
					<thead>
						<tr>
							<th>권한 코드</th>
							<th>권한 등급</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>a</td>
							<td>관리자</td>
						</tr>
						<tr>
							<td>u</td>
							<td>사용자</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>

	</div>

</body>
</html>