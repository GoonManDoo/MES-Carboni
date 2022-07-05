<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false"%>
<body class="sb-nav-fixed">
   <div id="layoutSidenav">
      <div id="layoutSidenav_content">
         <main>
            <div class="container-fluid px-4">
               <h1 class="mt-4">생산계획관리</h1>
               <div class="card mb-4">
                  <div class="card-body">
                     <button>조회</button>
                     <button>삭제</button>
                  </div>
               </div>
               <div class="card mb-4">
                  <div class="card-body">
                     <span> 수주일자<input type="date" name="startCNDATE" id="startCNDATE" />~
		                         <input type="date" name="endCNDATE" id="endCNDATE" /><br>
                            제품코드<input type="text"><br>
                     </span>
                     <span> 수주일자<input type="date" name="startCNDATE" id="startCNDATE" />~
		                         <input type="date" name="endCNDATE" id="endCNDATE" /><br>
                            제품코드<input type="text"><br>
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
                             <th>의뢰번호</th>
							 <th>제품코드</th>
							 <th>거래처코드</th>
							 <th>수주일자</th>
							 <th>납기일자</th>
							 <th>마감일자</th>
							 <th>마감여부</th>
                           </tr>
                        </thead>
                        <tbody>
                           <tr>
                              <td><input type="checkbox"></td>
                              <td>에레번호</td>
							  <td>제펌커더</td>
							  <td>거래처커더</td>
							  <td>서저일자</td>
							  <td>납가일자</td>
							  <td>마감알자</td>
							  <td>마감야부</td>
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
         </main>
      </div>
   </div>
</body>
</html>