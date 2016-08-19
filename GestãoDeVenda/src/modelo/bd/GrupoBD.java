package modelo.bd;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.ng.Grupo;


public class GrupoBD {
	Connection con;
	PreparedStatement stmt;
	ResultSet rs;
	ArrayList<Grupo> grupos=new ArrayList<Grupo>();
	static BDMySQL bd = BDMySQL.getInstance();

	public GrupoBD() {
		con = BDMySQL.getInstance().getConexao();
	}

	public void cadastrarGrupo(Grupo grupo) {
		try {
			System.out.println(grupo.getNome());
			System.out.println(grupo.getCnpj());
			System.out.println(grupo.getEmail());
			System.out.println(grupo.getSite());
			System.out.println(grupo.getTelefone());
			// mudar a query
			stmt = con.prepareStatement("insert into grupo(nome, cnpj, email, site, telefone) values(?,?,?,?,?)");
			//grupo.setIdGrupo(22);
			stmt.setString(1, grupo.getNome());
			stmt.setInt(2, grupo.getCnpj());
			stmt.setString(3, grupo.getEmail());
			stmt.setString(4, grupo.getSite());
			stmt.setString(5, grupo.getTelefone());
			//stmt.setInt(6,grupo.getIdGrupo());
			System.out.println(BDMySQL.getInstance().executarSQL(stmt));
			System.out.println("Finalizei!");
		

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
