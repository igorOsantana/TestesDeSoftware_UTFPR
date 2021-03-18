package questão1;

public class Aluno {
	private String nome;
	private float nota;
	private String mensagem;

	public Aluno (String nome, float nota) {
		this.nome = nome;
		this.nota = nota;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getNome() {
		return nome;
	}

	public float getNota() {
		return nota;
	}

	public String getMensagem() {
		return mensagem;
	}
}
