<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>matList.jsp</title>
<link
	href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css"
	rel="stylesheet" />
<link href="resources/css/matStyle.css" rel="stylesheet" />


<script>

	$(function() {
		//버튼클릭
		$("#btnModal").on("click", function() {
			$("#dialog").load('matAdd.do', function() {
				var dialog = makeModal();
				dialog.dialog("open");
			})
		});
		
		function makeModal() {
			var dialog = $("#dialog").dialog({
				autoOpen : false,
				height : 700,
				width : 700,
				modal : true,
				buttons : {
					"확인" : contentsAdd,
					"취소" : function() {
						dialog.dialog("close");
					}
				}
			});
			return dialog;
		}
		;

		function contentsAdd() {

		}

	});
	/* 그리드 표만들기 */
	/* 그리드 펑션!*/

	</script>
<style>
.tui-datepicker {
	z-index: 99;
}

.dis{
	display:inline-block;
}
</style>

</head>
<body>
	<main id="container">
	<!-- 전체감싸는 div -->
		<div class="container-fluid px-4">
			<h1 >발주관리</h1>
			<!-- 상단 버튼 모음  -->
			<div class="card mb-4">
				<div class="card-header">
					<div class="card-button btnlist">
						<button type="button" id="btnModal"
							class="btn btn-secondary btn-block">발주</button>
						<input type="submit" value="저장"
							class="btn btn-secondary btn-block">
					</div>
				</div>
			</div>
		</div>

		<div class="card mb-4 table-center container-fluid px-4" >
		<!-- 테이블시작  -->
		<table>
			<tr>
				<th>발주일자</th>
				<td>
					<div class="tui-datepicker-input tui-datetime-input tui-has-focus">
						<input type="text" id="startpicker-input" aria-label="Date-Time" tabindex="1"> 
							<span class="tui-ico-date"></span>
					</div>
					<div id="startpicker-container" style="margin-left: -1px;"></div>
						<span>~</span>
					<div class="tui-datepicker-input tui-datetime-input tui-has-focus">
						<input type="text" id="endpicker-input" aria-label="Date-Time" tabindex="1"> 
						<span class="tui-ico-date"></span>
						<div id="endpicker-container" style="margin-left: -1px;"></div>
					</div>
				</td>
			</tr>
			<tr>
				<th>발주업체</th>
				<td><input type="text">
					<button>🔍</button></td>
				<th>업체명</th>
				<td><input type="text"></td>
			</tr>
			<tr>
				<th>자재코드</th>
				<td><input type="text">
					<button>🔍</button></td>
				<th>자재명</th>
				<td><input type="text"></td>
			</tr>
		</table>
	</div>
	<div class="dis">
		<div><button type="button" id="btnModal" class="btn btn-secondary btn-block">추가</button></div>
		<div><button type="button" class="btn btn-secondary btn-block">삭제</button></div>
	</div>
	
	<div class="container-fluid px-4">
			<div id="grid"></div>
	</div>
		
	<div id="dialog" title="발주내용" ></div>
	<!-- 그리드 내용 만들기  -->
		<script>
		/* 입고일자 데이터 피커  */
		var today = new Date();
		var picker = tui.DatePicker.createRangePicker({
			startpicker : {
				date : today,
				input : '#startpicker-input',
				container : '#startpicker-container'
			},
			endpicker : {
				date : today,
				input : '#endpicker-input',
				container : '#endpicker-container'
			},
			selectableRanges : [ [
					today,
					new Date(today.getFullYear() + 1, today.getMonth(),
							today.getDate()) ] ]
		});

			const gridData = [];
			
			const grid = new tui.Grid({
				el : document.getElementById('grid'),
				data : gridData,
				scrollX : false,
				bodyHeight : 500,
				rowHeaders : [ 'checkbox' ],
				columns : [ {
					header : '발주일자',
					sortingType : 'desc',
					align : 'center',
					sortable : true
				}, {
					header : '발주코드',
					align : 'center'
				}, {
					header : '자재코드',
					align : 'center'
				}, {
					header : '자재명',
					align : 'center'
				}, {
					header : '입고일자',
					align : 'center'
				}, {
					header : '입고처명',
					align : 'center'
				}, {
					header : '발주량',
					align : 'center'
				}, {
					header : '입고량',
					align : 'center'
				}, {
					header : '자재량',
					align : 'center'
				}, {
					header : '발주상태',
					align : 'center'
				}, {
					header : '비고',
					align : 'center'
				} ]
			});
		</script>
	</main>

</body>
</html>