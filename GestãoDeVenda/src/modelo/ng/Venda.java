package modelo.ng;

import java.sql.Date;

public class Venda {
	
	private int idVenda;
	private double valortotal;
	private Date dataVenda;
	private int idFilial;
    private int idCliente;
	
	public Date getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	public int getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}
	public double getValortotal() {
		return valortotal;
	}
	public void setValortotal(double valortotal) {
		this.valortotal = valortotal;
	}
	public int getIdFilial() {
		return idFilial;
	}
	public void setIdFilial(int idFilial) {
		this.idFilial = idFilial;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
    
}
