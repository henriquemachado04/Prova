package br.com.senai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.aluno.Aluno;
import br.com.aluno.AlunoController;
import br.com.curso.Curso;
import br.com.curso.CursoController;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Curso> cursos = new ArrayList<Curso>();

		Scanner in = new Scanner(System.in);
		boolean sair = true;

		AlunoController alunoController = new AlunoController();
		CursoController cursoController = new CursoController();

		do {
			System.out.print("\n");
			System.out.println("|--- MENU PRINCIPAL --- |");
			System.out.println("|1 -> Menu De Alunos    |");
			System.out.println("|2 -> Menu De Cursos    |");
			System.out.println("|0 -> Sair              |");
			System.out.println("|-----------------------|");
			System.out.print("Informe a Opção Desejada -> ");

			int opcao = in.nextInt();

			switch (opcao) {
			case 1:
				alunoController.menuAluno(alunos, cursos);
				break;

			case 2:
				cursoController.menuCurso(cursos, alunos);
				break;

			case 0:

				sair = false;
				break;

			default:
				System.out.print("\n");
				System.out.println("Opção Inválida!");
				break;
			}

		} while (sair);
		System.out.print("\n");
		System.out.println("Sistema Finalizado");
	}

}
