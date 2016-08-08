package controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.bd.VendaBD;
import modelo.ng.Venda;

/**
 * Servlet implementation class CriarVendaServlet
 */
@WebServlet("/CriarVendaServlet")
public class CriarVendaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CriarVendaServlet() {
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
		processoRequisição(request, response);
	}
	
	protected void processoRequisição(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
		 response.setContentType("text/html;charset=UTF-8");
	        try (PrintWriter out = response.getWriter()) {
	        	
	            Venda venda=new Venda();
	            System.out.println(request.getParameter("valortotal"));
	        	venda.setValortotal(Double.parseDouble(request.getParameter("valortotal")));
	        	//Data= request.getParameter("dataVenda");
	        	venda.setIdFilial(Integer.parseInt(request.getParameter("idFilial")));
	        	venda.setIdCliente(Integer.parseInt(request.getParameter("idCliente")));
	        	
	        	VendaBD vendaBD = new VendaBD();
	        	vendaBD.cadastrarVenda(venda);
	        	
	        	/*if (result){
	        		RequestDispatcher dispatcher = request.getRequestDispatcher("TeamRegisterSuccessful.jsp");
	                dispatcher.forward(request,response);
	        	}else{
	        		System.out.println("Não conseguiu inserir");
	        	}	  */      	
	        }   	
    }

}
