<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
	<div class="sb-sidenav-menu">
		<div class="nav">
		
			
			
			
			<div class="sb-sidenav-menu-heading">기능</div>
			
			<a class="nav-link collapsed" href="#" data-bs-toggle="collapse"
				data-bs-target="#collapseGt" aria-expanded="false"
				aria-controls="collapseGt">
				공통정보관리
				<div class="sb-sidenav-collapse-arrow">
					<i class="fas fa-angle-down"></i>
				</div>
			</a>
			<div class="collapse" id="collapseGt"
				aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
				<nav class="sb-sidenav-menu-nested nav">
					<a class="nav-link" href="#">공통코드 관리</a>
					<a class="nav-link" href="#">거래처정보 관리</a>
					<a class="nav-link" href="#">자재정보 관리</a>
					<a class="nav-link" href="#">제품 BOM 관리</a>
					<a class="nav-link" href="#">공정코드 관리</a>
					<a class="nav-link" href="#">불량코드 관리</a>
				</nav>
			</div>
			
			<a class="nav-link collapsed" href="#" data-bs-toggle="collapse"
				data-bs-target="#collapseEk" aria-expanded="false"
				aria-controls="collapseEk">
				영업관리
				<div class="sb-sidenav-collapse-arrow">
					<i class="fas fa-angle-down"></i>
				</div>
			</a>
			<div class="collapse" id="collapseEk"
				aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
				<nav class="sb-sidenav-menu-nested nav">
					<a class="nav-link" href="#">수주 관리</a>
					<a class="nav-link" href="#">생산의뢰조회 관리</a>
					<a class="nav-link" href="#">영업재고 관리</a>
					<a class="nav-link" href="#">출하 관리</a>
					<a class="nav-link" href="#">배송 관리</a>
				</nav>
			</div>
			
			<a class="nav-link collapsed" href="#" data-bs-toggle="collapse"
				data-bs-target="#collapseJj" aria-expanded="false"
				aria-controls="collapseJj">
				자재관리
				<div class="sb-sidenav-collapse-arrow">
					<i class="fas fa-angle-down"></i>
				</div>
			</a>
			<div class="collapse" id="collapseJj"
				aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
				<nav class="sb-sidenav-menu-nested nav">
					<a class="nav-link" href="matList.do">발주 관리</a>
					<a class="nav-link" href="#">입출고 관리</a>
					<a class="nav-link" href="#">자재LOT 관리</a>
					<a class="nav-link" href="#">자재재고 조회</a>
				</nav>
			</div>
			
			<a class="nav-link collapsed" href="#" data-bs-toggle="collapse"
				data-bs-target="#collapseSs" aria-expanded="false"
				aria-controls="collapseSs">
				생산관리
				<div class="sb-sidenav-collapse-arrow">
					<i class="fas fa-angle-down"></i>
				</div>
			</a>
			<div class="collapse" id="collapseSs"
				aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
				<nav class="sb-sidenav-menu-nested nav">
					<a class="nav-link" href="prodplan.do">생산계획 관리</a>
					<a class="nav-link" href="#">생산지시 관리</a>
					<a class="nav-link" href="#">생산지시 조회</a>
					<a class="nav-link" href="#">공정 모니터링</a>
					<a class="nav-link" href="#">생산일정 조회</a>
					<a class="nav-link" href="#">불량내역 조회</a>
				</nav>
			</div>
			
			<a class="nav-link collapsed" href="#" data-bs-toggle="collapse"
				data-bs-target="#collapseSb" aria-expanded="false"
				aria-controls="collapseSb">
				설비관리
				<div class="sb-sidenav-collapse-arrow">
					<i class="fas fa-angle-down"></i>
				</div>
			</a>
			<div class="collapse" id="collapseSb"
				aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
				<nav class="sb-sidenav-menu-nested nav">
					<a class="nav-link" href="#">각 설비 관리</a>
				</nav>
			</div>
			
			
			
			<div class="sb-sidenav-menu-heading">Addons</div>
			<a class="nav-link" href="charts.html">
				<div class="sb-nav-link-icon">
					<i class="fas fa-chart-area"></i>
				</div> Charts
			</a> <a class="nav-link" href="tables.html">
				<div class="sb-nav-link-icon">
					<i class="fas fa-table"></i>
				</div> Tables
			</a>
		</div>
	</div>
	<div class="sb-sidenav-footer">
		<div class="small">Logged in as:</div>
		Carboni
	</div>
</nav>