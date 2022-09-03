package com.example.portfolio.Servlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        if (path.equals("/")){
            request.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(request, response);
        }
        else if (path.equals("/login")){
            request.getRequestDispatcher("/WEB-INF/view/SignIn.jsp").forward(request, response);
        }
        if (path.equals("/registration")){
            request.getRequestDispatcher("/WEB-INF/view/SignUp.jsp").forward(request, response);
        }
    }
}
