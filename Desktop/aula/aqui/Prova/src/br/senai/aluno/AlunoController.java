package br.senai.aluno;

import java.util.List;
import java.util.Scanner;

public class AlunoController {
private static Scanner tec;
	
	public AlunoController(){
		tec = new Scanner(System.in);
	}
	
	public static int leOpcao(){
		System.out.print("Informe a opção desejada -> ");
		return tec.nextInt();
	} 
	
	public void menu(List<Aluno>alunos) {
		
		System.out.println("\n");
		System.out.println("|-------------- MENU ---------------|");
		System.out.println("|1 -> Cadastrar Aluno               |");
		System.out.println("|2 -> Listar Alunos                 |");
		System.out.println("|3 -> Editar Alunos                 |");
		System.out.println("|4 -> Excluir Alunos                |");
		System.out.println("|---------------------------------- |");
		System.out.println("\n");
		System.out.print("Informe a opção desejada: ");
		
		int opcao = tec.nextInt();
		switch(opcao) {
		case 1:
			alunos.add(cadastrarAluno());
			break;
		case 2:
			listarAluno(alunos);
			break;
		case 3:
			editarAluno(alunos);
			break;
		case 4:
			excluirAluno(alunos);
		default:
			break;
		}

	}

	private void excluirAluno(List<Aluno> alunos) {
		// TODO Auto-generated method stub
		
	}

	private void editarAluno(List<Aluno> alunos) {
		// TODO Auto-generated method stub
		
	}

	private void listarAluno(List<Aluno> alunos) {
		// TODO Auto-generated method stub
		
	}

	private Aluno cadastrarAluno() {
		// TODO Auto-generated method stub
		return null;
	}
}
