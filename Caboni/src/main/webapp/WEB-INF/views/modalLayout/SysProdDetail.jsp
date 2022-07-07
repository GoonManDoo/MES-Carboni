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
width: 1190px;
border: 1px solid black;
}
.listFrame{
height: 390px;
width: 410px;

border-radius: 0px;
border: 1px solid black;
}

.list {
    position:relative;
    float:left;
    height: 213px;
width: 218px;
border-radius: 0px;
background: rgba(255, 255, 255, 0.01);
box-shadow: 0px 0px 9px 1px rgba(0, 0, 0, 0.1);
margin-top: 20px;
  }
      .listinner{
        position: absolute;
          bottom: 0;
      width:218px;
      height: 178px;
      box-sizing: border-box;
      padding-top:20px;
      padding-left: 10px;
      border-top:2px solid rgba(240, 240, 240, 1);
      }
        .prodname {
          height: 30px;
          width: 165px;
          border-radius: 7px;
          background: rgba(240, 240, 240, 1);
        }

        .number {
          height: 26px;
          width: 26px;
          margin-right: 7px;
          margin-top: 2px;
        }

        .listinframe {
          height: 26px;
          width: 196px;
          margin-bottom: 10px;
          display: flex;
        }

        .percent {
          height: 26px;
          width: 36px;
          border-radius: 4px;
          float: right;
          margin: 2px;
          background-color: white;
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

      <div class="ListFrame">
        <div class="list">
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