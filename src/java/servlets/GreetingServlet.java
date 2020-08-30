package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "GreetingServlet", urlPatterns = {"/greetingServlet.html"})
public class GreetingServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GreetingServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1> Bem vindo ao Greeting Servlet</h1>");
            
            dataHora(out);
            
            out.println("<a href='index.html'>Voltar</a> ");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    public static void dataHora(PrintWriter out){
        Date data = new Date();
        int hora = data.getHours();
        
        if(hora < 6 && hora >= 00){
            out.println("<p>Vai dormir!</p>");
        }else if (hora < 12 && hora >= 6){
            out.println("<p>Bom dia!</p>");
        }else if (hora < 18 && hora >= 12){
            out.println("<p>Boa tarde!</p>");
        }else{
            out.println("<p>Boa noite!</p>");
        }
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
