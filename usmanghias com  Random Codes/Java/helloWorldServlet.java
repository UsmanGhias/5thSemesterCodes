import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*;  

public class helloWorldServlet extends HttpServlet {  
    public void doGet(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  

        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
        out.println("<html><body>");  
        out.println("<h1>Hello World!</h1>");  
        out.println("</body></html>");  
    }  
}
