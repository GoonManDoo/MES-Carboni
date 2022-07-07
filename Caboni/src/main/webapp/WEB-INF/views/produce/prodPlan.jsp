<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false"%>
<head>
<style>
.tui-datepicker {
	z-index: 99;
}

.grid-option-area {
	-webkit-box-pack: justify;
	justify-content: space-between;
	min-height: 36px;
	margin-bottom: 10px;
}
.ht {
	height: 28px;
}
.mg5 {
	margin-top:5px;
}
</style>
</head>
<body class="sb-nav-fixed">
	<div class="container-fluid px-4">
		<h1 class="mt-4">생산계획관리</h1>
		<div class="card mb-2">
			<div class="card-header">
				<div style="display: flex; justify-content: flex-end;">
					<button type="button" id="searchBtn" class="btn btn-secondary"
						style="margin-right: 5px;">조회</button>
					<button type="button" id="resetBtn" class="btn btn-secondary"
						style="margin-right: 5px;">새자료</button>
					<button type="button" id="saveBtn" class="btn btn-secondary"
						style="margin-right: 5px;">저장</button>
					<button type="button" id="removeBtn" class="btn btn-secondary"
						style="margin-right: 5px;">삭제</button>
				</div>
			</div>
		</div>
		<div class="card mb-2">
			<div class="card-body">
				<!-- 입력폼 -->
				<form autocomplete="off" id="dataForm">
					<div class="container-fluid"
						style="display: flex; flex-flow: row wrap; justify-content: space-between;">
						<!-- 계획일자, 생산계획명, 특이사항 -->
						<div class="item col-6">
							<table class="table table-bbs">
								<tbody>
									<tr>
										<th><label style="width: 100px;">계획일자</label></th>
										<td colspan="6">
											<div
												class="tui-datepicker-input tui-datetime-input tui-has-focus">
												<input type="text" class="form-control" id="planDt"
													aria-label="Date-Time" tabindex="1"> <span
													class="tui-ico-date"></span>
											</div>
											<div id="wrapper" style="margin-top: -1px;"></div>
										</td>
									</tr>
									<tr>
										<th>생산계획명</th>
										<td><input type="text" id="planDt" class="form-control ht"
											style="width: 500px;" maxlength="10" tabindex="2"></td>
										<td colspan="5">
									</tr>
									<tr>
										<th>특이사항</th>
										<td><input type="text" id="remark" class="form-control ht"
											style="width: 500px;" maxlength="10" tabindex="2"></td>
										<td colspan="3">
									</tr>
								</tbody>
							</table>
						</div>

						<!-- 미생산주문조회 -->
						<div class="item col-5 border"
							style="width: 600px; height: 100px; margin: 10px;">
							<div class="grid-option-area mt-1">
								<ul style="list-style: none;">
									<li>
										<h3 class="subtitle"
											style="margin: 15px 0px 2px; width: 400px; font-size: 16px; font-weight: bold;">미생산
											주문 조회</h3>
									</li>
									<li class="mt-1 grid-option-area"
										style="margin: 10px; padding: 5px 0px 0px 5px;">
										<div>
											<label for="requestStDt" class="mg5">납기일자</label>
											<!-- 시작일 -->
											<div
												class="tui-datepicker-input tui-datetime-input tui-has-focus mg5">
												<input id="planDtS" type="text" class="form-control"
													aria-label="Date"> <span class="tui-ico-date"></span>
												<div id="planDtS-wapper" style="margin-left: -1px;"></div>
											</div>

											<span class="mg5">~</span>

											<!-- 종료일 -->
											<div
												class="tui-datepicker-input tui-datetime-input tui-has-focus mg5">
												<input id="planDtE" type="text" class="form-control"
													aria-label="Date"> <span class="tui-ico-date"></span>
												<div id="planDtE-wapper" style="margin-left: -1px;"></div>
											</div>
											<button type="button" class="btn btn-secondary btn-block" id="unprodBtn">읽기</button>
										</div>
									</li>
								</ul>
							</div>
						</div>
					</div>
				</form>
				<!-- 입력폼 끝  -->
			</div>
		</div>
	</div>

	<!-- 전체 표 -->
	<div class="container-fluid px-4 mb-2">
		<div style="display: flex; justify-content: flex-end;">
			<button type="button" class="btn btn-secondary"
				style="margin-right: 5px;">추가</button>
			<button type="button" class="btn btn-secondary"
				style="margin-right: 5px;">삭제</button>
		</div>
	</div>
	<div class="container-fluid px-4">
		<div class="card mb-4">
			<div class="card-header">
				<i class="fas fa-table me-1"></i> 목록
			</div>
			<div class="card-body">
				<div id="total"></div>
			</div>
		</div>
	</div>

	<!-- 필요자재표  -->
	<div class="container-fluid px-4">
		<div class="card mb-4">
			<div class="card-header">
				<i class="fas fa-table me-1"></i> 필요자재
			</div>
			<div class="card-body">
				<div id="matneed"></div>
			</div>
		</div>
	</div>

	<div id="unproduct" title="미생산 주문조회"></div>
	<!-- 스크립트 -->
	<script type="text/javascript">
		
		/* 미생산주문 모달 */
		$(function(){
			$('#unprodBtn').on('click', function(){
				$('#unproduct').load('prodPlanUnprd.do', function(){
					var unproduct = unprodModal();
					unproduct.dialog('open')
				})
			})
		})
		
		function unprodModal() {
			var dialog = $('#unproduct').dialog({
				 autoOpen: false, // 자동오픈 false
			    height: 700,
			    width: 700,
			    modal: false,
			    buttons : {
					"확인" : productAdd,
					"취소" : function() {
						unproduct.dialog("close");
					}
				}
			})
			$('.ui-dialog-titlebar-close').html('X').css('border', 'none')
			$('.ui-dialog-buttonset').children().attr('class', 'btn btn-secondary')
			return dialog;
		}
		
		function productAdd() {
			
		}
	
	
		/* 계획일자 */
		const datepicker = new tui.DatePicker('#wrapper', {
			date : new Date(),
			input : {
				element : '#planDt',
				format : 'yyyy-MM-dd'
			},
			language : 'ko'

		});

		/* 미생산 주문조회 */
		var today = new Date();
		var picker = new tui.DatePicker.createRangePicker({
			startpicker : {
				date : today,
				input : '#planDtS',
				container : '#planDtS-wapper'
			},
			endpicker : {
				date : today,
				input : '#planDtE',
				container : '#planDtE-wapper'
			},
			selectableRanges : [ [
					today,
					new Date(today.getFullYear() + 1, today.getMonth(), today
							.getDate()) ] ]
		});

		/* 필요자재 */
		const selectMat = [];

		const matGrid = new tui.Grid({
			el : document.getElementById('matneed'),
			data : selectMat,
			scrollX : false,
			rowHeaders : [ 'rowNum' ],
			columns : [ {
				header : '제품코드',
				align : 'center'
			}, {
				header : '제품명',
				align : 'center'
			}, {
				header : '자재코드',
				align : 'center'
			}, {
				header : '자재명',
				align : 'center'
			}, {
				header : '소요량(개당)',
				align : 'center'
			}, {
				header : '필요량',
				align : 'center'
			}, {
				header : '재고량',
				align : 'center'
			}, {
				header : '부족량',
				align : 'center'
			} ]
		});

		/* 전체제품 */
		const totalPd = [];

		const pdGrid = new tui.Grid({
			el : document.getElementById('total'),
			data : totalPd,
			scrollX : false,
			rowHeaders : [ 'checkbox', 'rowNum' ],
			columns : [ {
				header: '제품코드',
				align: 'center'
			}, {
				header : '제품명',
				align : 'center'
			}, {
				header : '규격',
				align : 'center'
			}, {
				header : '의뢰번호',
				align : 'center'
			}, {
				header : '납기일자',
				align : 'center'
			}, {
				header : '주문량',
				align : 'center'
			}, {
				header : '기계획량',
				align : 'center'
			}, {
				header : '미계획량',
				align : 'center'
			}, {
				header : '작업일자',
				align : 'center'
			}, {
				header : '비고',
				align : 'center'
			} ]
		});

		/* 새자료 */
		$(document).on('click', '#resetBtn', function() {
			console.log("리셋")
			fnFormClear();
		})

		function fnFormClear() {
			document.getElementById('dataForm').reset();
			$('#planDt').val('');
			datepicker.setDate(new Date());
			/* 왜 리셋이 안될까... */
			picker.startpicker.setDate(new Date());
			picker.endpicker.setDate(new Date());
			grid.resetData(gridData);
		}
	</script>
</body>

</html>