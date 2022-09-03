<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
  <style type="text/css">
    * {
      margin: 0;
      padding: 0;
      box-sizing: border-box;
    }


    h1{
      text-align: center;
      text-transform: uppercase;
      margin-bottom: 10px;
    }

    .container{
      background-color:rgb(64, 64, 231);
      font-family: Arial, Helvetica, sans-serif;
      width: 100vw; /* vw - вся ширина экрана, т.е если экран 1440 то vw = 1440, если 960 то vw = 960*/
      height: 100vh;
      display: flex;
      align-items:center;
      justify-content:center;
    }

    .register{
      min-height: 400px;
      min-width: 500px;
      padding: 20px 50px 0 50px;
      opacity: 0.9;
      display: flex;
      flex-direction: column;
      background-color: white;
      border-radius: 5px;
      box-shadow: 1px 4px 6px 0 rgba(29, 33, 36, 0.4);
    }

    .date{
      padding: 10px;
      outline: none;
      border-radius: 25px;
    }
    label {
      margin-top: 10px;
      margin-bottom: 10px;
    }
    .line {
      min-width: 100%;
      border: none;
      height: 1px;
      background: #ffba8a;
      margin: 0 -50px;
    }
    /**/
    .registerBtn{
      background-color: #4CAF50;
      color: white;
      padding: 10px 10px;
      margin: 40px 0;
      border: none;
      cursor: pointer;
      width: 100%;
      opacity: 0.9;
      border-radius: 25px;
      font-size: 14px;
      font-weight: 300;
      text-transform: uppercase;
    }
    .registerBtn:hover{
      background-color: green;
    }

    input::placeholder{
      color: #8581de;
      text-transform: uppercase;
      font-size: 14px;
    }
  </style>
</head>
<body>
<div class="container">
  <!---->
  <div class="register">
    <h1 class="h1">Register</h1>
    <hr class="line"/>
    <form action=""></form>
      <label class="box"><b>Name</b></label>
      <input class="date" type="text" placeholder="Enter name" name="name" required>

      <label class="box"><b>Surname</b></label>
      <input class="date" type="text" placeholder="Enter surname" name="surname" required>

      <label class="box"><b>status</b></label>
      <input class="date" type="text" placeholder="Enter status" name="status" required>

    <label class="box"><b>Email</b></label>
    <input class="date" type="text" placeholder="Enter Email" name="email" required>

    <label class="box"><b>Password</b></label>
    <input class="date" type="password" placeholder="Enter Password" name="psw" required>

    <label class="box"><b>Repeat Password</b></label>
    <input class="date" type="password" placeholder="Repeat Password" name="psw-repeat" required>

    <button type="submit" value="/registration" class="registerBtn"><h2> Register</h2></button>
  </div>

</div>
</body>
</html>