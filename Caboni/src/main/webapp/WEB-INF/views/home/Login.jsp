<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html>

<head>
<link href="https://fonts.googleapis.com/css?family=Inter&display=swap"
	rel="stylesheet" />
</head>
<style>
body {
	margin: 0;
	overflow-y: hidden;
	overflow-x: hidden;
}

#container {
	margin: 0;
	width: 100vw;
	height: 100vh;
}

#container #backimg {
	width: 100%;
	height: 100%;
	background-image: url(/resources/assets/img/carboniBack.jpg);
	background-repeat: no-repeat;
	filter: brightness(70%);
}

#idid {
	width: 200px;
	height: 200px;
	padding: 5px 10px;
	text-align: center;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-0%, -40%);
}

* {
	box-sizing: border-box;
}

.v368_1920 {
	margin: 0, auto;
	width: 700px;
	height: 500px;
	padding: 5px 10px;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-25%, -60%);
	border-top: 6px solid rgba(239, 239, 239);
	border-bottom: 6px solid rgba(239, 239, 239);
	overflow: hidden;
}

#headline {
	margin: 0, auto;
	font-family: 'Inter';
	position: absolute;
	white-space: nowrap;
	font-size: 70px;
	top: 20%;
	left: 50%;
	transform: translate(-75%, -130%);
	text-align: center;
	color: #FFFFFF;
}

#textboxes {
	margin: 0, auto;
	top: 50%;
	left: 50%;
	transform: translate(-110%, 0%);
}

#textboxes input {
	width: 350px;
	height: 40px;
	margin-bottom: 40px;
	border-style: none;
	border-radius: 9px;
}

button {
	-webkit-appearance: none;
	-moz-appearance: none;
	appearance: none;
	background-color: #ffffff00;
	margin: 0, auto;
	top: 50%;
	left: 50%;
	transform: translate(-93%, 0%);
	width: 120px;
	height: 50px;
	border: 6px solid rgba(239, 239, 239);
	color: #FFFFFF;
	font-family: 'Inter';
	font-style: normal;
	font-weight: 500;
	font-size: 25px;
	border-radius: 29px;
}

button:hover {
	background-color: rgb(140, 192, 127);
	transition: 0.5s;
	cursor: pointer;
}

input[type="text"] {
	font-size: small;
	font-size: 30px
}

input[type="password"] {
	font-size: larger;
	font-size: 20px
}

input[placeholder] {
	text-align: center;
	font: large-caption;
	font-size: inherit;
}
</style>

<body>
	<div id="container">
		<img id="backimg" src="/resources/assets/img/carboniBack.jpg" alt="backimg">
		<div class="v368_1920">
		<form action="#" id="idid">
			<div id="headline">
				<p>Carboni : MES</p>
			</div>
			
			<div id="textboxes">
				<label for="memberId"></label> <input type="text" name="memberId"
					placeholder="ID 를 입력해주세요"> <label for="memberPw"></label> <input
					type="password" name="memberPw" placeholder="PW 를 입력해주세요">
			</div>
			<button>Login</button>
		</form>
		</div>
		</div>
	</div>
</body>
</html>