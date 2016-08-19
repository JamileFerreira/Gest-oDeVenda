package modelo.bd;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.*;

import moledo.utilidade.Mensagem;
import moledo.utilidade.Utilidade;





public class BDMySQL {
	private static BDMySQL singleton = null;
	private Connection con;

	public static BDMySQL getInstance() {
		if (singleton == null) {
			singleton = new BDMySQL();
		}
		return singleton;
	}

	private BDMySQL() {
		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mydb","root","241512");

		} catch (Exception e) {
			Utilidade.SOP(Mensagem.getMensagem(Mensagem.NAO_FOI_POSSIVEL_CONECTAR_AO_BANCO));
		}
	}

	public Connection getConexao() {

		return con;

	}

	public ResultSet executarBuscaSQL(String sql) {
		try {
			Statement st = (Statement) con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			return rs;
		} catch (Exception e) {
			Utilidade.SOP(Mensagem.getMensagem(Mensagem.NAO_FOI_POSSIVEL_EXECUTAR_SQL_BUSCA));
			return null;
		}

	}

	public int executarSQL(PreparedStatement stmt) {
		try {
			stmt.execute();
			try {
				this.finalize();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return Mensagem.SEM_ERRO;

		} catch (Exception e) {

			return Mensagem.NAO_FOI_POSSIVEL_CONECTAR_AO_BANCO;
		}
	}

	public void fecharConexao() {
		try {
			con.close();
		} catch (Exception e) {
			Utilidade.SOP(Mensagem.getMensagem(Mensagem.NAO_FOI_POSSIVEL_FECHAR_A_CONEXAO));
		}

	}

	@Override
	protected void finalize() throws Throwable {
		fecharConexao();
		super.finalize();
	}

}
