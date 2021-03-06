package agendaEletronicaTreeSet;

public class Contato implements Comparable<Contato>{
	private String nome;
	private int numero;
	private String email;

	public Contato(String nome, int numero, String email){
		this.nome=nome;
		this.numero=numero;
		this.email=email;
	}
	public int compareTo(Contato cont){
		return this.nome.compareTo(cont.nome);
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
