package main.task2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;

public class CalculateAgeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String dateOfBirth = req.getParameter("birthday");
        String choosenDate = req.getParameter("currentdate");

        LocalDate dateOfBirth1 = LocalDate.parse(dateOfBirth);
        LocalDate choosenDate1 = LocalDate.parse(choosenDate);

        Period period = Period.between(dateOfBirth1, choosenDate1);

        if(dateOfBirth1.isAfter(choosenDate1)){
            req.setAttribute("error", "Error when choose dates");
            req.getRequestDispatcher("result.jsp").forward(req, resp);
            return;
        }
        req.setAttribute("days", period.getDays());
        req.setAttribute("hours", period.getDays()*24);
        req.setAttribute("minutes", period.getDays()*24*60);
        req.setAttribute("seconds", period.getDays()*24*60*60);

        req.getRequestDispatcher("result.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String dateOfBirth = req.getParameter("birthday");
        String choosenDate = req.getParameter("currentdate");

        LocalDate dateOfBirth1 = LocalDate.parse(dateOfBirth);
        LocalDate choosenDate1 = LocalDate.parse(choosenDate);

        Period period = Period.between(dateOfBirth1, choosenDate1);

        if(dateOfBirth1.isAfter(choosenDate1)){
            req.setAttribute("error", "Error when choose dates");
            req.getRequestDispatcher("result.jsp").forward(req, resp);
            return;
        }
        System.out.println(period.getDays());
        req.setAttribute("days", period.getDays());
        req.setAttribute("hours", period.getDays()*24);
        req.setAttribute("minutes", period.getDays()*24*60);
        req.setAttribute("seconds", period.getDays()*24*60*60);

        req.getRequestDispatcher("result.jsp").forward(req, resp);
    }
}

