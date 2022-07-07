<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false"%>
    <script src="https://code.jquery.com/jquery-3.5.1.min.js" crossorigin="anonymous"></script>
    <script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
    <link href="resources/css/matStyle.css" rel="stylesheet" />
    <link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="https://uicdn.toast.com/grid/latest/tui-grid.css" />
    <script src="https://uicdn.toast.com/grid/latest/tui-grid.js"></script>
    <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
.btn-secondary {
margin-left : 20px;
}
span {
   color:#494949;
   font-weight: bold;
}
#pageing{
	border:1px solid #e6e6e6;
	line-height:30px;
	background-color:#fff;
	color:#999999;
 }
 input{
	  height:23px;
	  margin-left:15px;
  	  display: inline-block;
      padding: 0 10px;
      vertical-align: middle;
      border: 1px solid #dddddd;
      width: 20%;
      color: rgb(94, 94, 94);
      border-radius: 5px;
      text-align:center;
 }
 #leftinput{
 width:42%;
 }
 #startCNDATE {
 margin-right:10px;
 }
 #endCNDATE {
 margin-left:5px;
 }
 .dataTable-input{
 height:40px;
 }
 .nameing{ 
	margin-right:1290px; 
   }
   
</style>


<body class="sb-nav-fixed">
            <div class="container-fluid px-4">
               <h2 class="mt-4">수주 관리</h2>
                  <div class="card-header" id = "btn">
                  <div style="display:flex; justify-content: flex-end;">
                  <p class="nameing">홈>영업관리>수주관리</p>
                     <button class="btn btn-secondary" id="btnModal">조회</button>
                     <button class="btn btn-secondary">삭제</button>
                     </div>
                  </div>
               <div class="card mb-4" id="pageing">
                  <div class="card-body">
                     <span> 수주일자<input type="date" name="startCNDATE" id="startCNDATE"/>~
		                         <input type="date" name="endCNDATE" id="endCNDATE" /><br>
		                    거래처명<input type="text" id="leftinput" placeholder="모달창추가하기" readonly="readonly"><br>
                            제품코드<input type="text" id="leftinput" placeholder="모달창추가하기" readonly="readonly"><br>
                     </span> 
                  </div>
               </div>
               
               
               
               <div class="card mb-4">
                  <div class="card-header">
                     <i class="fas fa-table me-1"></i> 수주목록
                  </div>
                  <div class="card-body">
                     <table id="datatablesSimple">
                        <thead>
                           <tr>
                             <th><input type="checkbox"></th>
                             <th>수주코드</th>
                             <th>거래처</th>
							 <th>제품코드</th>
							 <th>수주수량</th>
							 <th>수주잔량</th>
							 <th>수주일자</th>
							 <th>납기일자</th>
							 <th>마감일자</th>
							 <th>진행상태</th>
                           </tr>
                        </thead>
                        <tbody>
                           <tr>
                              <td><input type="checkbox"></td>
							  <td>suju001</td>
							  <td>쿠팡</td>
							  <td>jepoom001</td>
							  <td>2</td>
							  <td>1</td>
							  <td>2000/01/01</td>
							  <td>2000/01/01</td>
							  <td>2000/01/02</td>
							  <td>Y</td>
			               </tr>
                        </tbody>
                        
                     </table>
                  </div>
               </div>
            </div>
            <div id="dialog" title="업체검색" style="text-align: center;">
                        </div>
</body>

<script>
$(function(){

    //버튼클릭
  $("#btnModal").on("click",function(){
	  $("#dialog").load('contractModal.do',function(){
		  var dialog = makeModal();
		  dialog.dialog("open");
	  })
  });
  
  function makeModal(){
    	var dialog =$("#dialog").dialog({
    		autoOpen:false,
    		height:700,
    		width:700,
    		modal:true,
    		buttons :{
    			"확인":contentsAdd,
    			"취소":function(){
    				dialog.dialog("close");
    				}
    		}
    	});
    	return dialog;
    };
  
    function contentsAdd(){
    }
});
</script>

</html>