import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;


public class BookServlet extends HttpServlet {
    public class Book {
        private String title;
        private String author;
        private String ISBN;
    
        public Book(String title, String author, String ISBN) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
        }
        
    }
       // collection of books
    ArrayList<Book> books;

    public BookServlet() {
        super();
    }

    public void init() {
        books = new ArrayList<>();
        books.add(new Book("Java How to Program", "Deitel", "9780136053064"));
        books.add(new Book("Head First C#", "Andrew Stellman", "9781491976708"));
        books.add(new Book("C#", "Svetlin Nakov", "9789544007737"));
    }
   

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html"); // Setting Cont stype to text/html
    PrintWriter out = response.getWriter();
    out.println("<h1>Books</h1>");
    out.println("<table>");
    out.println("<tr>");
    out.println("<th>Title</th>");
    out.println("<th>Author</th>");
    out.println("<th>ISBN</th>");
    out.println("</tr>");
    for (Book book : books) {
        out.println("<tr>");
        out.println("<td>" + book.getTitle() + "</td>");
        out.println("<td>" + book.getAuthor() + "</td>");
        out.println("<td>" + book.getISBN() + "</td>");
        out.println("</tr>");
    }
    out.println("</table>");
    out.close();
}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getParameter("action");
    if (action == null) {
        action = "list";
    }
    switch (action) {
        case "create":
            createBook(request, response);
            break;
        case "update":
            updateBook(request, response);
            break;
        case "delete":
            deleteBook(request, response);
            break;

    }

void createBook(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String ISBN = request.getParameter("ISBN");
        Book book = new Book(title, author, ISBN);
        books.add(book);
        response.sendRedirect("books");
    }
    
void updateBook(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String ISBN = request.getParameter("ISBN");
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                book.setTitle(title);
                book.setAuthor(author);
                break;
            }
        }
        response.sendRedirect("books");
    }
    
void deleteBook(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String ISBN = request.getParameter("ISBN");
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                books.remove(book);
                break;
            }
        }
        response.sendRedirect("books");
    }
    

    }
