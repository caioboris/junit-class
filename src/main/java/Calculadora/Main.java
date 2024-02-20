package Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = sc.nextInt();


        Calculadora calculadora = new Calculadora(valor1, valor2);


        System.out.println("Soma: " + calculadora.soma());
        System.out.println("Subtracao: " + calculadora.subtracao());
        System.out.println("Multiplicacao: " + calculadora.multiplicacao());
        System.out.println("Divisao: " + calculadora.divisao());
    }
}