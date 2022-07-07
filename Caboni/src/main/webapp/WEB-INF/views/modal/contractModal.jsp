<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
       <meta http-equiv="X-UA-Compatible" content="IE=edge" />
       <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
       <script src="https://code.jquery.com/jquery-3.5.1.min.js" crossorigin="anonymous"></script>
	    <script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
	    <script src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap.min.js"></script>
	    <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
	    <link href="resources/css/matStyle.css" rel="stylesheet" />
	    <link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
	    <link rel="stylesheet" href="https://uicdn.toast.com/grid/latest/tui-grid.css" />
	    <script src="https://uicdn.toast.com/grid/latest/tui-grid.js"></script>
	    <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
   
<title>거래처검색</title>
<style>
#leftinput{
	width:100px;
	margin-right:30px;
}
</style>
</head>
<body>
<div class="container" >
<div class="title">
    						●거래처명<input type="text" id="leftinput" placeholder="거래처">
                            ●거래처코드<input type="text" id="leftinput" placeholder="거래처코드"><br>
    
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
			});
		}
	})();

	const grid = new tui.Grid({
		el : document.getElementById('grid'),
		data : gridData,
		scrollX : false,
		rowHeaders : [ 'rowNum' ],
		columns : [ {
			header : '거래처코드',
			name : 'c2',
			align : 'center'
		}, {
			header : '거래처명',
			name : 'c3',
			align : 'center'
		}, {
			header : '사업자번호',
			name : 'c4',
			align : 'center'
		}, {
			header : '전화번호',
			name : 'c5',
			align : 'center'
		} ]
	});
</script>
<table >
</table>
</body>
</html>