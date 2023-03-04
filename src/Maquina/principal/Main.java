package Maquina.principal;

import Maquina.refrigerante.Refrigerante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int escolha;
        int cod;

        Refrigerante coca = new Refrigerante("Coca Cola", 4.00, 350, 1);
        Refrigerante fanta = new Refrigerante("Fanta Uva", 3.00, 350, 2);
        Refrigerante guarana = new Refrigerante("Guaraná", 3.50, 350, 3);
        Refrigerante gatorade = new Refrigerante("Gatorade", 7.00, 500, 4);

        System.out.println("Bem Vindo");
        System.out.println("[1] - Mostrar Refris");
        escolha = scan.nextInt();

        if(escolha == 1) {
            coca.mostrarProdutos();
            System.out.println();
            fanta.mostrarProdutos();
            System.out.println();
            guarana.mostrarProdutos();
            System.out.println();
            gatorade.mostrarProdutos();
            System.out.println();
        }

        System.out.println("Qual refrigerante deseja comprar. Informe o código: ");
        cod = scan.nextInt();

        if (cod == 1 ) {
            coca.compra();
        }
        if (cod == 2)
        {
            fanta.compra();
        }
        if (cod == 3)
        {
            guarana.compra();
        }
        if (cod == 4)
        {
            gatorade.compra();
        } else if (cod != 1 && cod != 2 && cod != 3 && cod != 4) {
            System.out.print("O código informado não existe!");
        }

        System.out.println();
        System.out.println("Agradeço pela preferência =)");






    }
}
