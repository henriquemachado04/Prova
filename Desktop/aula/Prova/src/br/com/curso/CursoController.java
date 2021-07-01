package br.com.curso;

import java.util.List;
import java.util.Scanner;

import br.com.aluno.Aluno;

public class CursoController {

	private Scanner in;

	public CursoController() {
		in = new Scanner(System.in);
	}

	public void menuCurso(List<Curso> cursos, List<Aluno> alunos) {
		System.out.print("\n");
		System.out.println("|-----MENU ALUNO -----|");
		System.out.println("|1 -> Cadastrar Cursos|");
		System.out.println("|2 -> Listar Cursos   |");
		System.out.println("|3 -> Editar Cursos   |");
		System.out.println("|4 -> Excluir Cursos  |");
		System.out.println("|---------------------|");
		System.out.print("Informe a Opção Desejada -> ");
		int opcao = in.nextInt();

		switch (opcao) {
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
			excluirCurso(cursos, alunos);
			break;

		default:
			System.out.println("Opção Inválida");
			break;
		}
	}

	public Curso cadastrarCurso() {
		System.out.print("\n");
		System.out.println("---- CADASTRAR CURSO ----");

		Curso curso = new Curso();

		in.nextLine();
		System.out.print("\n");
		System.out.print("Informe o nome do curso -> ");
		curso.setNomeCurso(in.nextLine());

		return curso;
	}

	public List<Curso> listarCursos(List<Curso> cursos) {

		if (cursos.isEmpty()) {
			System.out.print("\n");
			System.out.println("nao possui dados cadastrados");
			return null;
		}
		System.out.print("\n");
		System.out.println("---- CURSOS CADASTRADOS ----");

		System.out.printf("| %2s | %10s |\n", "Id", "Nome Curso");

		for (int i = 0; i < cursos.size(); i++) {
			System.out.printf("| %2d | %10s |\n", i + 1, cursos.get(i).getNomeCurso());
		}

		return cursos;
	}

	public List<Curso> editarCurso(List<Curso> cursos) {

		if (cursos.isEmpty()) {
			System.out.print("\n");
			System.out.println("nao possui dados cadastrados");
			return null;
		}

		listarCursos(cursos);

		Curso curso = new Curso();
		System.out.print("\n");
		System.out.println("---- EDITAR CURSO ----");
		System.out.print("\n");
		System.out.print("Informe o ID do curso -> ");
		int idCurso = in.nextInt() - 1;
		System.out.print("\n");
		System.out.print("Informe novamente o nome do curso -> ");
		curso.setNomeCurso(in.nextLine());

		cursos.set(idCurso, curso);

		return cursos;
	}

	public void excluirCurso(List<Curso> cursos, List<Aluno> alunos) {

		if (cursos.isEmpty()) {
			System.out.print("\n");
			System.out.println("nao possui dados cadastrados");
			return;
		}

		listarCursos(cursos);
		System.out.print("\n");
		System.out.println("---- EXCLUIR CURSO ----");
		System.out.print("\n");
		System.out.print("Informe o ID do curso para excluir -> ");
		int idCurso = in.nextInt() - 1;

		String nomeCurso = cursos.get(idCurso).getNomeCurso();

		for (int i = 0; i < alunos.size(); i++) {
			String alunoNomeCurso = alunos.get(i).getCurso().getNomeCurso();

			if (alunoNomeCurso.equals(nomeCurso)) {
				System.out.print("\n");
				System.out.println("Não foi possivel excluir o curso");
				return;
			}
		}

		if (cursos.size() <= idCurso) {

			return;
		}

		cursos.remove(idCurso);

	}
}
