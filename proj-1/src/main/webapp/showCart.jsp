
<%@ page contentType="text/html;charset=utf-8" %>
<html>
<body>
      <h2>Your cart:</h2><br>
      <%@ page import = "model.*"%>
      <% Cart att = (Cart)request.getAttribute("cart"); %>
      <%= "Name:" + att.getName() + "; Quantity:"  + att.getQuantity()%>

</body>
</html>