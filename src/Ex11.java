import java.util.Scanner;

// Receba o raio de uma circunferĂȘncia. Calcule e mostre o comprimento da circuferĂȘncia

public class Ex11 {
    public static void main(String[] args) {
        double raio, comprimento;

        System.out.println("Escreva o raio da circunferĂȘncia: "); 
        
        Scanner flash = new Scanner(System.in);
        raio = flash.nextDouble();

        comprimento = 2*3.14*raio;

        System.out.println("O comprimento corresponde a: " + comprimento);

        flash.close();

        
    }
}
