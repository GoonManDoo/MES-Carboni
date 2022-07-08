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


<script>
	$(function() {
		//버튼클릭
				var dialog = makeModal();
		$("#btnModal").on("click", function() {
			$("#dialog").load('matAdd.do', function() {
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

.mg5 {
	margin-top: 5px;
}

.ht {
	height: 28px;
}


</style>

</head>
<body>
	<main id="container">
		<!-- 전체감싸는 div -->
		<div class="container-fluid px-4">
			<h1>발주관리</h1>
			<!-- 상단 버튼 모음  -->
			<div class="card mb-4">
				<div class="card-header">
					<div style="display: flex; justify-content: flex-end;">
						<button type="button" id="btnModal" class="btn btn-secondary btn-block"
							>발주</button>
						<input type="submit" value="저장"
							class="btn btn-secondary btn-block">
					</div>
				</div>
			</div>

			<div class="card mb-2 ">
				<div class="card-body">
					<!-- 발주일자 등 입력 -->
					<form autocomplete="off" id="dataForm">
						<div class="col">
							<table class="table table-bbs">
								<tbody>
									<tr>
										<th><label>발주일자</label></th>
										<td colspan="4">
											<div class="mt-1 grid-option-area">
												<div
													class="tui-datepicker-input tui-datetime-input tui-has-focus">
													<input type="text" id="startpicker-input"
														class="form-control" aria-label="Date-Time" tabindex="1">
													<span class="tui-ico-date "></span>
													<div id="startpicker-container" style="margin-left: -1px;"></div>
												</div>
												
												<span class="mg5">~</span>
												<div
													class="tui-datepicker-input tui-datetime-input tui-has-focus">
													<input type="text" id="endpicker-input"
														class="form-control" aria-label="Date-Time" tabindex="1">
													<span class="tui-ico-date "></span>
													<div id="endpicker-container" style="margin-left: -1px;"></div>
												</div>
											</div>
										</td>
									</tr>
									<tr>
										<th><label>발주업체</label></th>
										<td><input type="text" class="form-control ht"
											maxlength="10" tabindex="2"></td>
										<td><button type="button" class="btn btn-secondary"
												style="margin-right: 5px;">🔍</button></td>
										<th><label>업체명</label></th>
										<td><input type="text" class="form-control ht"
											maxlength="10" tabindex="2"></td>
									</tr>
									<tr>
										<th><label>자재코드</label></th>
										<td><input type="text" class="form-control ht"
											maxlength="10" tabindex="2"></td>
										<td><button type="button" class="btn btn-secondary"
												style="margin-right: 5px;">🔍</button></td>
										<th><label>자재명</label></th>
										<td><input type="text" class="form-control ht"
											maxlength="10" tabindex="2"></td>
									</tr>

								</tbody>
							</table>
						</div>

						<div class="container-fluid px-4 mb-2">
							<div style="display: flex; justify-content: flex-end;">
								<button type="button" class="btn btn-secondary"
									style="margin-right: 5px;">추가</button>
								<button type="button" class="btn btn-secondary"
									style="margin-right: 5px;">삭제</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
		<!-- 그리드  -->
		<div class="container-fluid px-4">
			<div id="grid"></div>
		</div>

		<div id="dialog" title="발주내용"></div>

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
			(function() {
			      for (let i = 0; i < 20; i += 1) {
			         gridData.push({
			            c1 : (i + 1),
			            c2 : ((i + 5) % 8) * 100 + i,
			            c3 : ((i + 3) % 7) * 60,
			            c4 : ((i + 3) % 7) * 60,
			            c5 : ((i + 3) % 7) * 60,
			         });
			      }
			   })();
			

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
			
		/* 	 grid.on('scrollEnd', () => {
			      grid.appendRows(createRows());
			    }) */
		</script>
	</main>

</body>
</html>