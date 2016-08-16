package controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import modelo.ng.Evento;
import modelo.bd.EventoBD;

/**
 * Servlet implementation class CriarEvento
 */
@WebServlet("/CriarEventoServelet")
public class CriarEventoServlet extends HttpServlet {
	protected void service(HttpServletRequest request,
					HttpServletResponse response)
	throws IOException, ServletException {
			PrintWriter out = response.getWriter();

			String nome = request.getParameter("nome_evento");
			int id = Integer.parseInt(request.getParameter("id_evento"));
			String desc = request.getParameter("descricao_evento");
			Date data = request.getParameter("data_evento");
			
		
			Evento evento = new Evento();
			evento.setData(data);
			evento.setDescricao(desc);
			evento.setId(id);
			evento.setNome(nome);
			
			EventoBD eventobd = new EventoBD();
			eventobd.cadastrarEvento(evento);
			
			
			
	}
	
	
	
	
	
}
