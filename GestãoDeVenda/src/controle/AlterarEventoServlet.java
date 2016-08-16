package controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.bd.EventoBD;
import modelo.ng.Evento;

/**
 * Servlet implementation class ModificarEventoServlet
 */
@WebServlet("/ModificarEventoServlet")
public class AlterarEventoServlet extends HttpServlet {
	protected void service(HttpServletRequest request,
					HttpServletResponse response)
	throws IOException, ServletException {
			PrintWriter out = response.getWriter();

			
			int id = Integer.parseInt(request.getParameter("id_evento"));
			
			Evento evento = new Evento();
			evento.setId(id);
			evento = 
			EventoBD eventobd = new EventoBD();
			eventobd.AtualizarEvento(evento);
			eventobd.getEvento(evento)
	}
}
			
