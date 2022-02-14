import java.io.IOException;
import java.io.PrintWriter; 
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/product")
public class ProductID extends HttpServlet{


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


String url="jdbc:mysql://localhost:3306/products"; String uname="root";
String pass="";


response.setContentType("text/html");


String pId = request.getParameter("productid");


PrintWriter out = response.getWriter();
 
String query="select * from product where p_id=?";
out.print("<h1>Displaying the Product Details...</h1>"); out.print("<table border='1'><tr><th>Product Id</th><th>ProductName</th><th>quantity</th><th>bill</th></tr>");


try { Class.forName("com.mysql.cj.jdbc.Driver");
Connection dbCon = DriverManager.getConnection(url, uname, pass); PreparedStatement st= dbCon.prepareStatement(query);

st.setString(1, pId);


ResultSet rs =st.executeQuery();


while(rs.next()) {


out.print("<tr><td>"); out.println(rs.getInt(1)); out.print("</td>");
out.print("<td>"); out.print(rs.getString(2)); out.print("</td>");
out.print("<td>"); out.print(rs.getInt(3)); out.print("</td>");
out.print("</tr>");




}


}
 
catch(Exception e){


System.out.println("Some Issue : "+ e.getMessage());




}


out.print("</table>");


}


}