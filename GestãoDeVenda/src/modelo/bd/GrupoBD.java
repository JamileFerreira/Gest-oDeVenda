package modelo.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.ng.Grupo;
import modelo.ng.Venda;

public class GrupoBD {
	Connection con;
	PreparedStatement stmt;
	Venda venda;
	ResultSet rs;
	ArrayList<Grupo> grupos=new ArrayList<Grupo>();
	static BDMySQL bd = BDMySQL.getInstance();

	public GrupoBD() {
		con = bd.getConexao();
	}

	public void cadastrarGrupo(Grupo grupo) {
		try {
			System.out.println("Entrei!");
			// mudar a query
			stmt = con.prepareStatement("insert into grupo(nome, cnpj, email, site, telefone, idGrupo) values(??????)");
			grupo.setIdGrupo(21);
			stmt.setString(1, grupo.getNome());
			stmt.setString(2, grupo.getCnpj());
			stmt.setString(3, grupo.getEmail());
			stmt.setString(4, grupo.getSite());
			stmt.setString(5, grupo.getTelefone());
			stmt.setInt(6,grupo.getIdGrupo());
		bd.executarSQL(stmt);
			System.out.println("Finalizei!");
		

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
