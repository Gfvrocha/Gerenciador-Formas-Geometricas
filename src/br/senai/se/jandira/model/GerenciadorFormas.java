package br.senai.se.jandira.model;

import java.util.Scanner;

public class GerenciadorFormas {

    Scanner scanner = new Scanner(System.in);

    public void iniciarGerenciadorForma(){


        while (true) {
            System.out.println("Escolha uma forma geométrica: ");
            System.out.println("1. Círculo");
            System.out.println("2. Retângulo");
            System.out.println("3. Sair");
            System.out.print("Opção: ");

            int escolha = scanner.nextInt();

            if (escolha == 3) {
                System.out.println("Encerrando o programa.");
                break;
            }

            FormaGeometrica forma = null;

            if (escolha == 1) {
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                forma = new Circulo(raio);
            } else if (escolha == 2) {
                System.out.print("Digite o comprimento do retângulo: ");
                double comprimento = scanner.nextDouble();
                System.out.print("Digite a largura do retângulo: ");
                double largura = scanner.nextDouble();
                forma = new Retangulo(comprimento, largura);
            } else {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            System.out.println("Área: " + forma.calcularArea());
            System.out.println("Perímetro: " + forma.calcularPerimetro());
        }

        scanner.close();
    }


}
