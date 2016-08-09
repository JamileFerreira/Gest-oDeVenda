package controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.bd.VendaBD;
import modelo.ng.Venda;

/**
 * Servlet implementation class PreencherTelaAtualizarVenda
 */
@WebServlet("/PreencherTelaAtualizarVenda")
public class PreencherTelaAtualizarVenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PreencherTelaAtualizarVenda() {
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
	            
	        	
	        	VendaBD vendaBD = new VendaBD();	        	
	        	
	        	ArrayList<Venda> vendas = new ArrayList<Venda>();
	        	vendas=vendaBD.getVendas();
	        	//String date = new SimpleDateFormat("dd/MM/y").format(Calendar.getInstance().getTime());
	        	
	        	request.setAttribute("vendas", vendas);
	        	RequestDispatcher dispatcher = request.getRequestDispatcher("AtualizarVenda.jsp");
	            dispatcher.forward(request,response);  	
	        }   	
    }

}
