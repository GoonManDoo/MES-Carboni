<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<style>
  #container {
    width: 100vw;
    height: auto;
  }

  .mainframe {
    position: relative;
    width: 1100px;
    height: auto;
    margin: auto;
    display: flex;
    flex-wrap:wrap;
    justify-content: space-around;
    padding: 10px;
    box-sizing:content-box;

  }

  .inframe {
    position: relative;
    box-sizing: border-box;
    width: 520px;
    height: 520px;

    margin-top: 10px;
    margin-bottom: 10px;
  }

  .frame {
    position: absolute;
    box-sizing: border-box;
    width: 520px;
    height: 490px;
    padding: 20px;
    rgba(254, 254, 254, 0);
    border: 4px solid rgba(218, 218, 218, 1);
    box-shadow: 0px 0px 6px 3px rgba(0, 0, 0, 0.1);

  }

  .sysname {
    width: 150px;
    height: 40px;
    padding-left: 5px;
    text-align: left;
    border-left: 2px solid rgba(217, 217, 217, 1);
    box-sizing: border-box;

  }

  .maintitle {
    font-family: 'Inter';
    font-size: 24px;
    font-weight: 500;
    color: #000000;
    margin-top: -5%;
    margin-bottom: -8%;
  }

  .subtitle {
    font-family: Inter;
    font-size: 10px;
    font-weight: 400;
    line-height: 12px;
    letter-spacing: 0em;
    color: rgba(128, 128, 128, 1);
    margin-left: 3%;
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

        button{
        background-color: rgba(255, 255, 255, 0);
        border: none;
        color:none;
        position: absolute;
        }
        .produp{
      font-size:xx-small;
      line-height: 10px;
      letter-spacing: 0em;
      text-align: left;
      color: rgba(94, 94, 94, 1);
      top:13px;
      left:60%;
        }
  .donut {
    position: relative;
float: right;
height: 267px;
width: 218px;
margin-top: -34px;
background: rgba(255, 255, 255, 0.01);
box-shadow: 0px 0px 9px 1px rgba(0, 0, 0, 0.1);
  }

  .area {
    position: relative;
    height: 163px;
    width: 472px;
    bottom: -15px;
    background: rgba(255, 255, 255, 0.01);
    box-shadow: 0px 0px 9px 1px rgba(0, 0, 0, 0.1);
    clear: both;
  }

  .apidiv1 {
    position: absolute;
    width: 218px;
    height: 226px;
    bottom:0;
  }
  hr{
    margin:0;
  }

  .apidiv2{
    position: absolute;
    width: 472px;
    height: 122px;
    bottom:0;
  }
  .do-maintitle{
    font-family: Inter;
    font-size: 20px;
    font-weight: 500;
    line-height: 0px;
    margin-left: 5px;
    text-align: left;
  }
  .areatitle{

font-family: Inter;
font-size: 20px;
font-weight: 500;
line-height: 40px;
letter-spacing: 0em;
text-align: left;
margin: 0;
margin-left: 5px;
  }
.link{
  margin-top: 490px;
  font-family: Inter;
font-size: 14px;
font-weight: 700;
line-height: 17px;
letter-spacing: 0em;
text-align: left;
top:0%;
left:80%;

}
  a {
    text-decoration-line: none;
  }

#sysupdate{
 bottom: -20%;

}

</style>

<body>
  <div id="container">
    <div class="mainframe">

      <div class="inframe">


        <div class="frame">
          <div class="sysname">
            <p class="maintitle">1stMachine</p>
            <p class="subtitle">48-spindle braiding mech</p>
          </div>
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

          <div class="donut">
            <p class="do-maintitle">Graph</p>
            <hr>
            <div class="apidiv1"></div>
          </div>
      
          <div class="area">
            <p class="areatitle">ThermoGraph</p>
            <hr class="hr2">
            <div class="apidiv2"></div>
          </div>

        </div>
      
        <button class="link"><a href="">자세히 보기 ></a></button>
     
      </div>

      <div class="inframe">


        <div class="frame">
          <div class="sysname">
            <p class="maintitle">2nd Machine</p>
            <p class="subtitle">48-spindle braiding mech</p>
          </div>
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

          <div class="donut">
            <p class="do-maintitle">Graph</p>
            <hr>
            <div class="apidiv1"></div>
          </div>
      
          <div class="area">
            <p class="areatitle">ThermoGraph</p>
            <hr class="hr2">
            <div class="apidiv2"></div>
          </div>

        </div>
      
        <button class="link"><a href="">자세히 보기 ></a></button>
     
      </div>

      <div class="inframe">


        <div class="frame">
          <div class="sysname">
            <p class="maintitle">3rd Machine</p>
            <p class="subtitle">96-spindle braiding mech</p>
          </div>
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

          <div class="donut">
            <p class="do-maintitle">Graph</p>
            <hr>
            <div class="apidiv1"></div>
          </div>
      
          <div class="area">
            <p class="areatitle">ThermoGraph</p>
            <hr class="hr2">
            <div class="apidiv2"></div>
          </div>

        </div>
      
        <button class="link"><a href="">자세히 보기 ></a></button>
     
      </div>

      <div class="inframe">


        <div class="frame">
          <div class="sysname">
            <p class="maintitle">4th Machine</p>
            <p class="subtitle">128-spindle braiding mech</p>
          </div>
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

          <div class="donut">
            <p class="do-maintitle">Graph</p>
            <hr>
            <div class="apidiv1"></div>
          </div>
      
          <div class="area">
            <p class="areatitle">ThermoGraph</p>
            <hr class="hr2">
            <div class="apidiv2"></div>
          </div>

        </div>
      
        <button class="link"><a href="">자세히 보기 ></a></button>
     
      </div>
     

    <button id="sysupdate">
      <a href=""><img src="img/설비 등록 버튼.svg" alt="sysupdate"></a>
    </button>

    </div>
    
  </div>
  </div>
  </div>
  </div>
  </div>
</body>

</html>



</html>