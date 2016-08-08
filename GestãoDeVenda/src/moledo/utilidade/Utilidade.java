package moledo.utilidade;

import javax.swing.JOptionPane;

public class Utilidade {
	
	public static boolean ehNumero(String msn){
		try{
			Integer.parseInt(msn);
			return true;
		}catch (Exception e){
			return false;
		}
	}
	
	/**
	 * Implementa o system.out.println()
	 * */
	public static void SOP(String t){
		System.out.println(t);
	}
	
	/**
	 * Tipos de mensagens de popUp
	 * */
	public static final int POP_UP_MENSAGEM_ERRO = 1;
	public static final int POP_UP_MENSAGEM_INFORMACAO = 2;
	/**
	 * Este m�todo apresenta um popUp na tela com a mensagem msn o t�tulo (titulo), e o tipo\n
	 * para o tipo use:\n
	 * 	POP_UP_MENSAGEM_ERRO       - para Mensagem de erro,\n 
	 *  POP_UP_MENSAGEM_INFORMACAO - Mensagem de informa��o \n
	 * se o t�tulo for = null o m�todo usar� "Erro" e "Informa��o"  
	 * */
	public static void mensagemPopUp(String msn, String titulo, int tipo){
		
		switch (tipo){
			case POP_UP_MENSAGEM_ERRO:{
				if (titulo == null) titulo = "Erro";
				JOptionPane.showMessageDialog(null,msn,titulo,JOptionPane.ERROR_MESSAGE);
				break;
			} 
			case POP_UP_MENSAGEM_INFORMACAO:{
				if (titulo == null) titulo = "Informa��o";
				JOptionPane.showMessageDialog(null,msn,titulo,JOptionPane.INFORMATION_MESSAGE);
				break;
			} 
		}
		
		
	} 

}
