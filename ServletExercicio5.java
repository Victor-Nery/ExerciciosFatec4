import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/exercicio5")
public class ServletExercicio5 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ServletExercicio5() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int numero = Integer.parseInt(request.getParameter("numero"));
        int soma = 0;

        for (int i = 1; i <= numero; i++) {
            soma += i;
        }

        PrintWriter saida = response.getWriter();
        saida.println("<html lang=\"pt-br\">"
                + "<meta charset=\"UTF-8\">"
                + "<head><title>Soma dos Números</title></head>"
                + "<body><h1>A soma dos números de 1 até " + numero + " é: " + soma + 
                "</h1></body></html>");
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }
}
