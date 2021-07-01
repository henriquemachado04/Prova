package br.com.aluno;

import java.util.List;
import java.util.Scanner;

import br.com.curso.Curso;
import br.com.curso.CursoController;

public class AlunoController {

	private Scanner in;

	public AlunoController() {
		in = new Scanner(System.in);
	}

	public void menuAluno(List<Aluno> alunos, List<Curso> cursos) {
		System.out.print("\n");
		System.out.println("|-----MENU ALUNO -----|");
		System.out.println("|1 -> Cadastrar Alunos|");
		System.out.println("|2 -> Listar Alunos   |");
		System.out.println("|3 -> Editar Alunos   |");
		System.out.println("|4 -> Excluir Alunos  |");
		System.out.println("|---------------------|");
		System.out.print("Informe a Opção Desejada -> ");

		int opcao = in.nextInt();

		switch (opcao) {
		case 1:
			alunos.add(cadastrarAluno(cursos));
			break;

		case 2:
			listarAlunos(alunos);
			break;

		case 3:
			editarAluno(alunos);
			break;

		case 4:
			excluirAluno(alunos);
			break;

		default:
			System.out.println("Opção Inválida!");
			break;
		}
	}

	public Aluno cadastrarAluno(List<Curso> cursos) {

		if (cursos.isEmpty()) {
			System.out.println("Não possui cursos cadastrados.");
			return null;
		}
		System.out.print("\n");
		System.out.println("---- CADASTRAR ALUNO ----");

		CursoController cursoController = new CursoController();
		Aluno aluno = new Aluno();

		cursoController.listarCursos(cursos);

		System.out.println("---- ID DO CURSO ----");

		System.out.print("Informe o ID do curso desejado -> ");
		int idCurso = in.nextInt() - 1;

		aluno.setCurso(cursos.get(idCurso));
		System.out.print("\n");
		System.out.println("--- ID DO ALUNO ---");

		in.nextLine();

		System.out.print("Informe o nome -> ");
		aluno.setNomeAluno(in.nextLine());

		System.out.print("Informe a idade -> ");
		aluno.setIdadeAluno(in.nextInt());

		System.out.print("informe o país -> ");
		in.nextLine();
		aluno.setPais(in.nextLine());

		System.out.print("Informe o estado -> ");
		aluno.setEstado(in.nextLine());

		System.out.print("Informe a cidade -> ");
		aluno.setCidade(in.nextLine());

		return aluno;
	}

	public List<Aluno> listarAlunos(List<Aluno> alunos) {

		if (alunos.isEmpty()) {
			System.out.println("Não possui dados cadastrados");
			return null;
		}
		System.out.print("\n");
		System.out.println("---- ALUNOS CADASTRADOS ----");

		System.out.printf("| %2s | %4s | %5s | %6s | %14s | %14s | %10s |\n", "Id", "Nome", "Idade", "País", "Estado",
				"Cidade", "Nome Curso");

		for (int i = 0; i < alunos.size(); i++) {
			System.out.printf("| %2d | %4s | %5d | %6s | %14s | %14s | %10s |\n", i + 1, alunos.get(i).getNomeAluno(),
					alunos.get(i).getIdadeAluno(), alunos.get(i).getPais(), alunos.get(i).getEstado(),
					alunos.get(i).getCidade(), alunos.get(i).getCurso().getNomeCurso());
		}

		return alunos;
	}

	public List<Aluno> editarAluno(List<Aluno> alunos) {

		if (alunos.isEmpty()) {
			System.out.println("Não possui dados cadastrados");
			return null;
		}

		listarAlunos(alunos);

		Aluno aluno = new Aluno();
		System.out.print("\n");
		System.out.println("---- EDITAR ALUNO ----");
		System.out.print("\n");
		System.out.print("Informe o ID do aluno -> ");
		int idAluno = in.nextInt() - 1;

		System.out.println("\n");
		System.out.println("|--------EDITAR  ALUNOS---------|");
		System.out.println("|1 -> NOME DO ALUNO             |");
		System.out.println("|2 -> IDADE                     |");
		System.out.println("|3 -> PAIS                      |");
		System.out.println("|4 -> ESTADO                    |");
		System.out.println("|5 -> CIDADE                    |");
		System.out.println("|-------------------------------|");

		System.out.print("Informe o campo para ser editado -> ");
		int opcao = in.nextInt();
		in.nextLine();

		switch (opcao) {
		case 1:
			System.out.print("\n");
			System.out.println("---- EDITAR NOME ----");
			System.out.print("\n");
			System.out.print("Informe novamente o nome do Aluno -> ");

			aluno.setNomeAluno(in.nextLine());

			aluno.setIdadeAluno(alunos.get(idAluno).getIdadeAluno());
			aluno.setPais(alunos.get(idAluno).getPais());
			aluno.setEstado(alunos.get(idAluno).getEstado());
			aluno.setCidade(alunos.get(idAluno).getCidade());
			break;

		case 2:
			System.out.println("---- EDITAR IDADE ----");
			System.out.print("\n");
			System.out.print("Informe novamente a idade -> ");
			aluno.setIdadeAluno(in.nextInt());

			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setPais(alunos.get(idAluno).getPais());
			aluno.setEstado(alunos.get(idAluno).getEstado());
			aluno.setCidade(alunos.get(idAluno).getCidade());
			break;

		case 3:
			System.out.print("\n");
			System.out.println("---- EDITAR PAIS ----");
			System.out.print("\n");
			System.out.print("Informe novamente o nome do país -> ");
			aluno.setPais(in.nextLine());

			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setIdadeAluno(alunos.get(idAluno).getIdadeAluno());
			aluno.setEstado(alunos.get(idAluno).getEstado());
			aluno.setCidade(alunos.get(idAluno).getCidade());

			break;

		case 4:
			System.out.print("\n");
			System.out.println("---- EDITAR ESTADO ----");
			System.out.print("\n");
			System.out.print("Informe novamente o nome do estado -> ");
			aluno.setEstado(in.nextLine());

			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setIdadeAluno(alunos.get(idAluno).getIdadeAluno());
			aluno.setPais(alunos.get(idAluno).getPais());
			aluno.setCidade(alunos.get(idAluno).getCidade());

			break;

		case 5:
			System.out.print("\n");
			System.out.println("---- EDITAR CIDADE ----");
			System.out.print("\n");
			System.out.print("Informe novamente o nome da cidade -> ");
			aluno.setCidade(in.nextLine());

			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setIdadeAluno(alunos.get(idAluno).getIdadeAluno());
			aluno.setPais(alunos.get(idAluno).getPais());
			aluno.setEstado(alunos.get(idAluno).getEstado());

			break;

		default:
			System.out.println("\nOpção Inválida!");
			break;
		}

		alunos.set(idAluno, aluno);

		return alunos;
	}

	public void excluirAluno(List<Aluno> alunos) {

		if (alunos.isEmpty()) {
			System.out.print("\n");
			System.out.println("Não possui dados cadastrados.");
			return;
		}

		listarAlunos(alunos);
		System.out.print("\n");
		System.out.println("--- EXCLUIR ALUNO ----");
		System.out.print("\n");
		System.out.print("Informe o Id do aluno para excluir -> ");
		int idAluno = in.nextInt() - 1;

		if (alunos.size() <= idAluno) {
			System.out.print("\n");
			System.out.println("Nenhum aluno cadastrado.");
			return;
		}

		alunos.remove(idAluno);

	}
}
