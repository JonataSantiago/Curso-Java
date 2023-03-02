package operacoes_condicionais_e_racionais;

import javax.swing.JOptionPane;

public class calculo_divisao_e_resto {

	public static void main(String[] args) {
	
	/* Módulo: Resto da Divisão % */	
	/*
	 
	double carro = 9;
	double pessoa = 2;
	
	double resto = carro % pessoa;
	
	System.out.println("Sobraram exatamente: " + resto + " carros" );
	
	*/
	
	/*---------------------------------------------------------------------*/	
	
	/* Entrada / Saída e Confirmão de dados através da classe JOptionPane (Caixas de Diálogos */
		
	String carros = JOptionPane.showInputDialog("Informe a quantidade de carros?");
	String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas?");
	
	double carroNumero = Double.parseDouble(carros);
	double pessoaNumero = Double.parseDouble(pessoas);
	
	int divisao = (int) (carroNumero / pessoaNumero);
	
	double resto = carroNumero % pessoaNumero;
	
		/*Imprime caixa de confirmação: Sim=0 /Não=1 /Cancelar=2 */
	int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão? ");
	
	if (resposta == 0) {
		/*Imprime caixa de menssagem na tela*/
		JOptionPane.showMessageDialog(null, "Divisão por pessoa deu : " +  divisao);
	}
	
	resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão? ");
	
	if (resposta == 0) {
		JOptionPane.showMessageDialog(null, "O resto é : " +  resto);
	}
	
	
	
	}

}
