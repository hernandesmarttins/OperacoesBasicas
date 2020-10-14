package com.company.aplication;

public class CalculadoraSimples{
    private double num1, num2;
    private char op;


    public CalculadoraSimples(double num1, double num2,char op){
        this.num1 = num1;
        this.num2 = num2;
        this.op =  op;
    }


    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getOp() {
        return op;
    }

    public void setOp(char op) {
        this.op = op;
    }

    /*
    switch(op){
        case "+":
            System.out.println("%.2f + %.2f = %2.f " + getNum1() + getNum2());
            break;
        case "-":
            System.out.println("subtracao");
            resultado = num1 - num2;
            break;

        case 3:
            System.out.println("multiplicacao");
            resultado = num1 * num2;
            break;

        case 4:
            System.out.println("divisao");
            resultado = num1 / num2;
        default:
            System.out.println("operacao invalida");
            break;
    }
    */

}
