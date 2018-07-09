package com.example.web;
import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class BeerSelect extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text.html");
        PrintWriter writer = resp.getWriter();
        writer.println("Beer selection advice");
        String str = req.getParameter("color");
        BeerExpert expert = new BeerExpert();
        List list = expert.getBrands(str);
        Iterator it = list.iterator();
        while (it.hasNext())
        {
             writer.println("<br>try:"+it.next());
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
