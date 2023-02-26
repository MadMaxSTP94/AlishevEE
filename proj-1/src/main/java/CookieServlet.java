import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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

        // Назначаем куки
        Cookie cookie1 = new Cookie("some_id","123");
        Cookie cookie2 = new Cookie("some_name", "Alesha" );

        cookie2.setMaxAge(24 * 60 * 60);
        cookie1.setMaxAge(24 * 60 * 60); // срок действия куки в секундах
        //добавляем куки в браузер клиента
        response.addCookie(cookie1);
        response.addCookie(cookie2);
    }
}
