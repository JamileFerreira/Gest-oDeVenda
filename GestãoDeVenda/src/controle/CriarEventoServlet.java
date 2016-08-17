package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.bd.ConEventoBD;
import modelo.bd.VendaBD;
import modelo.ng.Evento;
import modelo.ng.Venda;

/**
 * Servlet implementation class CriarEventoServlet
 */
@WebServlet("/CriarEventoServlet")
public class CriarEventoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CriarEventoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		Evento evento = new Evento();
		
		evento.setId(Integer.parseInt(request.getParameter("id_evento")));
		evento.setNome(request.getParameter("nome_evento"));
		evento.setDesc(request.getParameter("desc_evento"));
		//evento.setDt(request.getParameter("dt_evento"));
       
    	
    	ConEventoBD eventobd = new ConEventoBD();
    	eventobd.
    	
    	
    	//if (result){
    		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request,response);       
    	//}else{
    	//	System.out.println("Não conseguiu inserir");
    	//}	  */      	
	}

}
