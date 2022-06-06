/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

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
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite o nome do cliente: ");
        String nome1 = sc.nextLine();
        System.out.println(" ");
        System.out.println("Digite o Cep: ");
        String cep1 = sc.nextLine();
        Cliente cli1 = new Cliente(nome1, cep1);
        System.out.println("Nome: " + cli1.getNome());
        System.out.println("Cep: " + cli1.getCep());
        
        System.out.println("Digite o id do segundo cliente: ");
        int id2 = sc.nextInt();
        
        System.out.println(id2);
        System.out.println("Digite o nome do cliente: ");
        String nome2 = sc.next();
        System.out.println("Digite do cep do cliente: ");
        String cep2 = sc.next();
        Cliente cli2 = new Cliente(id2, nome2, cep2);
        System.out.println("Id: " + cli2.getId());
        System.out.println("Nome: " + cli2.getNome());
        System.out.println("Cep: " + cli2.getCep());
        
        
    }
    
}
