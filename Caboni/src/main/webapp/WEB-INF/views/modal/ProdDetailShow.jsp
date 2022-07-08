<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}

/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  padding-top: 100px; /* Location of the box */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
}

/* Modal Content */
.modal-content {
  background-color: #fefefe;
  margin: auto;
  padding: 20px;
  border: 1px solid #888;
  height: 745px;
  width: 1271px;
border-radius: 20px;

}

/* The Close Button */
.close {
  color: #aaaaaa;
  float: right;
  font-size: 28px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: #000;
  text-decoration: none;
  cursor: pointer;
}

.mainFrame{
  height: 685px;
  width: 1250px;
  border: 1px solid black;
  margin: auto;
  margin-top: 25px;
  display: flex;
  flex: wrap;
  padding-top: -202px;
  padding-left: -98px;
  flex-wrap: wrap;
  justify-content: space-evenly;
}


.listFrame{
  float:left;
  height: 390px;
  width: 410px;
  border-radius: 0px;
}

.list {
    position:
    relative;
    float:left;
    height: 390px;
    width: 410px;
    border-radius: 0px;
    background: rgba(255, 255, 255, 0.01);
    box-shadow: 0px 0px 9px 1px rgba(0, 0, 0, 0.1);
  }
  .listinner{
        position: absolute;
        bottom: 0;
        width:369px;
        height: 289px;
        border-top:2px solid
        rgba(240, 240, 240, 1);
        left: 21px;
      }
      .prodname {
          height: 34px;
          width: 277px;
          border-radius: 7px;
          margin-top:8px;
          margin-bottom:8px;
          margin-left:14px;
          /* margin-right: 35px; */
          background: rgba(240, 240, 240, 1);
        }

        .produp{
        font-size: small;
        line-height: 10px;
        letter-spacing: 0em;
        text-align: left;
        color: rgba(94, 94, 94, 1);
        top: 17%;
        left: 70%;
        }
        
        .produp a{
        text-decoration: none;
        }
        .prodtitle{
          font-family: Inter;
          font-size: 25px;
          font-weight: 500;
          letter-spacing: 0em;
          text-align: left;
          margin-left: 23px;
          margin-top: 31px;
        }
        button{
        background-color: rgba(255, 255, 255, 0);
        border: none;
        color:none;
        position: absolute;
        }

        .number {
          height: 29px;
          width: 46px;
          margin-right: 7px;
          margin-top: 10px;
        }

        .listinframe {
          height: 43px;
          width: 336px;
          display: flex;
          margin-top: 20px;
          margin-left: 17px;
        }

        .percent {
          height: 28px;
          width: 45px;
          border-radius: 4px;
          float: right;
          margin: 3px;
          background-color: white;
        }


        .sysStatOuterFrame{
          position: relative;
          height: 270px;
          width: 410px;
          float: left;
          border: 1px solid black;


        }


        .sysActiveDate{
          position: relative;
            float:left;
            height: 271px;
            width: 736px;
            border-radius: 0px;
            border: 1px solid black;
            display: flex;
            flex-wrap: wrap;
            flex-direction: column;
            align-items: center;
            justify-content: space-around;
        }

  .systemDate{
    position: absolute;
      height: 107px;
      width: 697px;
      border-radius: 0px;
 
      border: 1px solid rgb(0, 0, 0)
  }


    .SystemCheckdat{
      position: absolute;
      height: 107px;
      width: 697px;
      border-radius: 0px;
      
      border: 1px solid rgb(0, 0, 0)
    }
    .tempgraph{
      position: relative;
            float:left;
      height: 390px;
      width: 736px;
      border-radius: 0px;
      box-shadow: 0px 2px 10px 0px rgba(0, 0, 0, 0.1);
    }

.graphAreaFrame{
  float:left;
  margin-top: 14px;
  height: 290px;
  width: 736px;
  border-radius: 0px;
  background: rgba(255, 255, 255, 1);
  border-top: 2px solid rgba(240, 240, 240, 1);

} 


    .graphArea{
      margin-top: 17px;
      width: 687px;
      height: 230px;
      margin-left: 24px;
    }
</style>
</head>
<body>

<h2>Modal Example</h2>

<!-- Trigger/Open The Modal -->
<button id="myBtn">Open Modal</button>

<!-- The Modal -->
<div id="myModal" class="modal">

  <!-- Modal content -->
  <div class="modal-content">

    <div class="mainFrame">
     
     
      <div class="sysStatOuterFrame">

        <div class="checkbut">
          <button class="checkStart"><a href="">점검진행</a></button>
        </div>


        <div class="sysStatInnerFrame">


          <div class="statname">
            <p>설비상태</p>
          </div>

          <div class="sysinner2">
  
  
  
  
            <!-- 이너프레임 2 끝 -->
          </div>
  
  
          <!-- 이너 프레임 끝 -->
        </div>
  
        <!--아우터 프레임 끝  -->
      </div>




<div class="sysActiveDate">

  <div class="systemDate">

    <p class="datetitle">yyyy-MM-dd</p>
    <div class="startdate">yyyy-MM-dd</div>
    <div class="dyingdate">yyyy-MM-dd</div>

  </div>
  
  <div class="SystemCheckdat">

    <p class="checkdate"></p>
    <div class="latestcheck">yyyy-MM-dd</div>
    <div class="nextcheck">yyyy-MM-dd</div>
    <div class="today">yyyy-MM-dd</div>
    <div class="alertmessage">alert</div>
  </div>

</div>


      <div class="ListFrame">
        <div class="list">
          <div class="prodtitle">
          <p style="margin-left: 3px;
                    margin-top: 20px;
                    margin-bottom:0px;">Now product Solution</p>
          </div>
          <button class="produp"><a href="">공정 등록하기 ></a></button>
            <div class="listinner">
              <div class="listinframe">
                <img class="number" src="img/1.svg" alt="1">
                <div class="prodname">
                  <div class="percent"></div>
                </div>
              </div>
  
              <div class="listinframe">
                <img class="number" src="img/2.svg" alt="2">
                <div class="prodname">
                  <div class="percent"></div>
                </div>
              </div>
  
              <div class="listinframe">
                <img class="number" src="img/3.svg" alt="3">
                <div class="prodname">
                  <div class="percent"></div>
                </div>
              </div>
  
              <div class="listinframe">
                <img class="number" src="img/4.svg" alt="4">
                <div class="prodname">
                  <div class="percent"></div>
                </div>
            </div>
          </div>
        </div>
    </div>

    <div class="tempgraph">
      <p>Machine graph</p>
      <p>Secondary text</p>


      <div class="graphAreaFrame">
        
          <div class="graphArea">

          </div>
      </div>
    </div>
    



    <!-- 모달 끝 -->
    </div>

   

</div>

<script>
// Get the modal
var modal = document.getElementById("myModal");

// Get the button that opens the modal
var btn = document.getElementById("myBtn");

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];

// When the user clicks the button, open the modal 
btn.onclick = function() {
  modal.style.display = "block";
}

// When the user clicks on <span> (x), close the modal
span.onclick = function() {
  modal.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
}
</script>

</body>
</html>