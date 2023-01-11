import java.util.Scanner;

// Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados

public class Ex09 {
    public static void main(String[] args) {
        int a,b, resultado;

        System.out.println("Escreca o primeiro valor: ");
        Scanner valor1 = new Scanner(System.in);
        a = valor1.nextInt();

        System.out.println("Escreva o segundo valor: ");
        Scanner valor2 = new Scanner(System.in);
        b = valor2.nextInt();

        resultado = (a*a) + (b*b);

        System.out.println("A soma dos quadrados é: " + resultado);

        valor1.close();
        valor2.close();


    }
}
