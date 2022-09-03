<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>login</title>
    <style type="text/css">
        *{
            margin: 0;
            padding: 0;
            box-sizing: border-box;

        }

        h1{
            text-align: center;
            text-transform: uppercase;
            margin-bottom: 10px;
        }

        .conteiner{
            background-color:rgb(64, 64, 231);
            font-family: Arial, Helvetica, sans-serif;
            width: 100vw;
            height: 100vh;
            display:flex;
            justify-content: center;
            align-items: center;

        }

        .entrance{
            width: 400px;
            height: 400px;
            padding: 20px 50px 0 50px;
            opacity: 0.9;
            display: flex;
            flex-direction: column;
            background-color: white;
            border-radius: 5px;
            justify-content: center;
            align-items: center;
            box-shadow: 1px 4px 6px 0 rgba(29, 33, 36, 1);
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

        .loginbtn{
            background-color:rgb(64, 64, 231);
            color: white;
            padding: 10px 10px;
            margin: 30px 0;
            border: none;
            cursor: pointer;
            width: 50%;
            opacity: 0.9;
            border-radius: 25px;
            font-size: 10px;
            font-weight: 300;
            text-transform: uppercase;
        }

        .loginbtn:hover{
            background-color: rgb(22, 35, 211);
        }
        h5{
            padding-top: 10%;
        }

    </style>
</head>
<body>
<div class="conteiner">
    <div class="entrance">
        <h1 class="h1">Welcome</h1>
        <hr>
        <label class="box"><b>Login</b></label>
        <input class="date" type="text" name="login" required>

        <label class="box"><b>Password</b></label>
        <input class="date" type="password"  name="password" required>
        <a class="leftstr" href="">
            <h5>  Member password</h5></a>


        <button type="submit" class="loginbtn"><h2>Sign in</h2></button>
    </div>
</div>
</body>
</html>