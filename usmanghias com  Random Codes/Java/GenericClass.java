import java.io.*;  
import javax.servlet.*;  
  
public class GenericClass extends GenericServlet{  
    public void service(ServletRequest request, ServletResponse response) throws IOException, ServletException{  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
        out.print("<html><body>");  
        out.print("<b>Hello, Generic Servlet!</b>");  
        out.print("</body></html>");  
    }  
}
