package modelo.bd;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javafx.scene.chart.PieChart.Data;
import modelo.ng.Venda;

public class VendaBD {
	Connection con;
	PreparedStatement stmt;
	Venda venda;
	ResultSet rs;
	ArrayList<Venda> vendas=new ArrayList<Venda>();
	static BDMySQL bd = BDMySQL.getInstance();

	public VendaBD() {
		con = bd.getConexao();
	}

	public void cadastrarVenda(Venda venda) {
		try {
			System.out.println("Entrei!");
			// mudar a query
			stmt = con.prepareStatement(

					"insert into venda(idVenda,valorTotal, dataVenda, idFilial, idCliente) values(?????)");

			venda = new Venda();
			venda.setIdVenda(498201512);
			stmt.setInt(1, venda.getIdVenda());
			stmt.setDouble(2, venda.getValortotal());
			//stmt.setString(3, "2006-12-24");
			stmt.setInt(4, venda.getIdFilial());
			stmt.setInt(5, venda.getIdCliente());
			

		bd.executarSQL(stmt);
			System.out.println("Finalizei!");
		

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Venda getVenda(Venda venda) {
		ResultSet rs = null;
		try {
			stmt = con.prepareStatement("select * from venda where idVenda= ?");
			stmt.setInt(1, venda.getIdVenda());
			rs = stmt.executeQuery();

			rs.next();

			venda = new Venda();
			venda.setDataVenda(rs.getDate("dataVenda"));
			venda.setIdCliente(rs.getInt("idCliente"));
			venda.setIdFilial(rs.getInt("idFilial"));
			venda.setValortotal(rs.getDouble("valortotal"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return venda;
	}
	
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

}
