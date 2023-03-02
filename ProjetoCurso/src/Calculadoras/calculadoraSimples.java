package Calculadoras;

import javax.swing.JOptionPane;

public class calculadoraSimples {

	public static void main(String[] args) {
		/* Calculadora Simples para operações básicas: Adição, Subtração, Multiplicação, Divisão */
		/* Neste programa utilizei conceitos simples de estruturas condicionais*/
		
		String nu1, nu2, operacao;
		double num1, num2;
		
		operacao = JOptionPane.showInputDialog("Escolha uma operação: 1 Adição | 2 Subtração  | 3 Multiplicação | 4 Divisão");

		int op = Integer.parseInt(operacao);
		
		switch (op) {
		case 1:
			JOptionPane.showMessageDialog(null, " Você escolheu ADIÇÃO!");
			nu1 = JOptionPane.showInputDialog("Informe um número : ");
			nu2 = JOptionPane.showInputDialog("Informe outro número : ");

			num1 = Double.parseDouble(nu1);
			num2 = Double.parseDouble(nu2);

			double adicao = num1 + num2;

			JOptionPane.showMessageDialog(null, "Resultado: " + num1 + " + " + num2 + " = " + adicao);
			break;
		case 2:
			JOptionPane.showMessageDialog(null, " Você escolheu Subtração!");
			nu1 = JOptionPane.showInputDialog("Informe um número : ");
			nu2 = JOptionPane.showInputDialog("Informe outro número : ");

			num1 = Double.parseDouble(nu1);
			num2 = Double.parseDouble(nu2);

			double subtracao = num1 - num2;

			JOptionPane.showMessageDialog(null, "Resultado: " + num1 + " + " + num2 + " = " + subtracao);
			break;
		case 3:
			JOptionPane.showMessageDialog(null, " Você escolheu Multiplicação!");
			nu1 = JOptionPane.showInputDialog("Informe um número : ");
			nu2 = JOptionPane.showInputDialog("Informe outro número : ");

			num1 = Double.parseDouble(nu1);
			num2 = Double.parseDouble(nu2);

			double multiplicacao = num1 * num2;

			JOptionPane.showMessageDialog(null, "Resultado: " + num1 + " * " + num2 + " = " + multiplicacao);
			break;
		case 4:
			JOptionPane.showMessageDialog(null, " Você escolheu Divisão!");
			nu1 = JOptionPane.showInputDialog("Informe um número : ");
			nu2 = JOptionPane.showInputDialog("Informe outro número : ");

			num1 = Double.parseDouble(nu1);
			num2 = Double.parseDouble(nu2);
			
			if (num2 != 0) {
				double divisao = num1 / num2;
				JOptionPane.showMessageDialog(null, "Resultado: " + num1 + " / " + num2 + " = " + divisao);
			}else {
				JOptionPane.showMessageDialog(null, "Divisão por ZERO! ");
			}			
			break;	

		default:
			JOptionPane.showMessageDialog(null, " Opção invalida!");
			break;
			
		}

	}

}
