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
	ResultSet rs;
	ArrayList<Grupo> grupos=new ArrayList<Grupo>();
	Grupo grupo;
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
	
	public ArrayList <Grupo> getGrupos() {
		ResultSet rs = null;
		try {
			stmt = con.prepareStatement("select * from grupo");
			rs = stmt.executeQuery();

			while(rs.next()){
			    grupo = new Grupo();
			    grupo.setCnpj(rs.getInt("cnpj"));
			    grupo.setEmail(rs.getString("email"));
			    grupo.setIdGrupo(rs.getInt("idGrupo"));
			    grupo.setNome(rs.getString("nome"));
			    grupo.setSite(rs.getString("site"));
			    grupo.setTelefone(rs.getString("telefone"));
			    grupos.add(grupo);
			    System.out.println("wwwwwwwwwwwww");
			    System.out.println(grupo.getNome());
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return grupos;
	}
	
	public ArrayList <Grupo> getGrupo(int id) {
		ResultSet rs = null;
		try {
			stmt = con.prepareStatement("select * from grupo where idGrupo=1?");
			stmt.setInt(1, grupo.getIdGrupo());
			rs = stmt.executeQuery();

			rs.next();
			    grupo = new Grupo();
			    grupo.setCnpj(rs.getInt("cnpj"));
			    grupo.setEmail(rs.getString("email"));
			    grupo.setIdGrupo(rs.getInt("idGrupo"));
			    grupo.setNome(rs.getString("nome"));
			    grupo.setSite(rs.getString("site"));
			    grupo.setTelefone(rs.getString("telefone"));
			    //grupos.add(grupo);
			    System.out.println("wwwwwwwwwwwww");
			    System.out.println(grupo.getNome());
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return grupos;
	}

	
	public int ExluirGrupo(int id) {
		//ResultSet rs = null;
		System.out.println("aaaaaaaaa");
		System.out.println(id);
		try {
			stmt = con.prepareStatement("delete from grupo where idGrupo= ?");
			stmt.setInt(1,id);
			System.out.println("ssssssssssss");
			System.out.println(bd.executarSQL(stmt));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  bd.executarSQL(stmt);
	}
	public int AtualizarVenda(int id) {
		try {
			stmt = con
					.prepareStatement("update grupo set nome=?, cnpj=?, email=?, site=?, telefone=? where idGrupo = ?");
			
			stmt.setString(1, grupo.getNome());
			stmt.setInt(2, grupo.getCnpj());
			stmt.setString(3, grupo.getEmail());
			stmt.setString(4, grupo.getSite());
			stmt.setString(5, grupo.getTelefone());
			
			bd.executarSQL(stmt);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  bd.executarSQL(stmt);
	}
}
