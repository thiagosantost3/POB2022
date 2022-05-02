/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aluno2;

/**
 *
 * @author 1910478300069
 */
public class Principal1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno Aluno1 = new Aluno();
        
        Aluno1.setNome("Thiago Azevedo");
        Aluno1.setMatricula("191000000000000");
        Aluno1.setEndereco("Rua Marinalva");
        Aluno1.setCpf("05549912309");
       
        System.out.println("nome: " + Aluno1.getNome());
        
        Aluno1.exibeAluno();
        
        Aluno Aluno2 = new Aluno();
        
        Aluno2.setNome(Aluno1.getNome());
        
        Aluno2.setCpf(Aluno1.getCpf());
        
       // System.out.println("nome: " + Aluno2.getNome());
        System.out.println();
       Aluno2.exibeAluno();
    }
  
}
