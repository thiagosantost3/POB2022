/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

/**
 *
 * @author 1910478300069
 */
public class Produto {//Id, nome,cod de barras, descrição, categoria, preço, peso e fabricante
    private int id;
    private String nome;
    private String codBarras;
    private String sku;
    private String descricao;
    private String categoria;
    private double preco;
    private double peso;
    private String fabricante;
    
    public Produto(int id, String nome, String codBarras,String sku, String descricao, String categoria, double preco, double peso, String fabricante) {
		this.id = id;            
		this.nome = nome;
                this.codBarras = codBarras;
                this.sku = sku;
                this.descricao = descricao;
                this.categoria = categoria;
                this.preco = preco;
                this.peso = peso;
                this.fabricante = fabricante;
	}

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

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }
 public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
}
