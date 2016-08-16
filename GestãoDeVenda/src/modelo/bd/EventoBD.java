package modelo.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.ng.Evento;
import modelo.ng.Venda;

public class EventoBD {
	Connection con;
	PreparedStatement stmt;
	Evento evento;
	ResultSet rs;
	ArrayList<Evento> eventos = new ArrayList<Evento>();
	static BDMySQL bd = BDMySQL.getInstance();

	public EventoBD() {
		con = bd.getConexao();
	}

	public void cadastrarEvento(Evento evento) {
		try {
			stmt = con.prepareStatement(

					"insert into evento(idEvento, nome, descrição, dataCriação)"
					+ " values(?, ?, ?, ?)"
			);

			evento = new Evento();
			
			stmt.setInt(1, evento.getId());
			stmt.setString(2, evento.getNome());
			stmt.setString(3, evento.getDescricao());
			stmt.setDate(4, evento.getData());
			
			bd.executarSQL(stmt);
			System.out.println("Finalizei!");
		

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Evento getEvento(Evento evento) {
		ResultSet rs = null;
		try {
			stmt = con.prepareStatement("select * from evento where idEvento= ?");
			stmt.setInt(1, evento.getId());
			rs = stmt.executeQuery();

			rs.next();

			evento = new Evento();
			//evento.setData(rs.getString("dataCriação"));
			evento.setDescricao(rs.getString("descrição"));
			evento.setId(rs.getInt("idEvento"));
			evento.setNome(rs.getString("nome"));
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return evento;
	}
	
	public ArrayList <Evento> getEvento() {
		ResultSet rs = null;
		try {
			stmt = con.prepareStatement("select * from evento");
			rs = stmt.executeQuery();

			while(rs.next()){
			    evento = new Evento();
			    //evento.setData(rs.getString("dataCriação"));
			    evento.setDescricao(rs.getString("descrição"));
			    evento.setId(rs.getInt("idEvento"));
			    evento.setNome(rs.getString("nome"));		    
			    
			    
			    eventos.add(evento);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return eventos;
	}
	
	public int ExluirEvento(Evento evento) {
		ResultSet rs = null;
		try {
			stmt = con.prepareStatement("delete * from evento where idEvento= ?");
			stmt.setInt(1, evento.getId());
			bd.executarSQL(stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  bd.executarSQL(stmt);
	}
	
	public int AtualizarEvento(Evento evento) {
		try {
			stmt = con
					.prepareStatement("update evento set idEvento=?, nome=?, descrição=?, dataCriação=? where idEvento = ?");
			
			stmt.setInt(1, evento.getId());
			stmt.setString(2, evento.getNome());
			stmt.setString(3, evento.getDescricao());
			//stmt.setString(4, evento.getData());
			
			bd.executarSQL(stmt);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  bd.executarSQL(stmt);
	

}
}
