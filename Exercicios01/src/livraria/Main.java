package livraria;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adilson
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Livraria
        Livro l1 = new Livro();
        l1.titulo = "Robinson Crusoe";
        l1.autor = "Daniel Defoe";
        l1.setAno(1719);
        l1.setPreco(15.5);
        
        Livro l2 = new Livro();
        l2.titulo = "Heart of Darkness";
        l2.autor = "Joseph Conrad";
        l2.setAno(1902);
        l2.setPreco(12.8);
        
        Livro l3 = new Livro();
        l3.titulo = "Beach Music";
        l3.autor = "Pat Conroy";
        l3.setAno(1996);
        l3.setPreco(9.50);       
        
        System.out.println(l1.toString());
    }
    
}
