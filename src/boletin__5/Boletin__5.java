/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin__5;

import java.util.Scanner;

/**
 *
 * @author slorenzorodriguez
 */
public class Boletin__5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner ler = new Scanner(System.in);
        Conta contaOrigen = new Conta("Luis Pedro", "1", 1000);
        Conta contaDestino = new Conta();
        contaDestino.setNome("Alberto Moreno");
        contaDestino.setNumConta("2");
        contaDestino.setSaldo(2000);
        contaOrigen.visualizar();
        contaDestino.visualizar();
        contaOrigen.ingreso(3000);
        contaDestino.reintegro(500);
        contaOrigen.visualizar();
        contaDestino.visualizar();

        System.out.println("\nIndique la cantidad a transferir: ");
        double cant = ler.nextDouble();
        while (cant <= 0) {
            System.out.println("ERROR DE TRANSFERENCIA");
            System.out.println("\nIndique la cantidad a transferir: ");
            cant = ler.nextDouble();
        }

        if (contaDestino.transferencia(contaOrigen, cant) == true) {
            System.out.println("\nTransferencia realizada");
        } else {
            System.out.println("ERROR DE TRANSFERENCIA");
        }
        contaOrigen.visualizar();
        contaDestino.visualizar();

        System.out.println("\nIndique la cantidad a transferir: ");
        cant = ler.nextDouble();
        if (contaDestino.transferencia(contaOrigen, cant) == true) {
            System.out.println("\nTransferencia realizada");
        } else {
            System.out.println("ERROR DE TRANSFERENCIA");
        }
        contaOrigen.visualizar();
        contaDestino.visualizar();

    }
    }
    

