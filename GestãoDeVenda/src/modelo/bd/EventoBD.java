package modelo.bd;

import java.sql.Connection;
import java.sql.Date;
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

		public void cadastrarVenda(Evento evento) {
			try {
				System.out.println("Entrei!");
				// mudar a query
				stmt = con.prepareStatement(

						"insert into evento (idEvento, nome, decrição, dataCriação) values(? ? ? ?)");

				stmt.setInt(1, evento.getId());
				stmt.setString(2, evento.getNome());
				stmt.setString(3, evento.getDesc());
				stmt.setDate(4, (Date) evento.getDt());

			bd.executarSQL(stmt);
				System.out.println("Evento" + evento.getNome() + " inserido com sucesso");
			

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
				evento.setDt(rs.getDate("dt"));
				evento.setDesc(rs.getString("desc"));
				evento.setId(rs.getInt("id"));
				evento.setNome(rs.getString("nome"));
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return evento;
		}
		/*
		public ArrayList <Venda> getVendas() {
			ResultSet rs = null;
			try {
				stmt = con.prepareStatement("select * from venda");
				rs = stmt.executeQuery();

				while(rs.next()){
				    venda = new Venda();
				    venda.setIdCliente(rs.getInt("idVenda"));
				    venda.setDataVenda(rs.getDate("dataVenda"));
				    venda.setIdCliente(rs.getInt("idCliente"));
				    venda.setIdFilial(rs.getInt("idFilial"));
				    venda.setValortotal(rs.getDouble("valortotal"));
				    vendas.add(venda);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return vendas;
		}
		
		public int ExluirVenda(Venda venda) {
			ResultSet rs = null;
			try {
				stmt = con.prepareStatement("delete * from venda where idVenda= ?");
				stmt.setInt(1, venda.getIdVenda());
				bd.executarSQL(stmt);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return  bd.executarSQL(stmt);
		}
		
		public int AtualizarVenda(Venda venda) {
			try {
				stmt = con
						.prepareStatement("update venda set dataVenda=?, idCliente=?, idFilial=?, valortotal=? where idVenda = ?");
				
				stmt.setDate(1, venda.getDataVenda());
				stmt.setInt(2, venda.getIdCliente());
				stmt.setInt(3, venda.getIdFilial());
				stmt.setDouble(4, venda.getValortotal());
				
				bd.executarSQL(stmt);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return  bd.executarSQL(stmt);
		}

	}*/
}

