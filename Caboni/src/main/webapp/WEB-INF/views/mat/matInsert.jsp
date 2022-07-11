<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>matInsert</title>
<script>
	$(function() {

				var dialog = makeModal();
		//버튼클릭
		$("#btnModal").on("click", function() {
			$("#dialog").load('matInsertAdd.do', function() {
				dialog.dialog("open");
			})
		})

		function makeModal() {
			var dialog = $("#dialog").dialog({
				autoOpen : false,
				height : 700,
				width : 700,
				modal : true,
				
			});
			return dialog;
		}
		;

	});

	function contentsAdd() {

	}
</script>


<style>
ul {
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

.ht {
	height: 28px;
}
</style>

</head>
<body class="sb-nav-fixed">
	<div class="container-fluid px-4">
		<h1 class="mt-4">입고관리</h1>
		<div class="card mb-2">
			<div class="card-header">
				<div style="display: flex; justify-content: flex-end;">
					<button type="button" id="saveBtn" class="btn btn-secondary"
						style="margin-right: 5px;">저장</button>
					<button type="button" id="removeBtn" class="btn btn-secondary"
						style="margin-right: 5px;">삭제</button>
				</div>
			</div>
		</div>

		<!-- 버튼 끝  -->
		<div class="card mb-2">
			<div class="card-body">
				<!-- 검색폼  -->
				<form autocomplete="off" id="dataForm">
					<div class="container-fluid"
						style="display: flex; flex-flow: row wrap; justify-content: space-between;">
						<!-- 입고일자 입고업체 업체명 특기사항   -->
						<div class="item ">
							<table class="table table-bbs">
								<tbody>
									<!-- 일자겁색 -->
									<tr>
										<th><label>입고일자</label></th>
										<td colspan="4">
											<div class="mt-1">
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
									<!-- 입고업체  -->
									<tr>
										<th>입고업체</th>
										<td><input type="text" id="planDt"
											class="form-control ht" maxlength="10" tabindex="2"></td>
										<td><button type="button" class="btn btn-secondary"
												style="margin-right: 5px;">🔍</button></td>
										<th><label>업체명</label></th>
										<td><input type="text" class="form-control ht"
											maxlength="10" tabindex="2"></td>
									</tr>
									<tr>
										<th>특이사항</th>
										<td><input type="text" id="remark"
											class="form-control ht" maxlength="10" tabindex="2"></td>
										<td colspan="3">
									</tr>
								</tbody>
							</table>
						</div>

						<!-- 발주일자 조회  -->
						<div class="item col-5 border"
							style="width: 600px; height: 100px; margin: 10px;">
							<div class="grid-option-area mt-1">
								<ul>
									<li>
										<h3 class="subtitle"
											style="margin: 15px 0px 2px; width: 400px; font-size: 16px; font-weight: bold;">
											발주조회</h3>
									</li>
									<li class="mt-1 grid-option-area"
										style="margin: 10px; padding: 5px 0px 0px 5px;">
										<div>
											<label class="mg5">발주일자</label>
											<!--검색 시작일 -->
											<div
												class="tui-datepicker-input tui-datetime-input tui-has-focus mg5">
												<input id="orderSdate" type="text" class="form-control"
													aria-label="Date"> <span class="tui-ico-date"></span>
												<div id="orderSdate-wapper" style="margin-left: -1px;"></div>
											</div>

											<span class="mg5">~</span>

											<div
												class="tui-datepicker-input tui-datetime-input tui-has-focus mg5">
												<input id="orderEdate" type="text" class="form-control"
													aria-label="Date"> <span class="tui-ico-date"></span>
												<div id="orderEdate-wapper" style="margin-left: -1px;"></div>
											</div>
											<button type="button" class="btn btn-secondary btn-block"
												id="btnModal">검색</button>
										</div>
									</li>
								</ul>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<div id="grid" class="container-fluid px-4"></div>
	<div id="dialog" title="입고내용"></div>

	<!-- 그리드 내용  -->
	<script>
		/* 입고일자 데이트 피커  */
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
					new Date(today.getFullYear() + 1, today.getMonth(), today
							.getDate()) ] ]
		});

		/* 발주일자 데이트 피커  */
		var today = new Date();
		var picker = tui.DatePicker.createRangePicker({
			startpicker : {
				date : today,
				input : '#orderSdate',
				container : '#orderSdate-wapper'
			},
			endpicker : {
				date : today,
				input : '#orderEdate',
				container : '#orderEdate-wapper'
			},
			selectableRanges : [ [
					today,
					new Date(today.getFullYear() + 1, today.getMonth(), today
							.getDate()) ] ]
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
</body>
</html>