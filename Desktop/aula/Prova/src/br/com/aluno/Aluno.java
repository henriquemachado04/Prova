package br.com.aluno;

import br.com.curso.Curso;
import br.com.endereco.Endereco;

public class Aluno extends Endereco {
	private String nomeAluno;
	private int idadeAluno;
	private Curso curso = new Curso();

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public int getIdadeAluno() {
		return idadeAluno;
	}

	public void setIdadeAluno(int idadeAluno) {
		this.idadeAluno = idadeAluno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
