package br.senai.aluno;

import br.senai.curso.Curso;
import br.senai.endereco.Endereco;

public class Aluno extends Endereco{

	
	private String NomeDoAluno;
	private String IdadeDoAluno;
	private Curso cursos;
	public String getNomeDoAluno() {
		return NomeDoAluno;
	}
	public void setNomeDoAluno(String nomeDoAluno) {
		NomeDoAluno = nomeDoAluno;
	}
	public String getIdadeDoAluno() {
		return IdadeDoAluno;
	}
	public void setIdadeDoAluno(String idadeDoAluno) {
		IdadeDoAluno = idadeDoAluno;
	}
	public Curso getCursos() {
		return cursos;
	}
	public void setCursos(Curso cursos) {
		this.cursos = cursos;
	}
	
	
}
