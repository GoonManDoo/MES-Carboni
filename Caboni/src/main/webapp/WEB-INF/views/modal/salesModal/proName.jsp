<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<title>제품검색</title>
<style>
#input {
	width: 100px;
}

.title {
	margin: 15px 20px;
}
</style>
</head>
<body>
	<div class="container">
		<div class="title">
			제품명<input type="text" id="input" placeholder="제품명"> 제품코드<input type="text" id="input" placeholder="제품코드">
			<button class="btn btn-secondary">조회</button>
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
			<div class="card-header">
				<i class="fas fa-table me-1"></i> 제품정보
			</div>
			<div id="gridpro"></div>
		</div>
	</div>
	<button type="button" id="btnModal" class="btn btn-secondary" style="margin-right: 5px;">확인</button>
	<button type="button" id="btnModal" class="btn btn-secondary" style="margin-right: 5px;">취소</button>


	<script>
		$(function() {
			let gridData = [];

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

			let grid = new tui.Grid({
				el : document.getElementById('gridpro'),
				data : gridData,
				bodyHeight : 420,
				scrollX : false,
				rowHeaders : [ 'rowNum', 'checkbox' ],
				columns : [ {
					header : '제품코드',
					name : 'c2',
					align : 'center',
					sortingType : 'desc',
					sortable : true
				}, {
					header : '제품명',
					name : 'c3',
					align : 'center',
					sortingType : 'desc',
					sortable : true
				}, {
					header : '제품단위',
					name : 'c4',
					align : 'center',
					sortingType : 'desc',
					sortable : true
				} ],
			/*	summary: {
			        height: 40,
			        position: 'bottom', 
			        columnContent: {
			          c2: {
			            template: function(valueMap) {
			              return `MAX: ${valueMap.max}<br>MIN: ${valueMap.min}`;
			            }
			          },
			          c3: {
			            template: function(valueMap) {
			              return `TOTAL: ${valueMap.sum} <br>AVG: ${valueMap.avg.toFixed(2)}`;
							}
						}
						
					}
				} */
			});
		})
	</script>
	<table>
	</table>
</body>
</html>