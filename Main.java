package crudAlunos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		String nome, mat;
		Lista listaAlunos = new Lista();
		int i=1;
		while(i == 1) {
			System.out.println("(1)-adicionar um aluno\n(2)-remover um aluno da lista\n(3)-alterar um aluno\n(4)-exibir lista\n(0)-sair do programa: ");
			int option = scanner.nextInt();
			switch (option) {
			case 1: 
				System.out.println("Digite o nome do aluno: ");
				nome = scanner.next();
				System.out.println("Digite agora a matricula: ");
				mat = scanner.next();
				
				if(listaAlunos.inseriAluno(nome, mat) == 1) {
					System.out.println("Sucesso na insercao");
				}
				else {
					System.out.println("Falha na insercao");
				}
				
				break;
			case 2:
				System.out.println("Digite a matricula do aluno a ser removida:");
				mat = scanner.next();
				
				if(listaAlunos.excluiAluno(mat) == 1) {
					System.out.println("Sucesso");
				}else {
					System.out.println("Falha");
				}
				break;
			case 3:
				System.out.println("Digite a matricula do aluno que voce quer alterar:");
				mat = scanner.next();
				System.out.println("Digite o nvo nome do aluno:");
				nome = scanner.next();
				if(listaAlunos.atualizaAluno(nome, mat) == 1) {
					System.out.println("Sucesso");
				}else {
					System.out.println("Falha");
				}
				break;
			case 4:
				listaAlunos.exibeLista();
				break;
			
			case 0:
				i =0;
				break;
		
			}
		}
	}

}
