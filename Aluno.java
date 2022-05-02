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
public class Aluno {
  private String matricula;
  private String nome ;
  private String endereco;
  private String cpf ;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
public void exibeAluno(){


System.out.println(matricula);
System.out.println(nome);
System.out.println(endereco);
System.out.println(cpf);

    
}

   
}
