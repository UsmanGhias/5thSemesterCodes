//These are just code if you want to get indepth documentation please visit my website
//usmanghias.com 
import java.io.*;
import javax.servlet.*;


public class servletInterface implements Servlet {
    ServletConfig Config = null ;
   
    
    public void init(ServletConfig config) {
        this.config = config;
        System.out.println("Servlet is initialized");
    }

    public void service(ServletRequest request, ServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html><body>");
        out.print("<b>Hello Simple Servlet</b>");
        out.print("</body></html>");
    }

    public void destroy() {
        System.out.println("Servlet is destroyed");
    }

    public ServletConfig getServletConfig() {
        return config;
    }

    public String getServletInfo() {
        return "Copyright CodewithUsman 2023";
    }
}

