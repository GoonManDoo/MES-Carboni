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


</style>
</head>
<body>
 <div class="container-fluid px-4">
   <h1 class="mt-4">입고 관리</h1>
   <!-- 버튼내용 -->
  		<div class="card mb-4">
           <div class="card-header">
               <div class="card-button btnlist"  >
                     <button type="button">삭제</button>
                     <input type="submit" value="저장">
               </div>
           </div>
        </div>
        
        <div class="card mb-4 table-center w-50" >
	           <div>
	           <span>입고일자</span>
	           <input type="date"><span>~</span><input type="date">
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
        <div>
        	<div>발주조회</div>
        	<div>
        		<input type="date"><span>~</span><input type="date">
        		<button type="button"></button>
        	
        	</div>
        
        </div>
        
        
   
   
   
</div>
</body>
</html>