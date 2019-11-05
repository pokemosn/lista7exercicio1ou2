package com.company;

public class lista7exercicio4 {

    static class Questao6{

        public static int[] preencherVetor(int[] vetor){
            for(int i=0; i<vetor.length; i++){
                vetor[i] = i+i;
            }
            return vetor;
        }
        public static void main(String[] args) {
            //criação de vetor.
        int[]vetor = new int[30];
        //chamada da função qu preenche o vetor.
        int[] resultado =  preencherVetor(vetor);
        //Saida de dados.
        for(int numero:resultado){
            System.out.println(numero);
        }
        }
    }
}
