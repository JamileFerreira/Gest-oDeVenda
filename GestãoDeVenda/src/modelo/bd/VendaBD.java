package modelo.bd;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javafx.scene.chart.PieChart.Data;
import modelo.ng.Venda;

public class VendaBD {

	Connection con;
	PreparedStatement stmt;
	Venda venda;
	ResultSet rs;
	List<Venda> vendas;
	static BDMySQL bd = BDMySQL.getInstance();

	public VendaBD() {
		con = bd.getConexao();
	}

	public void cadastrarVenda(Venda venda) {
		try {
			System.out.println("Entrei!");
			// mudar a query
			stmt = con.prepareStatement(

					"insert into funcionario(nome) values(?)");

			venda = new Venda();

			stmt.setDouble(1, venda.getValortotal());
			stmt.setDate(2, venda.getDataVenda());
			stmt.setInt(3, venda.getIdFilial());
			stmt.setInt(4, venda.getIdCliente());

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
			stmt = con.prepareStatement("select * from venda where idVEnda= ?");
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
	
	public int ExluirVenda(Venda venda) {
		ResultSet rs = null;
		try {
			stmt = con.prepareStatement("delete * from venda where idVenda= ?");
			stmt.setInt(1, venda.getIdVenda());
			rs = stmt.executeQuery();

			rs.next();

			venda = new Venda();
			venda.setDataVenda(rs.getDate("dataVenda"));
			venda.setIdCliente(rs.getInt("idCliente"));
			venda.setIdFilial(rs.getInt("idFilial"));
			venda.setValortotal(rs.getDouble("valortotal"));
			return bd.executarSQL(stmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  bd.executarSQL(stmt);
	}
	// listarVendas
	//AtualizarVenda

}
