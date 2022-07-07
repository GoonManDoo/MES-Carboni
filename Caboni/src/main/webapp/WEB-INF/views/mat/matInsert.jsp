<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/matStyle.css" rel="stylesheet" />
<link rel="stylesheet"
	href="https://uicdn.toast.com/tui.date-picker/latest/tui-date-picker.css" />
<script
	src="https://uicdn.toast.com/tui.date-picker/latest/tui-date-picker.js"></script>

<title>matInsert</title>
<script>
	$(function() {

		//버튼클릭
		$("#btnModal").on("click", function() {
			$("#dialog").load('matInsertAdd.do', function() {
				var dialog = makeModal();
				dialog.dialog("open");
			})
		})

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

	});

	function contentsAdd() {

	}
</script>


<style>
li {
	list-style: none;
}

.subtitle {
	text-decoration: none;
	font-size: 20px;
	margin: 2px 0px 2px;
	width: 400px;
}

.grid-option-area {
	display: flex;
	text-align: justify;
	justify-content: space-between;
	margin-bottom: 10px;
}

.tui-datepicker {
	z-index: 99;
}
</style>

</head>
<body>
	<main>
		<div class="container-fluid px-4">
			<h1 class="mt-4">입고 관리</h1>

			<form>
				<!-- 버튼내용 -->
				<div class="card mb-4">
					<div class="card-header">
						<div class="card-button btnlist">
							<button type="button" class="btn btn-secondary btn-block">삭제</button>
							<input type="submit" value="저장"
								class="btn btn-secondary btn-block">
						</div>
					</div>
				</div>

				<div class="grid-option-area">
					<div class="container" style="disply: flex;">
						<div class="col-6">
							<table class="item">
								<tr>
									<th>입고일자</th>
									<td>
										<!--일자 데이터 피커   -->
										<div class="mt-1 grid-option-area">
											<div
												class="tui-datepicker-input tui-datetime-input tui-has-focus">
												<input type="text" id="startpicker-input"
													aria-label="Date-Time" tabindex="1"> <span
													class="tui-ico-date"></span>
											</div>
											<div id="startpicker-container" style="margin-left: -1px;"></div>
											<span>~</span>

											<div
												class="tui-datepicker-input tui-datetime-input tui-has-focus">
												<input type="text" id="endpicker-input"
													aria-label="Date-Time" tabindex="1"> <span
													class="tui-ico-date"></span>
												<div id="endpicker-container" style="margin-left: -1px;"></div>
											</div>
										</div> <!--클래스 mt-1 grid-option-area 끝   -->
									</td>
								</tr>
								<!-- 입고업체  -->
								<tr>
									<th>입고업체</th>
									<td><input type="text">
										<button>🔍</button></td>
									<th>업체명</th>
									<td><input type="text"></td>
								</tr>
								<tr>
									<th>특기사항</th>
									<td colspan="4"><input type="text" style="width: 600px;"></td>
								</tr>

							</table>
						</div>
						<!-- 클래스 col-6 끝 -->
						<!-- 발주검색  -->

						<div class="col-5 border item ">
							<ul>
								<li>
									<h3 class="subtitle">발주조회</h3>
								</li>
								<li><label>발주일자</label>
									<div class="mt-1 grid-option-area">
										<div>
											<input name="rdt" class="rdt">
										</div>
										<label>~</label>
										<div>
											<input name="rdt" class="rdt">
										</div>
										<button type="button" class="btn btn-secondary btn-block">검색</button>
									</div></li>
							</ul>
						</div>
						<!-- 발주조회칸 끝 -->
					</div>
					<!-- 클래스 container 끝  -->
					</div>
					<!-- 버튼 -->
					<div>
						<div>
							<button type="button" id="btnModal" class="btn btn-secondary btn-block">추가</button>
						</div>
						<div>
							<button type="button" class="btn btn-secondary btn-block">삭제</button>
						</div>
					</div>
				
				<!-- 클래스 grid-option-area 끝  -->
			</form>
			<!-- form 끝  -->
			<div id="grid"></div>
		</div>
		<!-- 전체 묶는 것 클래스 container-fluid px-4 -->
		<!-- 모달  -->
		<div id="dialog" title="입고내용"></div>

		<!-- 그리드 내용  -->
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
					header : '자재코드',
					sortingType : 'desc',
					align : 'center',
					sortable : true
				}, {
					header : '자재명',
					align : 'center'
				}, {
					header : '규격',
					align : 'center'
				}, {
					header : '자재단위',
					align : 'center'
				}, {
					header : '발주번호',
					align : 'center'
				}, {
					header : '입고량',
					align : 'center',
					editor : 'text'
				}, {
					header : '자재 LOT.NO',
					align : 'text'
				}, {
					header : '특기사항',
					align : 'center'
				} ],
				summary : {
					height : 40,
					position : 'bottom',
					columnContent : {
						c6 : {
							template : function(valueMap) {
								return `TOTAL: ${valueMap.sum}`;
							}
						}
					}
				}
			});
		</script>


	</main>
</body>
</html>