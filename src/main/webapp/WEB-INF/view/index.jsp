<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Courses</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style type="text/css">
        #nameField, #surnameField,#emailField {
            width: 300px; /* Ширина поля */
            padding: 10px; /* Поля */
            box-shadow: inset 0 1px 5px rgba(0,0,0,0.2); /* Тень внутри */
            border: 1px solid #ccc; /* Параметры рамки */
            color: #ff6d37; /* Цвет текста */
            background: no-repeat 5px 50%; /* Картинка пользователя */
            padding-left: 30px; /* Расстояние от левого края */
        }
      .sub{
          text-align: center;
          text-transform: uppercase;
          margin-bottom: 10px;
      }
        .footer {
            height: 120px;
            width: 100%;
            background: whitesmoke;
            padding: 0 50px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .footer-left {
            cursor: pointer;
        }
        .linkPhone {
            text-decoration: none;
            color: black;
            font-family: Calibri, sans-serif;
            font-size: 20px;
            font-weight: 300;

        }
        .linkPhone:hover {
            color : #a1cfff;
            border-bottom: 1px solid  #a1cfff;
        }
      .SentBtn{
          background-color: #056efd;
          color: white;
          padding: 10px 10px;
          margin: 0 auto;
          display: block;
          border: none;
          cursor: pointer;
          width: 15%;
          opacity: 0.9;
          border-radius: 25px;
          font-size: 14px;
          font-weight: 300;
          text-transform: uppercase;
      }

      .box{
          margin-left: 26%;
          text-align: center;
      }
        label {
            width: 200px; /* Ширина */
            text-align: right; /* Выравниваем по правому краю */
            float: left; /* Выстраиваем элементы рядом */
            margin-right: 10px; /* Расстояние от текста до текстового поля */
            line-height: 30px; /* Выравниваем по высоте */
        }
        .date{
            padding: 50px;
            outline: none;
            border-radius: 25px;
        }
        .submitField {
            margin-left: 200px; /* Сдвигаем вправо под поля */
        }
        header{
            background: #200122;
        }
        section{
            padding-top: 50px;
            padding-bottom: 50px;
        }


    </style>
</head>
<body>
<header>
    <nav class="navbar navbar-expand-lg bg-light">
        <div class="container-xxl">
            <a class="navbar-brand" href="http://localhost:8080/index">Courses</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">

                    <li class="nav-item">
                        <a class="nav-link" href="#">Link</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Link</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Link</a>
                    </li>

                </ul>
                <form class="d-flex" role="login">
                    <a class="nav-link" href="http://localhost:8080/index/login">Log in</a>
                </form>
            </div>
        </div>
    </nav>
</header>
<section>
    <div class="container">
        <div class="row align-items-center">
            <div class="col-8">
                <h1>Welcome to the courses</h1>
                <h3>
                    We invite you to visit our courses!
                    The modern methodology of our training will help you quickly and effectively master new knowledge.
                    You can easily ask the questions you are interested in.
                    We have prepared for you a complete list of the best platforms for online courses, which will help you better decide what is right for you!
                    We will be glad to see you!
                </h3>
            </div>
            <div class="col-4">
                <img class="w-100"
                     src="https://vistychi.roobrest.gov.by/files/00143/obj/110/19173/img/1.1.jpg">
            </div>
        </div>
    </div>
</section>
<section>
    <div class="container">
        <h2>Our courses</h2>
        <div class="row">
            <div class="col">
                <div class="card" style="width: 18rem;">
                    <img height="143"
                         src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQhQov_CuWg9KT2DMqwl-AiMEvIiiSQqkW1JrOo79HZuA&s">
                    <div class="card-body">
                        <h5 class="card-title">Math</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of
                            the card's content.</p>
                        <a href="#" class="btn btn-primary">Read more</a>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card" style="width: 18rem;">
                    <img src="data:image/jpeg;base64,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"
                         class="card-img-top" alt="Physics">
                    <div class="card-body">
                        <h5 class="card-title">Physics</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of
                            the card's content.</p>
                        <a href="#" class="btn btn-primary">Read more</a>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card" style="width: 18rem;">
                    <img src="data:image/jpeg;base64,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"
                         class="card-img-top" alt="Programming">
                    <div class="card-body">
                        <h5 class="card-title">Programming</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of
                            the card's content.</p>
                        <a href="#" class="btn btn-primary">Read more</a>
                    </div>
                </div>
            </div>

            <div class="col">
                <div class="card" style="width: 18rem;">
                    <img height="143"
                         src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLM4qou2zB9rR0_fpbFagwZsSZsiC2DlHcJ8oTGiu0sg&s"
                         class="card-img-top" alt="Robots">
                    <div class="card-body">
                        <h5 class="card-title">Robots</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of
                            the card's content.</p>
                        <a href="#" class="btn btn-primary">Read more</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<request>
    <h2 class="sub">Submit your application</h2>
    <hr class="line"/>
    <form><%--        добавить метод action ="post"--%>
        <p><label class="box" for="nameField">Name:</label>
            <input class="date" maxlength="25" name="name" id="nameField"></p>
        <p><label class="box" for="surnameField">Surname:</label>
            <input class="date" maxlength="25" name="surname" id="surnameField"></p>
        <p><label class="box" for="emailField">Email:</label>
            <input class="date" maxlength="25" name="surname" id="emailField"></p>
        <p><button type="submit" value="/registration" class="SentBtn">Sent</button></p>
    </form>
</request>
<div class="footer">
    <div class="footer-left">
        <a target="_blank" href="https://www.instagram.com/?hl=ru"><img src="" width="50" height="50" alt=""></a>
        <a target="_blank" href="https://vk.com/id168353332"><img
                src=""
                width="50"
                height="50" alt="fdsgfdffrtrhs"></a>
    </div>


    <div class="footer-right">
        <a class="linkPhone" href="tel:+375292350944">+375292350944</a>
    </div>

</div>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
        integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
        integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
        crossorigin="anonymous"></script>

</div>
</body>
</html>