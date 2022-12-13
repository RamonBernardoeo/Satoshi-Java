import java.util.Scanner;

// Receba o raio de uma circunferência. Calcule e mostre o comprimento da circuferência

public class ex11 {
    public static void main(String[] args) {
        double raio, comprimento;

        System.out.println("Escreva o raio da circunferência: "); 
        
        Scanner flash = new Scanner(System.in);
        raio = flash.nextDouble();

        comprimento = 2*3.14*raio;

        System.out.println("O comprimento corresponde a: " + comprimento);

        flash.close();

        
    }
}
