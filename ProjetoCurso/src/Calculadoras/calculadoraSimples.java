package Calculadoras;

import javax.swing.JOptionPane;

public class calculadoraSimples {

	public static void main(String[] args) {
		/* Calculadora Simples para opera��es b�sicas: Adi��o, Subtra��o, Multiplica��o, Divis�o */
		/* Neste programa utilizei conceitos simples de estruturas condicionais*/
		
		String nu1, nu2, operacao;
		double num1, num2;
		
		operacao = JOptionPane.showInputDialog("Escolha uma opera��o: 1 Adi��o | 2 Subtra��o  | 3 Multiplica��o | 4 Divis�o");

		int op = Integer.parseInt(operacao);
		
		switch (op) {
		case 1:
			JOptionPane.showMessageDialog(null, " Voc� escolheu ADI��O!");
			nu1 = JOptionPane.showInputDialog("Informe um n�mero : ");
			nu2 = JOptionPane.showInputDialog("Informe outro n�mero : ");

			num1 = Double.parseDouble(nu1);
			num2 = Double.parseDouble(nu2);

			double adicao = num1 + num2;

			JOptionPane.showMessageDialog(null, "Resultado: " + num1 + " + " + num2 + " = " + adicao);
			break;
		case 2:
			JOptionPane.showMessageDialog(null, " Voc� escolheu Subtra��o!");
			nu1 = JOptionPane.showInputDialog("Informe um n�mero : ");
			nu2 = JOptionPane.showInputDialog("Informe outro n�mero : ");

			num1 = Double.parseDouble(nu1);
			num2 = Double.parseDouble(nu2);

			double subtracao = num1 - num2;

			JOptionPane.showMessageDialog(null, "Resultado: " + num1 + " + " + num2 + " = " + subtracao);
			break;
		case 3:
			JOptionPane.showMessageDialog(null, " Voc� escolheu Multiplica��o!");
			nu1 = JOptionPane.showInputDialog("Informe um n�mero : ");
			nu2 = JOptionPane.showInputDialog("Informe outro n�mero : ");

			num1 = Double.parseDouble(nu1);
			num2 = Double.parseDouble(nu2);

			double multiplicacao = num1 * num2;

			JOptionPane.showMessageDialog(null, "Resultado: " + num1 + " * " + num2 + " = " + multiplicacao);
			break;
		case 4:
			JOptionPane.showMessageDialog(null, " Voc� escolheu Divis�o!");
			nu1 = JOptionPane.showInputDialog("Informe um n�mero : ");
			nu2 = JOptionPane.showInputDialog("Informe outro n�mero : ");

			num1 = Double.parseDouble(nu1);
			num2 = Double.parseDouble(nu2);
			
			if (num2 != 0) {
				double divisao = num1 / num2;
				JOptionPane.showMessageDialog(null, "Resultado: " + num1 + " / " + num2 + " = " + divisao);
			}else {
				JOptionPane.showMessageDialog(null, "Divis�o por ZERO! ");
			}			
			break;	

		default:
			JOptionPane.showMessageDialog(null, " Op��o invalida!");
			break;
			
		}

	}

}
