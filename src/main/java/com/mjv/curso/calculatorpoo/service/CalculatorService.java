package com.mjv.curso.calculatorpoo.service;

import java.util.Scanner;

public class CalculatorService {


    Scanner scanCalc = new Scanner(System.in);


    public double add (){
        System.out.println("Digite o primeiro número a ser somado:");
        double num1 = scanCalc.nextDouble();
        System.out.println("Digite o segundo número a ser somado:");
        double num2 = scanCalc.nextDouble();

        return num1+num2;
    }

    public double subtract (){
        System.out.println("Digite o primeiro número a ser subtraido: ");
        double num1 = scanCalc.nextDouble();
        System.out.println("Digite o segundo número a ser subtraido: ");
        double num2 = scanCalc.nextDouble();

        return num1-num2;
    }

    public double divide () {
        double result= 0;
        System.out.println("Digite o dividendo:");
        double num1 = scanCalc.nextDouble();
        System.out.println("Digite o divisor:");
        double num2 = scanCalc.nextDouble();
        if (num1 == 0 || num2 == 0) {
            System.out.println("A divisão com 0 não é possível. Tente novamente");
            divide();
        } else {
            result = num1 / num2;
        }
        return result;
    }




    public double multiply (){
        System.out.println("Digite o primeiro número a ser multiplicado:");
        double num1 = scanCalc.nextDouble();
        System.out.println("Digite o segundo número a ser multiplicado:");
        double num2 = scanCalc.nextDouble();

        return num1*num2;
    }

}



