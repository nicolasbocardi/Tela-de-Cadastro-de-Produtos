package totaldeprodutos.mdl;

import javax.swing.JLabel;

public class listadeprodutos {
	
	private String nome;
	
	private int quantidade;

	public listadeprodutos(String nome, int quantidade, JLabel valor) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public static void add(listadeprodutos totaldeprodutos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "listadeprodutos [nome=" + nome + ", quantidade=" + quantidade + "]";
	}

	public Object getvalor() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getValor() {
		// TODO Auto-generated method stub
		return null;
	}

}
