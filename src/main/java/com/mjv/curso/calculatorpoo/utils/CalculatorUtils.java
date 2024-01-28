package com.mjv.curso.calculatorpoo.utils;

import com.mjv.curso.calculatorpoo.model.User;
import com.mjv.curso.calculatorpoo.model.UserList;
import com.mjv.curso.calculatorpoo.service.CalculatorService;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculatorUtils {
    Scanner scan = new Scanner(System.in);
    UserList newUser = new UserList();
    User regUser;
    CalculatorService calcService = new CalculatorService();


    public CalculatorUtils (){

    }

    public void initCalc(){
        System.out.println("#### Calculadora iniciada #####");
        System.out.println("#### Cadastrando usuário #####");
        System.out.println("Digite seu nome:");
        String nameUser = scan.next();
        System.out.println("Digite dua idade:");
        int ageUser = scan.nextInt();
        System.out.println("Digite sua profissão:");
        String profUser = scan.next();
        System.out.println("Digite seu cpf:");
        String cpfUser = scan.next();

        newUser.regUser(nameUser,ageUser,profUser,cpfUser);
        menu();


    }

    private void menu(){
        int opMenu;
        System.out.println("#### Menu calculadora #####");
        System.out.println("Digite o número da operação desejada");
        System.out.println("01 - Somar");
        System.out.println("02 - Subtrair");
        System.out.println("03 - Dividir");
        System.out.println("04 - Multiplicar");
        System.out.println("05 - Sair");
        opMenu = scan.nextInt();

        switch (opMenu){
            case 1:
                System.out.printf("O resultado da soma é: %.2f \n", calcService.add());
                menu();
                break;
            case 2:
                System.out.printf("O resultado da subtração é: %.2f \n", calcService.subtract());
                menu();
                break;
            case 3:
                System.out.printf("O resultado da divisão é: %.2f \n", calcService.divide());
                menu();
                break;
            case 4:
                System.out.printf("O resultado da multiplicação é: %.2f \n", calcService.multiply());
                menu();
                break;
            case 5:
                System.out.println("Calculadora finalizada.");
                break;
            default:
                System.out.println("Opção inválida.");
                menu();
                break;
        }


    }




}
