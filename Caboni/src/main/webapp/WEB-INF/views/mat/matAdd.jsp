<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        
         <link href="resources/css/styles.css" rel="stylesheet" />
         <link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
         
        <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.min.js" crossorigin="anonymous"></script>
   		<script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js" crossorigin="anonymous"></script>
        
<title>matAdd modal</title>
<style>
#container{

}
.title{

}



</style>
</head>
<body>
<div id="container">
<div class="title">
    <span>거래처명</span><input type="text"> <button type="button">검색</button>
    
</div>
    <span>진행상태</span>
    <select name="status">
        <option value="">상태선택</option>
        <option value="미발주" selected>미발주</option>
        <option value="발주">발주</option>
    </select>

    <table border="1">
       <tr>
            <th><input type="checkbox"></th>
            <th>거래처코드</th>
            <th>거래처명</th>
            <th>자재명</th>
            <th>자재코드</th>
            <th>규격</th>
            <th>자재단위</th>
            <th>주문수량</th>

       </tr>
       <tr>
       <!-- function 기능 들어갈 곳  -->
        

       </tr>
    
    </table>
  
</div>

<table >
</table>
</body>
</html>