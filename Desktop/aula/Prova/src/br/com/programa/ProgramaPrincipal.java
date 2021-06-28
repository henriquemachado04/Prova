package br.com.programa;

public class ProgramaPrincipal {
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
	
public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		
		List<Aluno> alunos = new ArrayList<>();
		List<Curso> cursos = new ArrayList<Curso>();
		
		AlunoController alunoController = new AlunoController();
		CursooController cursoController = new CursoController();
		boolean sair = false;
	
		
		do {
			System.out.println("--- MENU PRICIPAL ---");
			System.out.println("1) Menu Aluno");
			System.out.println("2) Menu Curso");
			System.out.println("0) Sair");
			System.out.println("---------------------");
			System.out.print("Informe a opção que deseja: ");
			
			int opcao = tec.nextInt();  			
			switch(opcao) {
			case 1:
				alunoController.menuPessoa(alunos);
				break;
			
			case 2:
				cursoController.menuProduto(cursos);
				break;
			
			case 0:
				sair = true;
				break;
		
				
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}while(!sair);
		
		System.out.println("Sistema finalizado!");
	}

}
}
