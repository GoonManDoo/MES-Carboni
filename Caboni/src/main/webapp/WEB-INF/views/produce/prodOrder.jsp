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
.tbold {
	font-weight: 700;
}
</style>
</head>
<body class="sb-nav-fixed">
	<div class="container-fluid px-4">
		<h1 class="mt-4">생산지시관리</h1>
		<div class="card mb-2">
			<div class="card-header">
				<div style="display: flex; justify-content: flex-end;">
					<button type="button" class="btn btn-secondary"
						style="margin-right: 5px;">조회</button>
					<button type="button" class="btn btn-secondary"
						style="margin-right: 5px;">새자료</button>
					<button type="button" class="btn btn-secondary"
						style="margin-right: 5px;">저장</button>
					<button type="button" class="btn btn-secondary"
						style="margin-right: 5px;">삭제</button>
				</div>
			</div>
		</div>
		<div class="card mb-2">
			<div class="card-body">
				<!-- 입력폼 -->
				<form autocomplete="off">
					<div class="container-fluid"
						style="display: flex; flex-flow: row wrap; justify-content: space-between;">
						<!-- 계획일자, 생산계획명, 특이사항 -->
						<div class="item col-6">
							<table class="table table-bbs table-write">
								<tbody>
									<tr>
										<th><label style="width: 100px;">지시일자</label></th>
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
										<th>생산지시명</th>
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

						<!-- 미지시주문조회 -->
						<div class="item col-5 border"
							style="width: 600px; height: 100px; margin: 10px;">
							<div class="grid-option-area mt-1">
								<ul style="list-style: none;">
									<li>
										<h3 class="subtitle"
											style="margin: 15px 0px 2px; width: 400px; font-size: 16px; font-weight: bold;">미지시
											계획 조회</h3>
									</li>
									<li class="mt-1 grid-option-area"
										style="margin: 10px; padding: 5px 0px 0px 5px;">
										<div>
											<label for="requestStDt" class="mg5">계획일자</label>
											<!-- 시작일 -->
											<div
												class="tui-datepicker-input tui-datetime-input tui-has-focus mg5">
												<input id="planDtS" type="text"
													class="form-control" aria-label="Date"> <span
													class="tui-ico-date"></span>
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
											<button type="button" class="btn btn-secondary btn-block">읽기</button>
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

	<!-- 필요자재, 공정  -->
	<div class="container-fluid px-4">
		<div class="card mb-4">
			<div class="card-header">
				<i class="fas fa-table me-1"></i>
			</div>
			<div class="card-body">
				<div class="container-fluid" style="display:flex; justify-content: space-between;">
					<div class="item tbold">제품코드</div>
					<div class="item"><input type="text" class="form-control ht" maxlength="10" style="height:28px;"></div>
					<div class="item tbold">제품명</div>
					<div class="item"><input type="text" class="form-control ht" maxlength="10" style="height:28px;"></div>
					<div class="item tbold">고객사</div>
					<div class="item"><input type="text" class="form-control ht" maxlength="10" style="height:28px;"></div>
					<div class="item tbold">지시량</div>
					<div class="item"><input type="text" class="form-control ht" maxlength="10" style="height:28px;"></div><br>
				</div>
				<div class="container-fluid" style="display:flex; justify-content: space-between;">
					<div style="width: 49%;" class="item">
						<div class="container-fluid" style="margin-top:10px; display:flex; justify-content: space-between;">
							<div class="item mg5 tbold">자재코드</div>
							<div class="item mg5"><input type="text" class="form-control ht" maxlength="7" style="height:28px;"></div>
							<div class="item mg5 tbold">자재명</div>
							<div class="item mg5"><input type="text" class="form-control ht" maxlength="7" style="height:28px;"></div>
							<div class="item"><button type="button" class="btn btn-secondary" style="margin-right: 5px;">검색</button></div>
						</div>
						<div class="mg5">
							<div id="matlist" style="margin-top:10px;"></div>
						</div>
					</div>
					<div style="width: 49%;" class="item">
						<div id="prclist" style="margin-top:15px;"></div>
					</div>
				</div>				
			</div>
		</div>
	</div>

	<!-- 스크립트 -->
	<script type="text/javascript">
	
		/* 지시일자 */
		const datepicker = new tui.DatePicker('#wrapper', {
			date : new Date(),
			input : {
				element : '#planDt',
				format : 'yyyy-MM-dd'
			},
			language : 'ko'
	
		});
	
		/* 미지시 계획조회 */
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
	
		
		/* 자재목록 */
		const material = [];
		
		const matlist = new tui.Grid({
			el : document.getElementById('matlist'),
			data : material,
			scrollX : false,
			rowHeaders : [ 'checkbox', 'rowNum' ],
			columns : [ {
				header : '자재코드',
				align : 'center'
			}, {
				header : '자재명',
				align : 'center'
			}, {
				header : '소요량',
				align : 'center'
			}, {
				header : '재고량',
				align : 'center'
			} ]
		});
	
		/* 공정선택 */
		const process = [];
		
		const prclist = new tui.Grid({
			el : document.getElementById('prclist'),
			data : process,
			bodyHeight: 200,
			scrollX : false,
			rowHeaders : [ 'checkbox' ],
			columns : [ {
				header : '순번',
				align : 'center'
			}, {
				header : '공정명',
				align : 'center'
			}, {
				header : '1차공정',
				align : 'center'
			}, {
				header : '2차공정',
				align : 'center'
			}, {
				header : '3차공정',
				align : 'center'
			}, {
				header : '4차공정',
				align : 'center'
			}, {
				header : '비고',
				align : 'center'
			} ]
		});
	</script>
	
</body>
</html>