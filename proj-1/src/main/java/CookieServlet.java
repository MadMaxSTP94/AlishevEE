import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //как работают сессии
        /*
        Клиент получает от сервера cookie JSESSIONID - уникальный id пользователя
        По этому cookie сервер узнает пользователя и его сессию
        Если очистить куки, сервер не сможет узнать его сессию

        */
    }
}
