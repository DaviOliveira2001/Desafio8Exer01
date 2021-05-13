/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio8exer01;

/**
 *
 * @author odavi
 */
public class Desafio8Exer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int chico, ze, altC, anos;
        chico = 150;
        ze = 110;
        anos = 0;
        while(chico >= ze){
            chico = chico + 2;
            ze = ze + 3;
            anos++;
        }
        System.out.println("Zé levou "+anos+" anos para ser maior que Chico.");
        System.out.println("Chico terminou em "+chico);
        System.out.println("Zé terminou em "+ze);

    }
    
}
