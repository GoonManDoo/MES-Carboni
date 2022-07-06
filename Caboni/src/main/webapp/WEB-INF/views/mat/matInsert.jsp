<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <link href="resources/css/styles.css" rel="stylesheet" />
 <link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
 <link href="resources/css/matStyle.css" rel="stylesheet" />
         
        <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.min.js" crossorigin="anonymous"></script>
   		<script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js" crossorigin="anonymous"></script>
<title>matInsert</title>
<style>
li{
	list-style:none;
	}
.subtitle{

	text-decoration: none;
	font-size: 20px;
	margin:2px 0px 2px; 
	width:400px;
	
}


</style>
<script >
	$(function(){
		 /*데이트피커*/
        $('.rdt').datepicker({
        	dateFormat: "yy-mm-dd",
        	 changeMonth: true,
             changeYear: true,
             dayNamesMin:['월','화','수','목','금','토','일']
        });
	})

</script>
</head>
<body>
 <div class="container-fluid px-4">
   <h1 class="mt-4">입고 관리</h1>
   <!-- 버튼내용 -->
  		<div class="card mb-4">
           <div class="card-header">
               <div class="card-button btnlist"  >
                     <button type="button" class="btn btn-secondary btn-block">삭제</button>
                     <input type="submit" value="저장" class="btn btn-secondary btn-block">
               </div>
           </div>
        </div>
        
        <div class="card mb-4 table-center w-50" >
	           <div>
	           <span>입고일자</span>
	           <input name="rdt" class="rdt"><span>~</span><input name="rdt" class="rdt">
	           </div>
	         <br>
	           <div>
	           <span>입고업체</span>
	           <input type="text"><button>🔍</button><span>업체명</span><input type="text" readonly>
	           </div>
	         <br>
	           <div>
	           <span>특기사항</span>
	           <input type="text">
	           </div>
        </div>
        <div class="col-5 border">
        <div class="grid-option-area mt-1">
        <ul>
        	<li >
        		<h3  class="subtitle">발주조회 </h3>
        	</li>
        	<li >
        	</li>
        
        
        </ul>
        	<label>발주조회</label>       	
        	<div>
        		<input name="rdt" class="rdt"><span>~</span><input name="rdt" class="rdt">
        		<button type="button" class="btn btn-secondary btn-block">검색</button>
        	
        	</div>
        </div>
        </div>
        
        
        	
   
   
   
</div>
</body>
</html>