<<<<<<< HEAD
package AulaFrutas;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        
        ArrayList<String> frutas = new ArrayList<String>();
        frutas.add("banana");
        frutas.add("laranja");
        frutas.add("mamão");
        frutas.add("melão");
        frutas.add("cajá");
        frutas.add("siriguela");
        frutas.add("amora");
        
        boolean tem = frutas.contains("laranja");
        System.out.println(tem);
        
        int i = frutas.indexOf("laranja");
        System.out.println(i);
        System.out.println(frutas.get(i));
        
        String result = frutas.remove(i);
        System.out.println(result);
        
        System.out.println(frutas.get(i));
        
        frutas.remove("siriguela");
        tem = frutas.contains("siriguela");
        System.out.println("siriguela" + tem);
        List<Produto> lstProduto = new ArrayList<Produto>();
        Produto prd = new Produto("Laranja", 10.52);
        lstProduto.add(prd);
        Produto prd2 = new Produto("Maça", 11.25);
        lstProduto.add(prd);
        Produto prd3 = new Produto("Banana", 8.65);
        lstProduto.add(prd);
        
        tem = false;
        tem = lstProduto.contains(prd2);
        System.out.println("lista contem produto: " + tem);
        
        prd = lstProduto.get(0);
        tem = false;
        tem = lstProduto.remove(prd);
        System.out.println("lista contem produto: " + tem);
       // lstProduto.
       System.out.println("lista contem frutas: "); 
       frutas.forEach(x-> System.out.println(x));
       
       System.out.println("lista contem Produtos: "); 
       lstProduto.forEach(x-> System.out.println(x.getNome()));
       
       while(prd.getNome() == "fim"){
         System.out.println("pocicao :"  + " digite o nome do produto = " );
         String nome = sc.nextLine();
         prd[j].setNome(nome);
         System.out.println("pocicao :" + j + " digite o valor do produto = ");
         double valor = sc.nextDouble();
         prd[j].setPreco(valor);
       }
       
       
    }
    
}
=======
package AulaFrutas;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        
        ArrayList<String> frutas = new ArrayList<String>();
        frutas.add("banana");
        frutas.add("laranja");
        frutas.add("mamão");
        frutas.add("melão");
        frutas.add("cajá");
        frutas.add("siriguela");
        frutas.add("amora");
        
        boolean tem = frutas.contains("laranja");
        System.out.println(tem);
        
        int i = frutas.indexOf("laranja");
        System.out.println(i);
        System.out.println(frutas.get(i));
        
        String result = frutas.remove(i);
        System.out.println(result);
        
        System.out.println(frutas.get(i));
        
        frutas.remove("siriguela");
        tem = frutas.contains("siriguela");
        System.out.println("siriguela" + tem);
        List<Produto> lstProduto = new ArrayList<Produto>();
        Produto prd = new Produto("Laranja", 10.52);
        lstProduto.add(prd);
        Produto prd2 = new Produto("Maça", 11.25);
        lstProduto.add(prd);
        Produto prd3 = new Produto("Banana", 8.65);
        lstProduto.add(prd);
        
        tem = false;
        tem = lstProduto.contains(prd2);
        System.out.println("lista contem produto: " + tem);
        
        prd = lstProduto.get(0);
        tem = false;
        tem = lstProduto.remove(prd);
        System.out.println("lista contem produto: " + tem);
       // lstProduto.
       System.out.println("lista contem frutas: "); 
       frutas.forEach(x-> System.out.println(x));
       
       System.out.println("lista contem Produtos: "); 
       lstProduto.forEach(x-> System.out.println(x.getNome()));
       
       while(prd.getNome() == "fim"){
         System.out.println("pocicao :"  + " digite o nome do produto = " );
         String nome = sc.nextLine();
         prd[j].setNome(nome);
         System.out.println("pocicao :" + j + " digite o valor do produto = ");
         double valor = sc.nextDouble();
         prd[j].setPreco(valor);
       }
       
       
    }
    
}
>>>>>>> 958cea02b09dfed3440a95e21bd4f6c5dcc15c7a
