package br.senai.curso;

import java.util.List;
import java.util.Scanner;

public class CursoController {
	private static Scanner tec;
	
public void menu(List<Curso>cursos) {
		
		System.out.println("\n");
		System.out.println("|-------------- MENU ---------------|");
		System.out.println("|1 -> Cadastrar Cursos              |");
		System.out.println("|2 -> Lista de Cursos Cadastrados   |");
		System.out.println("|3 -> Editar Cursos                 |");
		System.out.println("|4 -> Excluir Cursos                |");
		System.out.println("|---------------------------------- |");
		System.out.println("\n");
		System.out.print("Informe a opção desejada: ");
		
		int opcao = tec.nextInt();
		switch(opcao) {
		case 1:
			cursos.add(cadastrarCurso());
			break;
		case 2:
			listarCursos(cursos);
			break;
		case 3:
			editarCurso(cursos);
			break;
		case 4:
			excluirCurso(cursos);
		default:
			break;
		}

	}
	
	private void excluirCurso(List<Curso> cursos) {
	// TODO Auto-generated method stub
	
}

	private void editarCurso(List<Curso> cursos) {
	// TODO Auto-generated method stub
	
}

	private void listarCursos(List<Curso> cursos) {
	// TODO Auto-generated method stub
	
}

	



	public Curso cadastrarCurso() {
		Curso curso = new Curso();
		
		System.out.println("---- Cadastrar Cursos ----");
		System.out.println("\n");
		
		System.out.print("Informe o nome do Curso: ");
		tec.nextLine();
		curso.setCurso(tec.nextLine());
		return curso;
}
}
