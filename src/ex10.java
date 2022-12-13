import java.util.Scanner;

// Receba dois numeros reais. Calcule e mostre a difereça desses valores.

public class ex10 {
 public static void main(String[] args) {
     double a,b, diferenca;
    
     System.out.println("Digite o primeiro numero: ");
     Scanner v1 = new Scanner(System.in);
     a = v1.nextDouble();

    System.out.println("Digite o segundo numero: ");
    Scanner v2 = new Scanner(System.in);
    b = v2.nextDouble();

    diferenca = a-b;
    System.out.println("A diferença é: " + diferenca);

    v1.close();
    v2.close();



 }
    

}
