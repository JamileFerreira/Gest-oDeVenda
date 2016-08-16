package controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.bd.EventoBD;
import modelo.ng.Evento;

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
	}
	
	protected void service(HttpServletRequest request,HttpServletResponse response)
			throws IOException, ServletException {
					PrintWriter out = response.getWriter();

					String nome = request.getParameter("nome_evento");
					int id = Integer.parseInt(request.getParameter("id_evento"));
					String desc = request.getParameter("descricao_evento");
					String data = request.getParameter("data_evento");
					SimpleDateFormat format = new SimpleDateFormat("yyyy/mm/dd");
					java.sql.Date dat = null;
			try {
				dat = new java.sql.Date(format.parse(data).getTime());
			} catch (java.text.ParseException e) {
		// TODO Auto-generated catch block
				e.printStackTrace();
			}
	

			Evento evento = new Evento();
			evento.setData(dat);
			evento.setDescricao(desc);
			evento.setId(id);
			evento.setNome(nome);
			
	
			EventoBD eventobd = new EventoBD();
			eventobd.cadastrarEvento(evento);
	
	
	
}

}
