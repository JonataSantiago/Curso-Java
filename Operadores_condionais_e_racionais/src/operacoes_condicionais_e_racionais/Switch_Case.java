package operacoes_condicionais_e_racionais;

public class Switch_Case {

	public static void main(String[] args) {
		
		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 90;
		int nota4 = 90;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) /4;
		
		/* Switch case: Para operações EXATAS*/
		switch (media) {
		case 70:
			System.out.println("aluno Aprovado, Parabéns" );
			break;
		
		default: System.out.println("Outro Valor" );
			break;
		}
	
	}

}
