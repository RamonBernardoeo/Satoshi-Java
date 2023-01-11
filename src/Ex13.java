import java.util.Scanner;

// Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia

public class Ex13{
public static void main(String[] args) {
    double quantidadeAlimento, quantidadeFinal;
    int dias;

    System.out.println("Escreva a quantidade de alimentos em quilos ");
    Scanner alimento = new Scanner(System.in);
    quantidadeAlimento = alimento.nextDouble();

    System.out.println("Digite a quantidade de dias que irá comer: ");
    Scanner comer = new Scanner(System.in);
    dias = comer.nextInt();


    quantidadeFinal = quantidadeAlimento - (dias * 0.50);

    System.out.println(quantidadeFinal);
    
    comer.close();
    alimento.close();
}
}
