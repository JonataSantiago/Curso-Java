package operacoes_condicionais_e_racionais;

public class if_else {

	public static void main(String[] args) {
		
		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 90;
		int nota4 = 90;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) /4;
		
		/* Opera��es l�gicas aninhadas: S�o opera��es dentro de opera��es */
		
		if (media >= 50) {
			if (media >= 70) {
				if (media >= 90) {
					System.out.println("Aluno Aprovado, Parab�ns " + media);
				}else {
					System.out.println("Aluno Aprovado " + media);
				}				
			}else {
				System.out.println("Aluno de Recupera��o " + media);
			}
		}else {
			System.out.println("Aluno Reprovado " + media);
		}
				
		
		/*Condi��es l�gica com IF e ELSE */
		/*if(media >= 70 ) {
			System.out.println("Aluno aprovado! " + media);
		}else if (media >= 40 && media <= 69) {
			System.out.println("Aluno em recupera��o! " + media);
		}else {
			System.out.println("Aluno reprovado! " + media);
		}*/
		
		
		/* Operadores tern�rios s�o para micro valida��es */
		
		/*String saidaResultado = media >= 70 ? "Aluno Aprovado" : (media >= 40 && media <= 69) ? "Aluno em Recupera��o" : "Aluno Reprovado";
		
		System.out.println(saidaResultado);*/
		
		
		/*
		int mediaAluno = 70;
		String nome = "Jonata";

		if (mediaAluno >= 70 && nome.equals("Jonata")) {
			System.out.println("Parab�ns voc� est� aprovado!");
		} else if (mediaAluno < 70) {
			System.out.println("Voc� est� reprovado!");
		}else {
			System.out.println("Aluno n�o encontrado!");
		} */
		
	}

}
