package operacoes_condicionais_e_racionais;

public class if_else {

	public static void main(String[] args) {
		
		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 90;
		int nota4 = 90;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) /4;
		
		/* Operações lógicas aninhadas: São operações dentro de operações */
		
		if (media >= 50) {
			if (media >= 70) {
				if (media >= 90) {
					System.out.println("Aluno Aprovado, Parabéns " + media);
				}else {
					System.out.println("Aluno Aprovado " + media);
				}				
			}else {
				System.out.println("Aluno de Recuperação " + media);
			}
		}else {
			System.out.println("Aluno Reprovado " + media);
		}
				
		
		/*Condições lógica com IF e ELSE */
		/*if(media >= 70 ) {
			System.out.println("Aluno aprovado! " + media);
		}else if (media >= 40 && media <= 69) {
			System.out.println("Aluno em recuperação! " + media);
		}else {
			System.out.println("Aluno reprovado! " + media);
		}*/
		
		
		/* Operadores ternários são para micro validações */
		
		/*String saidaResultado = media >= 70 ? "Aluno Aprovado" : (media >= 40 && media <= 69) ? "Aluno em Recuperação" : "Aluno Reprovado";
		
		System.out.println(saidaResultado);*/
		
		
		/*
		int mediaAluno = 70;
		String nome = "Jonata";

		if (mediaAluno >= 70 && nome.equals("Jonata")) {
			System.out.println("Parabéns você está aprovado!");
		} else if (mediaAluno < 70) {
			System.out.println("Você está reprovado!");
		}else {
			System.out.println("Aluno não encontrado!");
		} */
		
	}

}
