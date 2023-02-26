package Pessoa;

public class Cliente {

	private string nome;

	private string sobrenome;

	private int idade;

	private date dataNascimento;

	public date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public string getNome() {
		return nome;
	}

	public void setNome(string nome) {
		this.nome = nome;
	}

	public string getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(string sobrenome) {
		this.sobrenome = sobrenome;
	}

}
