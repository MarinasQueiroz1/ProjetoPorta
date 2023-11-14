/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ifce.projetoporta;

import modelo.Porta;

/**
 *
 * @author Usuario
 */
public class ProjetoPorta {

    public static void main(String[] args) {
        Porta porta = new Porta();

        porta.abrir();
        System.out.println("Está aberta? " + porta.estaAberta());

        porta.fechar();
        System.out.println("Está aberta? " + porta.estaAberta());

        porta.pintar("azul");
        System.out.println("Cor da porta: " + porta.cor);

        porta.altura = 2.5;
        porta.comprimento = 1.0;
        System.out.println("Dimensões da porta - Altura: " + porta.altura + " Comprimento: " + porta.comprimento);
    }
}

