package com.company;

import java.util.Scanner;

public class Main{

    public static String calcSemana(int codigoSemana) {
        switch (codigoSemana) {
            case 1:
                return "segunda-feira";
            case 2:
                return "terça-feira";
            case 3:
                return "quarta-feira";
            case 4:
                return "quinta-feira";
            case 5:
                return "sexta-feira";
            case 6:
                return "sabado";
            case 7:
                return "domingo";

        }
        return  null;
    }
        public static void main(String[] args) {

            {
                Scanner sc = new Scanner(System.in);
                //Entrada de dados
                System.out.println("Informe o codigo da semana");
                int codigoSemana = sc.nextInt();
                //Chama o metodo para verificar o dia da semana.
                String semana = calcSemana(codigoSemana);
                //Saida de dados.
                System.out.println("O dia da semana é" + semana);
            }
        }
    }