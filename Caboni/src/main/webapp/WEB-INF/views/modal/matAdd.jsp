<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
   
<title>matAdd modal</title>
<style>
.title{
	text-align:center;
	margin-botton: 5px;
}
table{
margin:0 auto;
width:100%;
}
</style>
</head>
<body>
<div class="container" >
<div class="title">
    <span>거래처명</span><input type="text"> <button type="button">검색</button>
    
</div>
    <span>진행상태</span>
    <select name="status">
        <option value="">상태선택</option>
        <option value="미발주" selected>미발주</option>
        <option value="발주">발주</option>
    </select>
	<form>
	<!-- 그리드로 수정하기 -->
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
	        <td><input type="checkbox"></td>
	
	       </tr>
	    
	    </table>
  </form>
</div>

</body>
</html>