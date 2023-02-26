import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {

    /*
    Примеры использования Session
    1.Счетчик посещений
    2.
    * */

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
        <%@ page import=""%>
        PrintWriter pw = response.getWriter();

        pw.println("<html><h1>hello world</h1></html>");
        * */

        //Redirect можем отправлять на внешние и внутренние url
        //response.sendRedirect("/testJSP.jsp");

        //Forward только на внутренние url
        RequestDispatcher dispatcher = request.getRequestDispatcher("/testJSP.jsp");
        dispatcher.forward(request, response);



    }

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

    }
}
