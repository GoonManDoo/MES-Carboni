<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="container-fluid px-4">
		<div class="card mb-4">
			<!--  그리드에 정보 끌어올수있는 기능-->
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
					header : '발주일자',
					align : 'center',
				}, {
					header : '발주코드',
					align : 'center',
					sortingType : 'desc',
					sortable : true
				}, {
					header : '입고체명',
					align : 'center',
					sortingType : 'desc',
					sortable : true
				}, {
					header : '자재명',
					align : 'center',
				}, {
					header : '자재코드',
					align : 'center',
				}, {
					header : '자재단위',
					align : 'center',
				} ]
			});
		})
	</script>

</body>


</html>