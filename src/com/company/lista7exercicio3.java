package com.company;

import java.util.Scanner;

public class lista7exercicio3 {


    static class Questao5{

        private static String vetificaParImpar(int numero) {
            if (numero % 2 > 0) {
                return "Impar";
            } else {
                return "Par";
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Entrada de dados.
        System.out.println("Imforma um número");
        int numero = sc.nextInt();
        //Chamada da função.
        String resultado = vetificaParImpar(numero);
        // Saída de dados
        System.out.println(" O número " + numero + " é" + resultado);
    }
  }


    }

