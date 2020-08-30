package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SubtractionServlet", urlPatterns = {"/subtractionServlet.html"})
public class SubtractionServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SubtractionServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h2>"+ subtractionCalc(Integer.parseInt(request.getParameter("n1")), Integer.parseInt(request.getParameter("n2"))) +"</h2>");
            
            out.println("<a href='index.html'>Voltar</a> ");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    public static int subtractionCalc(int n1, int n2){        
        return n1 - n2;
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}

