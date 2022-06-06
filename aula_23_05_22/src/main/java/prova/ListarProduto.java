/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import java.util.ArrayList;

/**
 *
 * @author 1910478300069
 */
public class ListarProduto {
    private ArrayList<Produto> produto = new ArrayList<>();
    
    public ListarProduto(){
	}
    
    public void exibeListaProduto() {
		for (int i=0;i< produto.size();i++) {
			Produto prodl = produto.get(i);// String categoria, double preco, double peso, String fabricante
			System.out.println("id : "+ prodl.getId() + "nome do produto: " + prodl.getNome()+" cod de barras:"+ prodl.getCodBarras() +" sku:"+ prodl.getSku() + "descricao : " + prodl.getDescricao() + "categoria : " + prodl.getCategoria() + "preco : " + prodl.getPreco() + "peso : " + prodl.getPeso()+ " fabricante : " + prodl.getFabricante());
		}
	}
public int existeNaListaProduto(String codBarras) {
		Produto prodl;
		for(int i=0;i< produto.size();i++) {
			prodl = produto.get(i);
			if(prodl.getCodBarras().equals(codBarras)) {
				return i;
			}
		}

		return -1;
	}   
public int inserirProduto(int id, String nome, String codBarras, String sku, String descricao,String categoria,double preco,double peso,String fabricante) {
		Produto prodl = new Produto(id, nome, codBarras, sku, descricao, categoria, preco, peso, fabricante);
		//nao ta na lista
		if(existeNaListaProduto(codBarras) == -1){
			produto.add(prodl);
			return 1;
		}
		return 0;
	}

	public int excluirProduto(String codBarras) {
		int pos = existeNaListaProduto(codBarras);
		//está na lista
		if(pos != -1) {
			produto.remove(pos);
			return 1;
		}
		return 0;
	}
	public int atualizarProduto(int id, String nome, String codBarras,String sku,String descricao,String categoria,double preco,double peso,String fabricante) {
		int pos = existeNaListaProduto(codBarras);
		Produto prodl = new Produto(id, nome, codBarras,sku, descricao, categoria, preco, peso, fabricante);
		if(pos != -1) {
			produto.set(pos, prodl);
			return 1;
		}
		return 0;
	} 
}
