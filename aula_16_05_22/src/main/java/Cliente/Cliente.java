/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

/**
 *
 * @author 1910478300069
 */
public class Cliente {
    private int id;
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    private String cep;
    
    public Cliente(int id, String nome, String cep){
        this.id = id;
        this.nome = nome;
        this.cep = cep;
    }
    public Cliente(String nome, String cep){
        this.nome = nome;
        this.cep = cep;
    }
    public Cliente(){
    
    }
}
