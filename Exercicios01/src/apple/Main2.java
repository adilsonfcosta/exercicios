/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apple;

/**
 *
 * @author Adilson
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Apple maca1 = new Apple(10, 20);
        Apple maca2 = new Apple(30, 20);
        Apple maca3 = new Apple(20, 10);
        
        System.out.println("Cada instância possui quatro atributos.");
        System.out.println("Em cada instância, o construtor consome dois argumentos.");
    }
    
}
