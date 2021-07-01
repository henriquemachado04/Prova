package br.senai.endereco;

public class Endereco extends Cidade{

	
	public String getNomeDaRua() {
		return NomeDaRua;
	}
	public void setNomeDaRua(String nomeDaRua) {
		NomeDaRua = nomeDaRua;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	private String NomeDaRua;
	private String Bairro;
}
