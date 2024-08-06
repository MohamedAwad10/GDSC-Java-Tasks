package main.task1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FactorialServlet extends HttpServlet {

    protected long factorial(int num){
        if(num == 0){
            return 1;
        }
        long fac = 1;
        for(int i = 1; i <= num; ++i){
            fac *= i;
        }
        return fac;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head> <meta charset=\"utf-8\"> <title>JEE</title> </head>");
            out.println("<body>");
            out.println("<table border = '1'>");
            out.println("<tr>");
            out.println("<th>");
            out.println("Number");
            out.println("</th>");
            out.println("<th>");
            out.println("Factorial");
            out.println("</th>");
            out.println("</tr>");
            for(int i = 0; i <= 10; i++){
                out.println("<tr>");
                out.println("<td>"+i+"</td>");
                out.println("<td>"+factorial(i)+"</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        }

    }

}
