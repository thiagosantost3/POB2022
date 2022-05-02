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
public class Professor {
    private String id_funcional;
    private String nome;
    private String endereco;
    private String cpf;
    private String materia;
    
    public Professor(String _id_funcional, String _nome,String _endereco, String _cpf,String _materia){
    id_funcional = _id_funcional;
    nome = _nome;
    endereco = _endereco;
    cpf = _cpf;
    materia = _materia;    
    
}

    public String getId_funcional() {
        return id_funcional;
    }

    public void setId_funcional(String id_funcional) {
        this.id_funcional = id_funcional;
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

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}