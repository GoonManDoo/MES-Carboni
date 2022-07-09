<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />

<title>matAdd modal</title>
<style>
.title {
	text-align: center;
	margin-botton: 5px;
}

table {
	margin: 0 auto;
	width: 100%;
}
</style>
</head>
<body>
	<div id="dialog">
		<div class="container">
			<div class="title">
				거래처명<input type="text" id="input">
				<button class="btn btn-secondary">검색</button>
				<br>

			</div>
			<table border="1">
				<tr>

				</tr>
				<tr>
					<!-- function 기능 들어갈 곳  -->

				</tr>
			</table>
		</div>
		<div class="container-fluid px-4">
			<div class="card mb-4">

				<div id="gridcomp"></div>
			</div>
		</div>
		<button type="button" id="btnModal" class="btn btn-secondary"
			style="margin-right: 5px;">확인</button>
		<button type="button" id="btnModal" class="btn btn-secondary"
			style="margin-right: 5px;">취소</button>

		<script>
			$(function() {

				let grid = new tui.Grid({
					el : document.getElementById('gridcomp'),

					scrollX : false,
					rowHeaders : [ 'checkbox' ],
					bodyHeight : 420,
					columns : [ {
						header : '거래처코드',
						align : 'center',
					}, {
						header : '거래처명',
						align : 'center',
						sortingType : 'desc',
						sortable : true
					}, {
						header : '자재명',
						align : 'center',
						sortingType : 'desc',
						sortable : true
					}, {
						header : '자재코드',
						align : 'center',
					}, {
						header : '규격',
						align : 'center',
					}, {
						header : '자재단위',
						align : 'center',
					}, {
						header : '주문수량',
						align : 'center',
						editor : 'text',
					} ]
				});
			})
		</script>
		<table>
		</table>
	</div>
</body>
</html>