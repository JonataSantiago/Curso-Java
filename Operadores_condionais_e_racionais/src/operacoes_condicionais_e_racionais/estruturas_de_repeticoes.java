package operacoes_condicionais_e_racionais;

public class estruturas_de_repeticoes {

	public static void main(String[] args) {
		
	/*Estrutura de repedi��o While*/
	
	/*int numero = 0;
		
	while (numero <= 10) { /* Verifica e depois executa */
	/*	System.out.println("O n�mero atual � : " + numero);
		numero++;
	} */
	
	/*------------------------------------------------------------*/
	/*Estrutura de repedi��o Do While*/
	/*
	int numero2 = 0;
	
	/* Primeiro execulta e depois verifica */
	/*do { 		
		System.out.println("O n�mero atual � : " + numero2);
		numero2++;
	}while (numero2 <= 10); */
	
	/*------------------------------------------------------------*/
	
		/*Estrutura de repedi��o for*/
		
		/*for (int numero = 10; numero >= 0; numero --) {
			System.out.println("O n�mero atual � : " + numero);
			
		}*/
		/*------------------------------------------------------------*/
		
		/*Estrutura de repedi��o for com break (parada) */
		/*
		for (int numero = 0; numero <= 10; numero ++) {
			if (numero == 7) {
				System.out.println("Encontrei o numero que procurava : " + numero);
				System.out.println("Verifica��o concluida!");
				break;
			} */
		/*------------------------------------------------------------*/
		
		/*Estrutura de repedi��o for e Cntinue */
			
		for (int numero = 0; numero <= 10; numero ++) {
			if (numero == 3 || numero == 6 || numero == 9) {
				System.out.println("Encontrei o numero que procurava : " + numero);
				continue;
			}
			System.out.println("Processando la�o de repeti��o");
		}
	}

}
