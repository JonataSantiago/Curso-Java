package operacoes_condicionais_e_racionais;

import javax.swing.JOptionPane;

public class calculaMedia {

	public static void main(String[] args) {
		
		String nota1 = JOptionPane.showInputDialog("Informe nota 1");
		String nota2 = JOptionPane.showInputDialog("Informe nota 2");
		String nota3 = JOptionPane.showInputDialog("Informe nota 3");
		String nota4 = JOptionPane.showInputDialog("Informe nota 4");
		
		double notaUm = Double.parseDouble(nota1);
		double notaDois = Double.parseDouble(nota1);
		double notaTres = Double.parseDouble(nota1);
		double notaQuatro = Double.parseDouble(nota1);
		
		double media = (notaUm + notaDois + notaTres + notaQuatro) / 4;
		
		/* Media para aprovação 70, media 50 recuperação, menor que 50 reprovado. */
		if (media >= 50) {
			if (media >= 70) {
				if (media >= 90) {
					JOptionPane.showInternalMessageDialog(null, "Aluno Aprovado, com ótimo aproveitameto! " + media);
				}else {
					JOptionPane.showInternalMessageDialog(null,"Aluno Aprovado " + media);
				}				
			}else {
				JOptionPane.showInternalMessageDialog(null,"Aluno de Recuperação " + media);
			}
		}else {
			JOptionPane.showInternalMessageDialog(null,"Aluno Reprovado " + media);
		}
		
		

	}

}
