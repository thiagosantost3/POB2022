/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Academico;

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
        
        Aluno aluno = new Aluno("2020111202","Thiago Santos","CARLOS DA SILA S/N","12345678909");
     System.out.println("matricula: " + aluno.getMatricula());
     System.out.println("nome: " + aluno.getNome());
     System.out.println("endereco: " + aluno.getEndereco());
     System.out.println("cpf: " + aluno.getCpf());
     
     Professor professor = new Professor("20202","Andre Japeri","CARLOS DA SILA S/N","12345678909","JAVA");
     System.out.println("Id_funcional: " + professor.getId_funcional() + " nome: " + professor.getNome() + " endereco: " + professor.getEndereco() +" cpf: " + professor.getCpf()+ " materia: " + professor.getMateria());
     System.out.println("Media " + aluno.calculaMedia(8,10));
    }
  
}
