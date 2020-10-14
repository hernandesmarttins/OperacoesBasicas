package com.company.aplication;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
      //  double operacoes = scan.nextDouble();

        System.out.print("operacao a ser realizada [ + - * / ]: ");
        char op = scan.next().charAt(0);  /*preciso fazer a chamada do op*/

        System.out.print("digite o primeiro numero: ");
        double num1 = scan.nextDouble();
        System.out.print("digite o segundo numero: ");
        double num2 = scan.nextDouble();
        System.out.print("Resultado:");


        CalculadoraSimples calc = new CalculadoraSimples(num1,num2,op);

        switch(op) {
            case '+':
                System.out.println("o resultado da soma eh : " + (num1 + num2));
                break;
            case '-':
                System.out.println("o resultado da subtração: " + (num1 - num2));
                break;
            case '*':
                System.out.println("o resultado da multiplicação: " + (num1 * num2));
                break;
            case '/':
                System.out.println("o resultado da divisao: " + (num1 / num2));
                break;
            default:
                System.out.println("a operacao esta incorreta!");
        }

       scan.close();
    }
}
