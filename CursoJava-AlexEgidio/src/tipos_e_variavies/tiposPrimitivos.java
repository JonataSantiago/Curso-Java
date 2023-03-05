package tipos_e_variavies;

public class tiposPrimitivos {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {

		/*
		 * Tipo inteiro int nota1 = 90; int nota2 = 70; int nota3 = 50; int nota4 = 88;
		 * 
		 * System.out.println("Média das notas =" + (nota1 + nota2 + nota3 + nota4) /
		 * 4);
		 */

		/*
		 * Tipo double serve para referenciar numeros com ponto ou virgula. double nota1
		 * = 90; double nota2 = 70; double nota3 = 50; double nota4 = 88;
		 * 
		 * double mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		 * 
		 * System.out.println("Média das notas =" + mediaFinal);
		 */

		/*
		 * CHAR representa uma letra
		 * 
		 * char pessoaFeminino = 'F';
		 * 
		 * if(pessoaFeminino == 'F') { System.out.println("Feminino"); }else {
		 * System.out.println("Masculino"); }
		 */

		/*
		 * String no Java sempre sera um texto de tamanho qualquer
		 * 
		 * String textoQualquer = "Pode ser usado para escrever qualquer coisa!"; String
		 * nome; String cpf; String telefone; String endereco;
		 */

		/* Concatenção = Unir ou juntar dados */

		String nome = "Jonata Santiago";
		String cpf = "401.864.882.02";
		String telefone = "11 96178-5800";
		String endereco = "São Paulo - SP";

		String saida = "Meu nome é " + nome + ", meu CPF: " + cpf + ", meu telefone: " + telefone + " e moro em "
				+ endereco;

		System.out.println(saida);

	}

}
