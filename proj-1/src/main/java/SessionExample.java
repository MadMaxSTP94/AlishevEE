import model.Cart;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SessionExample extends HttpServlet {
    //Практика с сессиями
    //Счетчик посещений сайта
    private static PrintWriter pw;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        pw = response.getWriter();
        //Как проверять авторизацию пользователя
        /*
        Иметь аттрибут в сессии типа currentUser
        if(currentUser == null) {
           направляем на страницу регистрации/авторизации
           session.setAttribute("currentUser",id);
        }
        else
        направляли на страницу
         */
        Cart cart;
        //Получаем Session для пользователя, текущий запрос
        HttpSession userSession = request.getSession();
        //Значение для атрибута получим из сессии
        cart = (Cart) userSession.getAttribute("cart");
        String name = request.getParameter("name");
        int quantity = Integer.valueOf(request.getParameter("quantity"));

        if(cart == null){
            cart = new Cart();
            cart.setName(name);
            cart.setQuantity(quantity);
        }
        request.setAttribute("cart",cart);
        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request,response);







    }
}
