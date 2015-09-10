
public class Usuario {
	private int pontos;
	private String nome;
	private boolean moderador;
	
	public Usuario(String nome, int pontos) {
		this.nome = nome;
		this.pontos = pontos;
		this.moderador = false;
	}
	
	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isModerador() {
		return moderador;
	}

	public void setModerador(boolean moderador) {
		this.moderador = moderador;
	}
}
