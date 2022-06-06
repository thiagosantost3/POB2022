/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import java.util.Scanner;

/**
 *
 * @author 1910478300069
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		String nome, mat;
		ListarProduto listarProduto = new ListarProduto();
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

				if(listarProduto.inserirProduto(id, nome, codBarras, sku, descricao, categoria, preco, peso, fabricante) == 1) {
					System.out.println("Sucesso na insercao");
				}
				else {
					System.out.println("Falha na insercao");
				}

				break;
			case 2:
				System.out.println("Digite a matricula do aluno a ser removida:");
				codBarras = scanner.next();

				if(listarProduto.excluirProduto(codBarras) == 1) {
					System.out.println("Sucesso");
				}else {
					System.out.println("Falha");
				}
				break;
			case 3:
				System.out.println("Digite a matricula do aluno que voce quer alterar:");
				codBarras = scanner.next();
				System.out.println("Digite o nvo nome do aluno:");
				nome = scanner.next();
				if(listarProduto.atualizarProduto(nome, mat) == 1) {
					System.out.println("Sucesso");
				}else {
					System.out.println("Falha");
				}
				break;
			case 4:
				listarProduto.exibeListaProduto();
				break;

			case 0:
				i =0;
				break;

			}
		}
	}
    }
    

