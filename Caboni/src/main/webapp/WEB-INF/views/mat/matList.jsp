<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>matList.jsp</title>
        <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
        <link href="resources/css/styles.css" rel="stylesheet" />
        <link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
        <link rel="stylesheet" href="https://uicdn.toast.com/grid/latest/tui-grid.css" />
        <link href="resources/css/matstyle.css" rel="stylesheet" />

           <script src="https://uicdn.toast.com/grid/latest/tui-grid.js"></script>
           <script src="https://code.jquery.com/jquery-3.5.1.min.js" crossorigin="anonymous"></script>
   		 <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
          <script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js" crossorigin="anonymous"></script>
        <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>
        <script >
        $(function(){
        	
       
        //버튼클릭
      $("#btnModal").on("click",function(){
    	  $("#dialog").load('matAdd.jsp',function(){
    		  var dialog = makeModal();
    		  dialog.dialog("open");
    	  })
      })
      
      function makeModal(){
        	var dialog =$("#dialog").dialog({
        		autoOpen:false,
        		height: 400,
        		width:350,
        		modal:true,
        		button :{
        			"등록":contentsAdd,
        			"취소":function(){
        				dialog.dialog("close");
        				}
        		}
        	});
        	return dialog;
        }
        function contentsAdd(){
        	
        }
        })
        /* 그리드 표만들기 */
        /* 그리드 펑션!*/
        </script>
<style>
	
</style>
</head>
<body>
<main>
                    <div class="container-fluid px-4">
                        <h1 class="mt-4">발주관리</h1>
                       
                        <div class="card mb-4">
                            <div class="card-header">
                                
                                <div class="card-button">
                                    <button type="button" id="btnModal">발주</button>
                                    <button>저장</button>
                                </div>
                                </div>
                                </div>
                               
                                <div class="card mb-4 table-center ">
                                   <div>
                                    <span>해당일자</span>
                                    <input type="date"><span>~</span><input type="date">
                                    </div>
                                    <br>
                                    <div>
                                        <span>발주업체</span>
                                        <input type="text"><button>🔍</button><span>업체명</span><input type="text" readonly>
                                    </div>
                                    <br>
                                    <div>
                                        <span>자재코드</span>
                                        <input type="text"><button>🔍</button><span>자재명</span><input type="text" readonly>
                                    </div>
                                    <br>
                                    <div> 
                                        <button> 조회</button>
                                        <button> 주문</button>
                                    </div>
                                </div>
                            </div>
                            
                            <div id="grid">
                            
                             </div>
                             <!-- 그리드 내용 만들기  -->
                             <script >
                             const gridData = [];
                             (function() {
                                 for (let i = 0; i < 120; i += 1) {
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
                                       c10 : ((i + 3) % 7) * 60,
                                       c11 :((i + 3) % 7) * 60,

                                    });
                                 }
                              })();
                             
                             
                             
                             const grid = new tui.Grid({
                                 el : document.getElementById('grid'),
                                 data : gridData,
                                 scrollX : false,
                                 bodyHeight : 500,
                                 rowHeaders : [ 'rowNum' ],
                                 columns : [ {
                                    header : '발주일자',
                                    name : 'c1',
                                    align : 'center',
                                 }, {
                                    header : '발주코드',
                                    name : 'c2',
                                    align : 'center'
                                 }, {
                                    header : '자재코드',
                                    name : 'c3',
                                    align : 'center'
                                 }, {
                                    header : '자재명',
                                    name : 'c4',
                                    align : 'center'
                                 }, {
                                    header : '입고일자',
                                    name : 'c5',
                                    align : 'center'
                                 }, {
                                    header : '입고처명',
                                    name : 'c6',
                                    align : 'center'
                                 }, {
                                    header : '발주량',
                                    name : 'c7',
                                    align : 'center'
                                 }, {
                                    header : '입고량',
                                    name : 'c8',
                                    align : 'center'
                                 }, {
                                     header : '자재량',
                                     name : 'c9',
                                     align : 'center'
                                  } , {
                                      header : '발주상태',
                                      name : 'c10',
                                      align : 'center'
                                   } , {
                                       header : '비고',
                                       name : 'c11',
                                       align : 'center'
                                    }  ]
                              });
                             </script>
                           
                          <!--   <div class="card mb-4">
                            <div class="card-header">
                                <i class="fas fa-table me-1" ></i>
                               발주
                            </div>
                            <div class="card-body">
                                <table >
                                    <thead>
                                        <tr>
                                        <th><input  type="checkbox"></th>
                                            <th>발주일자</th>
                                            <th>발주코드</th>
                                            <th>자재코드</th>
                                            <th>자재명</th>
                                            <th>입고일자</th>
                                            <th>입고처명</th>
                                            <th>발주량</th>
                                            <th>입고량</th>
                                            <th>자재량</th>
                                            <th>발주상태</th>
                                            <th>비고</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    
                           
                                        
                                    </tbody>

                                </table>
                            </div>
                        </div> -->
                        <div id="dialog" title="contents">
                        
                        </div>
       
                </main>
               
</body>
</html>