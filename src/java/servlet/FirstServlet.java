/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Taken from Blinov
 * @author Sasha
 */
@WebServlet("/FirstServlettest")
public class FirstServlet extends HttpServlet {
    
    public FirstServlet() {
        super();
    }
    
    @Override
    public void init() throws ServletException {}
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().print("This is " + this.getClass().getName() + ", using GET method");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().print("This is " + this.getClass().getName() + ", using the POST method");
    }
    
    @Override
    public void destroy() {
        super.destroy();
    }
}
