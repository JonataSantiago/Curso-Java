package operacoes_condicionais_e_racionais;

public class estruturas_de_repeticoes {

	public static void main(String[] args) {
		
	/*Estrutura de repedição While*/
	
	/*int numero = 0;
		
	while (numero <= 10) { /* Verifica e depois executa */
	/*	System.out.println("O número atual é : " + numero);
		numero++;
	} */
	
	/*------------------------------------------------------------*/
	/*Estrutura de repedição Do While*/
	/*
	int numero2 = 0;
	
	/* Primeiro execulta e depois verifica */
	/*do { 		
		System.out.println("O número atual é : " + numero2);
		numero2++;
	}while (numero2 <= 10); */
	
	/*------------------------------------------------------------*/
	
		/*Estrutura de repedição for*/
		
		/*for (int numero = 10; numero >= 0; numero --) {
			System.out.println("O número atual é : " + numero);
			
		}*/
		/*------------------------------------------------------------*/
		
		/*Estrutura de repedição for com break (parada) */
		/*
		for (int numero = 0; numero <= 10; numero ++) {
			if (numero == 7) {
				System.out.println("Encontrei o numero que procurava : " + numero);
				System.out.println("Verificação concluida!");
				break;
			} */
		/*------------------------------------------------------------*/
		
		/*Estrutura de repedição for e Cntinue */
			
		for (int numero = 0; numero <= 10; numero ++) {
			if (numero == 3 || numero == 6 || numero == 9) {
				System.out.println("Encontrei o numero que procurava : " + numero);
				continue;
			}
			System.out.println("Processando laço de repetição");
		}
	}

}
