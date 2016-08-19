package controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.bd.GrupoBD;
import modelo.ng.Grupo;

/**
 * Servlet implementation class PreecherTelaGrupo
 */
@WebServlet("/PreecherTelaGrupo")
public class PreecherTelaGrupo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PreecherTelaGrupo() {
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
		processoRequisicao(request, response);
	}
	protected void processoRequisicao(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
		 response.setContentType("text/html;charset=UTF-8");
	        try (PrintWriter out = response.getWriter()) {
	        	System.out.println("11111111111111");
	        	GrupoBD grupoBD=new GrupoBD();
	        	int id=Integer.parseInt(request.getParameter("id"));
	            Grupo grupo =new Grupo();
	            
	            grupo=grupoBD.getGrupo(id);
	            System.out.println("-------------------------");
	            System.out.println(grupo.getCnpj());
			    System.out.println(grupo.getEmail());
			    System.out.println(grupo.getIdGrupo());
			    System.out.println(grupo.getNome());
			    System.out.println(grupo.getSite());
			    System.out.println(grupo.getTelefone());
	        	
	        	//if (result){
	            request.setAttribute("grupo", grupo);
	        		RequestDispatcher dispatcher = request.getRequestDispatcher("EditarG.jsp");
	                dispatcher.forward(request,response);       
	        	//}else{
	        	//	System.out.println("Não conseguiu inserir");
	        	//}	  */      	
	        }   	
    }
}
