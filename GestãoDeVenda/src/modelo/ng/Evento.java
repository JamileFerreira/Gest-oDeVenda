package modelo.ng;

import java.sql.Date;
import java.util.Calendar;

public class Evento {

	int id;
	String nome;
	String descricao;
	Date data;
	
	public int getId() {
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getData() {
		return this.data;
	}
	public void setData(Date data_Evento) {
		this.data = data_Evento;
	}
	

}
