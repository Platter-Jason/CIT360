package Servlet;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletExample")
public class Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Servlet() {
        super();

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter html = response.getWriter();
        html.println("<html>");
        html.println("<head>");
        html.println("<meta charset=\"UTF-8\">");
        html.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        html.println("<title>ServletExample</title>");
        html.println("</head>");
        html.println("<body>");
        html.println("<h1>Please enter your first and last name.</h1>");
        html.println("<form action=\"servletTest\" method=\"POST\">");
        html.println("<label for=\"fName\">First Name:</label>");
        html.println("<input type=\"text\" name=\"fName\"> ");
        html.println("<label for=\"lName\">Last Name:</label>");
        html.println("<input type=\"text\" name=\"lName\">");
        html.println("<input type=\"submit\" value=\"Submit\">");
        html.println("</form>");
        html.println("</body>");
        html.println("</html>");

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter html = response.getWriter();
        html.println("<html>");
        html.println("<head>");
        html.println("<title>ServletExample</title>");
        html.println("</head>");
        html.println("<body>");
        html.println("<h3>Thank you </h3>");
        html.println("<p> "+ request.getParameter("lName") + ", " + request.getParameter("fName") + " </p>");
        html.println("</body>");
        html.println("</html>");
    }

}