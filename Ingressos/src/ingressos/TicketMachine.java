/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingressos;

/**
 *
 * @author Adilson
 */
public class TicketMachine {

    private Double preco;
    private Double balanco;
    private Double total;

    public TicketMachine(Double preco) {
        this.preco = preco;
        this.balanco = 0.0;
        this.total = 0.0;
    }

    public void insertMoney(Double quantia) {
        if (quantia > 0) {
            this.balanco += quantia;
            System.out.println("Foi inserido " + quantia + " reais.");
        }
        else {
            System.out.println("Insira um valor maior que zero.\n");
        }
    }

    
    public void printTicket() {
        if (this.balanco >= this.preco) {
            System.out.println("Ingresso impresso!");
            
            if (this.giveChange() > 0) {
                System.out.println("Retire seu troco no valor de " + this.giveChange() + " reais.");
            }
            
            this.sangria();
        } else {
            Double falta = this.preco - this.balanco;
            prompt();
            System.out.println("Ainda faltam " + falta + " reais.");
        }
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }
    
    public void prompt() {
        System.out.println("Por favor insira a quantidade correta de dinheiro");
    }

    public void showPrice() {
        System.out.println("O preço do bilhete é " + this.preco + " reais.");
    }

    public void empty() {
        this.total = 0.0;
        System.out.println("Máquina zerada!");
    }

    public Double giveChange(){
        if (this.balanco > this.preco){
            return (this.balanco - this.preco);
        }
        return 0.0;
    }
    
    public void refundBalance(){
        if (this.balanco > 0.0) {
            System.out.println("Cliente reembolsado.");
            this.balanco = 0.0;
        }
    }

    public Double getBalanco() {
        return balanco;
    }

    public Double getTotal() {
        return total;
    }

    
    
    public void sangria() {
        this.total = this.balanco;
        this.balanco = 0.0;        
    }
    
}
