/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Porta {
    public boolean aberta;
    public String cor;
    public double altura;

    /**
     *
     */
    public double comprimento;

    public Porta() {
        this.aberta = false;
        this.cor = "branca";
        this.altura = 2.0;
        this.comprimento = 0.8;
    }

    public void abrir() {
        this.aberta = true;
        System.out.println("A porta foi aberta.");
    }

    public void fechar() {
        this.aberta = false;
        System.out.println("A porta foi fechada.");
    }

    public void pintar(String c) {
        this.cor = c;
        System.out.println("A porta foi pintada de " + c + ".");
    }

    public boolean estaAberta() {
        return this.aberta;
    }
}
   
