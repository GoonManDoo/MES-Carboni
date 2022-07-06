<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false"%>
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

 
</style>
<body class="sb-nav-fixed">
            <div class="container-fluid px-4">
               <h2 class="mt-4">수주 관리</h2>
                  <div class="card-header" id = "btn">
                  <div style="display:flex; justify-content: flex-end;">
                     <button class="btn btn-secondary">조회</button>
                     <button class="btn btn-secondary">삭제</button>
                     </div>
                  </div>
               <div class="card mb-4" id="pageing">
                  <div class="card-body">
                     <span> 수주일자<input type="date" name="startCNDATE" id="startCNDATE" />~
		                         <input type="date" name="endCNDATE" id="endCNDATE" /><br>
                            제품코드<input type="text" id="leftinput"><br>
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
                             <th>수주코드</th>
							 <th>제품코드</th>
							 <th>수주수량</th>
							 <th>수주잔량</th>
							 <th>수주일자</th>
							 <th>납기일자</th>
							 <th>진행상태</th>
                           </tr>
                        </thead>
                        <tbody>
                           <tr>
                              <td><input type="checkbox"></td>
                              <td>서저커드</td>
							  <td>제펌커더</td>
							  <td>서저서량</td>
							  <td>서저잔량</td>
							  <td>서저알자</td>
							  <td>납가알자</td>
							  <td>잔항상타</td>
                           </tr>
                           <tr>
                              <td><input type="checkbox"></td>
							  <td>suju001</td>
							  <td>jepoom001</td>
							  <td>2</td>
							  <td>1</td>
							  <td>2000/01/01</td>
							  <td>2000/01/02</td>
							  <td>Y</td>
			               </tr>
                        </tbody>
                        
                     </table>
                  </div>
               </div>
            </div>
</body>
</html>