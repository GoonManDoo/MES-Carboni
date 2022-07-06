<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false"%>
<head>
<link rel="stylesheet" href="https://uicdn.toast.com/grid/latest/tui-grid.css" />
  <script src="https://uicdn.toast.com/grid/latest/tui-grid.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
</head>
<body class="sb-nav-fixed">
	<div id="layoutSidenav">
		<div id="layoutSidenav_content">
			<main>
				<div class="container-fluid px-4">
					<h1 class="mt-4">생산계획관리</h1>
					<div class="card mb-4">
						<div class="card-body">
							<button>조회</button>
							<button>새자료</button>
							<button>저장</button>
							<button>삭제</button>
						</div>
					</div>
					<div class="card mb-4">
						<div class="card-body">
							<span> 계획일자<input type="date"><br> 생산계획명<input
								type="text"><br> 특이사항<input type="text"><br>
							</span> <span> 미생산 주문 조회<br> 납기일자<input type="date">~<input
								type="date">
							</span>
						</div>
					</div>
					<div class="card mb-4">
						<div class="card-header">
							<i class="fas fa-table me-1"></i> 전체
						</div>
						<div class="card-body">
							<table id="datatablesSimple">
								<thead>
									<tr>
										<th><input type="checkbox"></th>
										<th>제품코드</th>
										<th>제품명</th>
										<th>규격</th>
										<th>의뢰번호</th>
										<th>주문량</th>
										<th>기계획량</th>
										<th>미계획량</th>
										<th>작업일자</th>
										<th>비고</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td><input type="checkbox"></td>
										<td>002</td>
										<td>001</td>
										<td>001</td>
										<td>001</td>
										<td>001</td>
										<td>001</td>
										<td>001</td>
										<td>001</td>
										<td>001</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<div class="card mb-4">
						<div class="card-header">
							<i class="fas fa-table me-1"></i> 필요자재체크
						</div>
						<div id="grid"></div>
					</div>
				</div>
			</main>
		</div>
	</div>
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
            header : 'No.',
            name : 'c1',
            align : 'center',
         }, {
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
</html>
