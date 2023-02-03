import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class JavaServlet extends HttpServlet {

    // Initialization code goes here
    public void init() {
        // Perform any initialization tasks, such as connecting to a database
    }

    // Handle GET requests
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Perform any logic or database calls here
        // Set response type and write output
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello from MyServlet</h1>");
        out.println("</body></html>");
    }

    // Cleanup code goes here
    public void destroy() {
        // Perform any cleanup tasks, such as closing database connections
    }
}
