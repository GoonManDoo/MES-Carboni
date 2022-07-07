<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="https://uicdn.toast.com/grid/latest/tui-grid.css" />
<script src="https://uicdn.toast.com/grid/latest/tui-grid.js"></script>
<script src="https://code.jquery.com/jquery-3.5.1.min.js" crossorigin="anonymous"></script>

<style>
h1 {
	margin: 20px 10px 10px 20px;
}

#container {
	width: 100%;
	clear: both;
}

.left {
	width: 35%;
	float: left;
	margin: 10px;
}

.right {
	width: 60%;
	float: right;
	margin: 10px;
}

#menu {
	float: right;
	margin-right: 20px;
	text-align: right;
}

label {
	width: 80px;
	font-size: 80%;
}

fieldset {
	width: 560px;
}
</style>

<body>
	<h1>자재정보관리</h1>
	<div id="menu">
		<a href="/">홈</a> > 기준정보관리 > <b>자재정보관리</b>
	</div>
	<div id="btns" class="card-header">
		<button type="button" class="btn btn-secondary">새자료</button>
		<button type="button" class="btn btn-secondary">저장</button>
		<button type="button" class="btn btn-secondary">삭제</button>
	</div>

	<div id="container">
		<div class="left">
			<div id="grid"></div>
		</div>
		<div class="right">
			<form id="matmain" action="#">
				<fieldset>
					<label for="miCode">자재코드</label> <input type="text" id="miCode">
					<label for="miName">자재명</label> <input type="text" id="miName">
				</fieldset>
				<fieldset>
					<label for="miStand">규격</label> <input type="text" id="miStand">
					<label for="miunit">단위</label> <input type="text" id="miunit">
				</fieldset>
				<fieldset>
					<label for="miSafe">안전재고</label> <input type="text" id="miSafe">
					<label for="miMax">MAX재고</label> <input type="text" id="miMax">
					<label for="miMin">MIN재고</label> <input type="text" id="miMin">
				</fieldset>
				<input type="submit" value="상세정보">
			</form>
		</div>
	</div>

</body>

<script>
	var gridData = [];

	var grid = new tui.Grid({
		el : document.getElementById('grid'),
		data : gridData,
		scrollX : false,
		scrollY : false,
		rowHeaders : [ 'rowNum' ],
		columns : [ {
			header : '자재코드',
			name : 'c1',
			align : 'center',
		}, {
			header : '자재명',
			name : 'c2',
			align : 'center'
		} ]
	});
</script>
</html>