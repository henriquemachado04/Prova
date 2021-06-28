package br.com.aluno;

	import java.util.List;
	import java.util.Scanner;

	import br.com.curso.Curso;

	public class AlunoController {

		private Scanner tec;
		
		public AlunoController() {
			tec = new Scanner(System.in);
		}
		
		public int leOpcao() {
			System.out.print("> ");
			return tec.nextInt();
		}
		

		public Aluno cadastrarAluno() {
			Aluno aluno = new Aluno();
			
			System.out.println("--- CADASTRAR ALUNO(A) ---");
			System.out.print("Informe  nome: ");
			tec.nextLine();
			aluno.setNome(tec.nextLine());
			
			System.out.print("Informe o ano de nascimento: ");
			aluno.setAnoDeNascimento(tec.nextInt());
			
			System.out.print("Informe a altura: ");
			aluno.setAltura(tec.nextDouble());
			
			System.out.print("Informe o país: ");
			tec.nextLine();
			aluno.setNome(tec.nextLine());
			
			System.out.print("Informe a sigla do país: ");
			aluno.setSiglaDoPais(tec.next());
			
			System.out.print("Informe o nome do estado: ");
			tec.nextLine();
			aluno.setNomeDoEstado(tec.nextLine());
			
			System.out.print("Informe a sigla do estado: ");
			
			aluno.setNomeDoEstado(tec.next());
			
			System.out.print("Informe o nome da cidade: ");
			tec.nextLine();
			aluno.setNomeDaCidade(tec.nextLine());
			
			System.out.print("Informe o bairro: ");
			aluno.setNomeDoBairro(tec.nextLine());
			
			System.out.print("Informe o nome da rua: ");
			aluno.setNome(tec.nextLine());
			
			System.out.print("Informe o número da casa: ");
			aluno.setNumeroDaCasa(tec.nextInt());
			
			System.out.print("Informe o complemento: ");
			aluno.setComplemento(tec.next());
			
			return aluno;
		}
		public List<Aluno> listarPessoas(List<Aluno> alunos){
			if(alunos.isEmpty()) {
				System.out.println("Não possui dados para listar.");
				return null;
			}
			
			System.out.println("--- PESSOAS CADASTRADAS ---");
			
			System.out.printf("| %2s | %20s | %4s | %5s | %6s | %10s | %15s | %20s | %15s | %20s | %20s | %20s | %15s | %10s | \n", "Id", "Nome", "Ano", "Idade", "Altura"
					, "País", "Sigla do País", "Nome do estado", "Sigla do estado", "Nome da cidade", "Nome do bairro", "Nome da rua", "Número da casa", "Complemento");
			
			for(int i = 0; i < alunos.size(); i++){
			System.out.printf("| %2d | %20s | %4d | %5d | %6.2f | %10s | %15s | %20s | %15s | %20s | %20s | %20s | %15d | %11s |  \n",
					i + 1,
					alunos.get(i).getNome(),
					alunos.get(i).getAnoDeNascimento(),
					alunos.get(i).getIdade(),
					alunos.get(i).getAltura(),
					alunos.get(i).getNomeDoPais(),
					alunos.get(i).getSiglaDoPais(),
					alunos.get(i).getNomeDoEstado(),
					alunos.get(i).getSiglaDoEstado(),
					alunos.get(i).getNomeDaCidade(),
					alunos.get(i).getNomeDoBairro(),
					alunos.get(i).getNomeDaRua(),
					alunos.get(i).getNumeroDaCasa(),
					alunos.get(i).getComplemento());
			}
			return alunos;
		}
		
		public List<Aluno> editarAluno(List<Aluno> alunos) {
			
			Aluno aluno = new Aluno();
			listarAlunos(alunos);	
			
			if(alunos.isEmpty()) {
				return null;
			}
			
			System.out.print("Informe o Id do produto para editar: ");
			int idPessoa = tec.nextInt() - 1;
			
			
			System.out.println("|1) Nome da pessoa");
			System.out.println("|2) Ano de nascimento");
			System.out.println("|3) Altura");
			System.out.println("|4) Nome do País");
			System.out.println("|5) Sigla do país");
			System.out.println("|6) Nome do estado");
			System.out.println("|7) Sigla do estado");
			System.out.println("|8) Nome da cidade");
			System.out.println("|9) Nome do Bairro");
			System.out.println("|10) Nome da rua");
			System.out.println("|11) Número da casa");
			System.out.println("|12) Complemento|");
			System.out.print("Informe o campo para ser editado: ");
			int opcao = tec.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("--- EDITAR O NOME DA PESSOA ---");
				System.out.print("Informe o novo nome: ");
				tec.nextLine();
				aluno.setNome(tec.nextLine());
				
				aluno.setAnoDeNascimento(alunos.get(idAluno).getAnoDeNascimento());
				aluno.setAltura(alunos.get(idAluno).getAltura());
				aluno.setNomeDoPais(alunos.get(idAluno).getNomeDoPais());
				aluno.setSiglaDoPais(alunos.get(idAluno).getSiglaDoPais());
				aluno.setNomeDoEstado(alunos.get(idAluno).getNomeDoEstado());
				aluno.setSiglaDoEstado(alunos.get(idAluno).getSiglaDoEstado());
				aluno.setNomeDaCidade(alunos.get(idAluno).getNomeDaCidade());
				aluno.setNomeDoBairro(alunos.get(idAluno).getNomeDoBairro());
				aluno.setNomeDaRua(alunos.get(idAluno).getNomeDaRua());
				aluno.setNumeroDaCasa(alunos.get(idAluno).getNumeroDaCasa());
				aluno.setComplemento(alunos.get(idAluno).getComplemento());
				
				
				alunos.set(idPessoa, aluno);
				
				break;
				
			case 2:
				System.out.println("--- EDITAR O ANO DE NASCIMENTO ---");
				System.out.print("Informe o novo ano de nascimento: ");
				aluno.setAnoDeNascimento(tec.nextInt());
				
				
				aluno.setNome(alunos.get(idAluno).getNome());
				aluno.setAltura(alunos.get(idAluno).getAltura());
				aluno.setNomeDoPais(alunos.get(idAluno).getNomeDoPais());
				aluno.setSiglaDoPais(alunos.get(idAluno).getSiglaDoPais());
				aluno.setNomeDoEstado(alunos.get(idAluno).getNomeDoEstado());
				aluno.setSiglaDoEstado(alunos.get(idAluno).getSiglaDoEstado());
				aluno.setNomeDaCidade(alunos.get(idAluno).getNomeDaCidade());
				aluno.setNomeDoBairro(alunos.get(idAluno).getNomeDoBairro());
				aluno.setNomeDaRua(alunos.get(idAluno).getNomeDaRua());
				aluno.setNumeroDaCasa(alunos.get(idAluno).getNumeroDaCasa());
				aluno.setComplemento(alunos.get(idAluno).getComplemento());
				
				aluno.setAnoDeNascimento(2021 - aluno.getAnoDeNascimento());

				
				alunos.set(idAluno, aluno);

				
				break;
				
			case 3:
				System.out.println("--- EDITAR A ALTURA ---");
				System.out.print("Informe a nova altura: ");
				aluno.setAltura(tec.nextDouble());
				
				aluno.setNome(alunos.get(idAluno).getNome());
				aluno.setAnoDeNascimento(alunos.get(idAluno).getAnoDeNascimento());
				aluno.setNomeDoPais(alunos.get(idAluno).getNomeDoPais());
				aluno.setSiglaDoPais(alunos.get(idAluno).getSiglaDoPais());
				aluno.setNomeDoEstado(alunos.get(idAluno).getNomeDoEstado());
				aluno.setSiglaDoEstado(alunos.get(idAluno).getSiglaDoEstado());
				aluno.setNomeDaCidade(alunos.get(idAluno).getNomeDaCidade());
				aluno.setNomeDoBairro(alunos.get(idAluno).getNomeDoBairro());
				aluno.setNomeDaRua(alunos.get(idAluno).getNomeDaRua());
				aluno.setNumeroDaCasa(alunos.get(idAluno).getNumeroDaCasa());
				aluno.setComplemento(alunos.get(idAluno).getComplemento());
				
				alunos.set(idAluno, aluno);
				
				break;
			
			case 4:
				System.out.println("--- EDITAR O PAÍS ---");
				System.out.print("Informe o novo país: ");
				tec.nextLine();
				aluno.setNomeDoPais(tec.nextLine());
				
				pessoa.setNome(aluno.get(idAluno).getNome());
				pessoa.setAnoDeNascimento(pessoas.get(idAluno).getAnoDeNascimento());
				pessoa.setAltura(pessoas.get(idAluno).getAltura());
				pessoa.setNomeDoEstado(pessoas.get(idAluno).getNomeDoEstado());
				pessoa.setSiglaDoEstado(pessoas.get(idAluno).getSiglaDoEstado());
				pessoa.setNomeDaCidade(pessoas.get(idAluno).getNomeDaCidade());
				pessoa.setNomeDoBairro(pessoas.get(idAluno).getNomeDoBairro());
				pessoa.setNomeDaRua(pessoas.get(idAluno).getNomeDaRua());
				pessoa.setNumeroDaCasa(pessoas.get(idAluno).getNumeroDaCasa());
				pessoa.setComplemento(pessoas.get(idAluno).getComplemento());
				
				pessoas.set(idAluno, pessoa);
				
				
				break;
				
			case 5:
				System.out.println("--- EDITAR A SIGLA ---");
				System.out.print("Informe a nova sigla: ");
				pessoa.setSiglaDoPais(tec.next());
				
				pessoa.setNome(pessoas.get(idAluno).getNome());
				pessoa.setAnoDeNascimento(pessoas.get(idAluno).getAnoDeNascimento());
				pessoa.setNomeDoPais(pessoas.get(idAluno).getNomeDoPais());
				pessoa.setAltura(pessoas.get(idAluno).getAltura());
				pessoa.setNomeDoEstado(pessoas.get(idAluno).getNomeDoEstado());
				pessoa.setSiglaDoEstado(pessoas.get(idAluno).getSiglaDoEstado());
				pessoa.setNomeDaCidade(pessoas.get(idAluno).getNomeDaCidade());
				pessoa.setNomeDoBairro(pessoas.get(idAluno).getNomeDoBairro());
				pessoa.setNomeDaRua(pessoas.get(idAluno).getNomeDaRua());
				pessoa.setNumeroDaCasa(pessoas.get(idAluno).getNumeroDaCasa());
				pessoa.setComplemento(pessoas.get(idAluno).getComplemento());
				
				pessoas.set(idAluno, pessoa);
				break;
				
			case 6:
				System.out.println("--- EDITAR O ESTADO ---");
				System.out.print("Informe o novo estado: ");
				tec.nextLine();
				pessoa.setNomeDoEstado(tec.nextLine());
				
				pessoa.setNome(pessoas.get(idAluno).getNome());
				pessoa.setAnoDeNascimento(pessoas.get(idAluno).getAnoDeNascimento());
				pessoa.setNomeDoPais(pessoas.get(idAluno).getNomeDoPais());
				pessoa.setSiglaDoPais(pessoas.get(idAluno).getSiglaDoPais());
				pessoa.setAltura(pessoas.get(idAluno).getAltura());
				pessoa.setSiglaDoEstado(pessoas.get(idAluno).getSiglaDoEstado());
				pessoa.setNomeDaCidade(pessoas.get(idAluno).getNomeDaCidade());
				pessoa.setNomeDoBairro(pessoas.get(idAluno).getNomeDoBairro());
				pessoa.setNomeDaRua(pessoas.get(idAluno).getNomeDaRua());
				pessoa.setNumeroDaCasa(pessoas.get(idAluno).getNumeroDaCasa());
				pessoa.setComplemento(pessoas.get(idAluno).getComplemento());
				
				pessoas.set(idAluno, pessoa);
				
				break;
			
			case 7:
				System.out.println("--- EDITAR A SIGLA DO ESTADO ---");
				System.out.print("Informe a nova sigla: ");
				pessoa.setSiglaDoEstado(tec.next());
				
				pessoa.setNome(pessoas.get(idAluno).getNome());
				pessoa.setAnoDeNascimento(pessoas.get(idAluno).getAnoDeNascimento());
				pessoa.setNomeDoPais(pessoas.get(idAluno).getNomeDoPais());
				pessoa.setSiglaDoPais(pessoas.get(idAluno).getSiglaDoPais());
				pessoa.setNomeDoEstado(pessoas.get(idAluno).getNomeDoEstado());
				pessoa.setAltura(pessoas.get(idAluno).getAltura());
				pessoa.setNomeDaCidade(pessoas.get(idAluno).getNomeDaCidade());
				pessoa.setNomeDoBairro(pessoas.get(idAluno).getNomeDoBairro());
				pessoa.setNomeDaRua(pessoas.get(idAluno).getNomeDaRua());
				pessoa.setNumeroDaCasa(pessoas.get(idAluno).getNumeroDaCasa());
				pessoa.setComplemento(pessoas.get(idAluno).getComplemento());
				
				pessoas.set(idAluno, pessoa);
				
				break;
				
			case 8:
				System.out.println("--- EDITAR A CIDADE ---");
				System.out.print("Informe a nova cidade: ");
				tec.nextLine();
				pessoa.setNomeDoBairro(tec.nextLine());
				
				pessoa.setNome(pessoas.get(idAluno).getNome());
				pessoa.setAnoDeNascimento(pessoas.get(idAluno).getAnoDeNascimento());
				pessoa.setNomeDoPais(pessoas.get(idAluno).getNomeDoPais());
				pessoa.setSiglaDoPais(pessoas.get(idAluno).getSiglaDoPais());
				pessoa.setNomeDoEstado(pessoas.get(idAluno).getNomeDoEstado());
				pessoa.setSiglaDoEstado(pessoas.get(idAluno).getSiglaDoEstado());
				pessoa.setNomeDaCidade(pessoas.get(idAluno).getNomeDaCidade());
				pessoa.setAltura(pessoas.get(idAluno).getAltura());
				pessoa.setNomeDaRua(pessoas.get(idAluno).getNomeDaRua());
				pessoa.setNumeroDaCasa(pessoas.get(idAluno).getNumeroDaCasa());
				pessoa.setComplemento(pessoas.get(idAluno).getComplemento());
				
				pessoas.set(idAluno, pessoa);
				
				
				break;
				
			case 9:
				System.out.println("--- EDITAR O BAIRRO ---");
				System.out.print("Informe o novo bairro: ");
				tec.nextLine();
				pessoa.setNomeDoBairro(tec.nextLine());
				
				pessoa.setNome(pessoas.get(idAluno).getNome());
				pessoa.setAnoDeNascimento(pessoas.get(idAluno).getAnoDeNascimento());
				pessoa.setNomeDoPais(pessoas.get(idAluno).getNomeDoPais());
				pessoa.setSiglaDoPais(pessoas.get(idAluno).getSiglaDoPais());
				pessoa.setNomeDoEstado(pessoas.get(idAluno).getNomeDoEstado());
				pessoa.setSiglaDoEstado(pessoas.get(idAluno).getSiglaDoEstado());
				pessoa.setNomeDaCidade(pessoas.get(idAluno).getNomeDaCidade());
				pessoa.setAltura(pessoas.get(idAluno).getAltura());
				pessoa.setNomeDaRua(pessoas.get(idAluno).getNomeDaRua());
				pessoa.setNumeroDaCasa(pessoas.get(idAluno).getNumeroDaCasa());
				pessoa.setComplemento(pessoas.get(idAluno).getComplemento());
				
				pessoas.set(idAluno, pessoa);
				
				
				break;
				
			case 10:
				System.out.println("--- EDITAR O NOME DA RUA ---");
				System.out.print("Informe a nova rua: ");
				tec.nextLine();
				pessoa.setNomeDaRua(tec.nextLine());
				
				pessoa.setNome(pessoas.get(idAluno).getNome());
				pessoa.setAnoDeNascimento(pessoas.get(idAluno).getAnoDeNascimento());
				pessoa.setNomeDoPais(pessoas.get(idAluno).getNomeDoPais());
				pessoa.setSiglaDoPais(pessoas.get(idAluno).getSiglaDoPais());
				pessoa.setNomeDoEstado(pessoas.get(idAluno).getNomeDoEstado());
				pessoa.setSiglaDoEstado(pessoas.get(idAluno).getSiglaDoEstado());
				pessoa.setNomeDaCidade(pessoas.get(idAluno).getNomeDaCidade());
				pessoa.setNomeDoBairro(pessoas.get(idAluno).getNomeDoBairro());
				pessoa.setAltura(pessoas.get(idAluno).getAltura());
				pessoa.setNumeroDaCasa(pessoas.get(idAluno).getNumeroDaCasa());
				pessoa.setComplemento(pessoas.get(idAluno).getComplemento());
				
				pessoas.set(idAluno, pessoa);
				
				break;
				
			case 11:
				System.out.println("--- EDITAR O NÚMERO DA CASA ---");
				System.out.print("Informe o novo número: ");
				pessoa.setNumeroDaCasa(tec.nextInt());
				
				pessoa.setNome(pessoas.get(idAluno).getNome());
				pessoa.setAnoDeNascimento(pessoas.get(idAluno).getAnoDeNascimento());
				pessoa.setNomeDoPais(pessoas.get(idAluno).getNomeDoPais());
				pessoa.setSiglaDoPais(pessoas.get(idAluno).getSiglaDoPais());
				pessoa.setNomeDoEstado(pessoas.get(idAluno).getNomeDoEstado());
				pessoa.setSiglaDoEstado(pessoas.get(idAluno).getSiglaDoEstado());
				pessoa.setNomeDaCidade(pessoas.get(idAluno).getNomeDaCidade());
				pessoa.setNomeDoBairro(pessoas.get(idAluno).getNomeDoBairro());
				pessoa.setNomeDaRua(pessoas.get(idAluno).getNomeDaRua());
				pessoa.setAltura(pessoas.get(idAluno).getAltura());
				pessoa.setComplemento(pessoas.get(idAluno).getComplemento());
				
				pessoas.set(idAluno, pessoa);
				
				break;
				
			case 12:
				System.out.println("--- EDITAR O COMPLEMENTO ---");
				System.out.print("Informe o novo complemento: ");
				pessoa.setComplemento(tec.next());
				
				pessoa.setNome(pessoas.get(idAluno).getNome());
				pessoa.setAnoDeNascimento(pessoas.get(idAluno).getAnoDeNascimento());
				pessoa.setNomeDoPais(pessoas.get(idAluno).getNomeDoPais());
				pessoa.setSiglaDoPais(pessoas.get(idAluno).getSiglaDoPais());
				pessoa.setNomeDoEstado(pessoas.get(idAluno).getNomeDoEstado());
				pessoa.setSiglaDoEstado(pessoas.get(idAluno).getSiglaDoEstado());
				pessoa.setNomeDaCidade(pessoas.get(idAluno).getNomeDaCidade());
				pessoa.setNomeDoBairro(pessoas.get(idAluno).getNomeDoBairro());
				pessoa.setNomeDaRua(pessoas.get(idAluno).getNomeDaRua());
				pessoa.setNumeroDaCasa(pessoas.get(idAluno).getNumeroDaCasa());
				pessoa.setAltura(pessoas.get(idAluno).getAltura());
				
				pessoas.set(idAluno, pessoa);
				
				
				break;
				
				default:
					System.out.println("Opção inválida");
				break;
				
			}
			
			
			return pessoas;
		} 
		
		private void listarAlunos(List<Aluno> alunos) {
			// TODO Auto-generated method stub
			
		}

		public void excluirPessoa(List<Pessoa> pessoas) {
			
			listarPessoas(pessoas);
			
			if(pessoas.isEmpty()) {
				return;
			}
			
			System.out.println("--- EXCLUIR PRODUTO---");
			
			System.out.print("Informe o id do produto para excluir: ");
			int idProduto = tec.nextInt() - 1;
			
			if(pessoas.size() <= idProduto) {
				System.out.println("Produto não cadastrado.");
				return;
			}
			
			pessoas.remove(idProduto);
		}
		
		public void menuPessoa(List<Pessoa> pessoas) {
			System.out.println("--- MENU PESSOAS ---");
			System.out.println("1) Cadastrar pessoa");
			System.out.println("2) Listar pessoa");
			System.out.println("3) Editar pessoa");
			System.out.println("4) Excluir pessoa");
			System.out.println("--------------------");
			System.out.print("Informe a opção que deseja: ");
			int opcao = tec.nextInt();
			switch(opcao) {
			case 1:
				pessoas.add(cadastrarPessoa());
				break;
			case 2: 
				listarPessoas(pessoas);
				break;
			case 3: 
				editarPessoa(pessoas);
				break;
			case 4:
				excluirPessoa(pessoas);
				break;
			default:
				System.out.println("Opçao inválida");
				break;
			}
		}
		
		

	}
}
