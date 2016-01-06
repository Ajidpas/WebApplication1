/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sasha
 */
@WebServlet("/MyServletTest")
public class MyServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        //response.setContentType("text/html");
        String myName = "Sasha";
        String lastName = "Dombrovskiy";
        ServletContext servletContext = this.getServletContext();
        String appFolder = servletContext.getContextPath();
        request.setAttribute("myName", myName);
        request.setAttribute("myLastName", lastName);
        request.setAttribute("applicationFolder", appFolder);
        request.getRequestDispatcher("/MyFirstJSP.jsp").forward(request, response);
    }
}
