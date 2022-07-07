<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>matLot</title>
</head>
<body>

  <main id="container">
      <div class="container-fluid px-4">
         <h1 class="mt-4">자재 LOT조정관리</h1>
            <div class="card mb-4">
					<div class="card-header">
						<div class="card-button btnlist" style="display: flex; justify-content: flex-end;">
							<button type="button" class="btn btn-secondary btn-block">삭제</button>
							<input type="submit" value="저장"
								class="btn btn-secondary btn-block">
						</div>
					</div>
				</div>
				  </div>
				  <div class="card mb-4 table-center container-fluid px-4" >
         <table>
            <tr>
               <th>정산일자</th>
               <td><div class="tui-datepicker-input tui-datetime-input tui-has-focus">
                  <input type="text" id="datepicker-input" aria-label="Date-Time">
                  <span class="tui-ico-date"></span>
                  </div>
                     <div id="wrapper" style="margin-top: -1px;"></div>
               </td>
            </tr>
            <tr>
               <th>자료구분</th>
               <td><input type="checkbox">정산입고</td>
               <td><input type="checkbox">정산출고</td>
            </tr>
            <tr>
               <th>특기사항</th>
               <td colspan="4"><input type="text"></td>
            </tr>
         </table>
         </div>
         <div>
            <div>
               <button type="button" id="btnModal" class="btn btn-secondary btn-block">추가</button>
            </div>
            <div>
               <button type="button" class="btn btn-secondary btn-block">삭제</button>
            </div>
         </div>
      <div id="grid"></div>
    
</main>
<script>
    var datepicker = new tui.DatePicker('#wrapper', {
            date: new Date(),
            input: {
                element: '#datepicker-input',
                format: 'yyyy-MM-dd'
            }
        });

        const gridDate = [];

        const grid = new tui.Grid({
            el : document.getElementById('grid'),
            data : gridDate,
            scrollX: false,
            bodyHeight: 500,
            rowHeaders: ['checkbox'],
            columns: [
            { 
               header :'자재코드',
               sortingType : 'desc',
               align :'center',
               sortable : true
           },{
               header : '자재명',
               align : 'center'
           },{
               header : '규격',
               align :'center'
           },{
               header: '자재단위',
               align:'center'
           },{
               header : '정산량',
               align:'center'
           },{
               header : '자재Lot.No',
               align: 'center'
           },{
               header : '자재재고',
               align: 'center'
           },{
               header : '비고',
               
           }
         ]
        })
</script>  

</body>
</html>