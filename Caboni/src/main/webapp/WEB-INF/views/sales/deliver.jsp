<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false"%>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<head>
</head>
<style>
.btn-secondary {
	margin-left: 20px;
}

span {
	color: #494949;
	font-weight: bold;
}

#pageing {
	border: 1px solid #e6e6e6;
	line-height: 30px;
	background-color: #fff;
	color: #999999;
}

input {
	height: 23px;
	margin-left: 15px;
	display: inline-block;
	padding: 0 10px;
	vertical-align: middle;
	border: 1px solid #dddddd;
	width: 20%;
	color: rgb(94, 94, 94);
	border-radius: 5px;
	text-align: center;
}

#leftinput {
	width: 42%;
}

#startCNDATE {
	margin-right: 10px;
}

#endCNDATE {
	margin-left: 5px;
}

.dataTable-input {
	height: 40px;
}
 .nameing{ 
	float:right; 
	font-size: medium;
	font-weight: normal;
   }
</style>
<body class="sb-nav-fixed">
	<div class="container-fluid px-4">
		 <h2 class="mt-4">배송 관리 <p class="nameing">홈>영업관리>배송관리</p></h2>
		<div class="card-header" id="btn">
			<div style="display: flex; justify-content: flex-end;">
				<button class="btn btn-secondary">조회</button>
				<button class="btn btn-secondary">등록</button>
				<button class="btn btn-secondary">삭제</button>
			</div>
		</div>
		<div class="card mb-4" id="pageing">
			<div class="card-body">
				 <span> 출하일자<input type="date" name="startCNDATE" id="startCNDATE" />~
		                     <input type="date" name="endCNDATE" id="endCNDATE" /><br>
		                제품번호<input type="text" id="leftinput" placeholder="모달창추가"><br>
                        배송번호<input type="text" id="leftinput" placeholder="모달창추가"><br>
                     </span> 
			</div>
		</div>
		<div class="card mb-4">
			<div class="card-header">
				<i class="fas fa-table me-1"></i> 출하목록
			</div>
			<div class="card-body">
				<table id="datatablesSimple">
					<thead>
						<tr>
							<td><input type="checkbox"></td>
							<th>출고일자</th>
							<th>제품코드</th>
							<th>제품명</th>
							<th>출하수량</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><input type="checkbox"></td>
							<th>22-07-01</th>
							<th>001</th>
							<th>다리미</th>
							<th>6개</th>
						</tr>
						<tr>
							<td><input type="checkbox"></td>
							<th>22-07-01</th>
							<th>002</th>
							<th>자동차</th>
							<th>19개</th>
						</tr>
						<tr>
							<td><input type="checkbox"></td>
							<th>22-07-01</th>
							<th>003</th>
							<th>테레비</th>
							<th>2개</th>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>

	
<div class="container-fluid px-4">
	<div class="card mb-4">
		<div class="card-header">
			<i class="fas fa-table me-1"></i> 미정
		</div>
		<div id="grid"></div>
	</div>
</div>

<script type="text/javascript">
	jQuery(function($) {
		$("datatablesSimple").DataTable();
	});
</script>
</body>
<script>
	const gridData = [];

	(function() {
		for (let i = 0; i < 10; i += 1) {
			gridData.push({
				c1 : (i + 1),
				c2 : ((i + 5) % 8) * 100 + i,
				c3 : ((i + 3) % 7) * 60,
				c4 : ((i + 3) % 7) * 60,
				c5 : ((i + 3) % 7) * 60,
				c6 : ((i + 3) % 7) * 60,
				c7 : ((i + 3) % 7) * 60,
				c8 : ((i + 3) % 7) * 60,
				c9 : ((i + 3) % 7) * 60,

			});
		}
	})();

	const grid = new tui.Grid({
		el : document.getElementById('grid'),
		data : gridData,
		scrollX : false,
		rowHeaders : [ 'rowNum' ],
		columns : [ {
			header : '제품코드',
			name : 'c2',
			align : 'center'
		}, {
			header : '제품명',
			name : 'c3',
			align : 'center'
		}, {
			header : '자재코드',
			name : 'c4',
			align : 'center'
		}, {
			header : '자재명',
			name : 'c5',
			align : 'center'
		}, {
			header : '소요량(개당)',
			name : 'c6',
			align : 'center'
		}, {
			header : '필요량',
			name : 'c7',
			align : 'center'
		}, {
			header : '재고량',
			name : 'c8',
			align : 'center'
		}, {
			header : '부족량',
			name : 'c9',
			align : 'center'
		} ]
	});
</script>

<!-- 모달 -->
<script>
var modal = document.getElementById('myModal');
var btn = document.getElementById('write');
var span = document.getElementByClassName("close")[0];
$(document).ready(function(){
	btn.onclick = function(event) {
		modal.style.display = "block";
	}
	noticeList();
});

span.onclick = function(event) {
	modal.style.display = "none";
}

window.onclick = function(event) {
	if(event.target == modal) {
		modal.style.display = "none";
	}
}

</script>
</html>