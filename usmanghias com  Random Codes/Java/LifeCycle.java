import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LifeCycle implements Servlet {
    private ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        // Initialize the servlet, e.g. set up database connections, etc.
        System.out.println("Servlet initialized");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        // Handle requests and generate a response
        System.out.println("Servlet handling request");
    }

    @Override
    public void destroy() {
        // Clean up resources, e.g. close database connections
        System.out.println("Servlet destroyed");
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public String getServletInfo() {
        return "MyServlet";
    }
}
