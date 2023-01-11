import java.util.Scanner;

// Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.

public class Ex07 {
    public static void main(String[] args) {
        double altura,largura,comprimento;
        double volume;

        System.out.println("Digite a altura: ");
        Scanner alt = new Scanner(System.in);
        altura = alt.nextDouble();

        System.out.println("Digite o comprimento: ");
        Scanner com = new Scanner(System.in);
        comprimento = com.nextDouble();

        System.out.println("Digite a largura: ");
        Scanner larg = new Scanner(System.in);
        largura = larg.nextDouble();

        
        volume = comprimento * altura * largura;

        System.out.println("Volume = " + volume);

        alt.close();
        com.close();
        larg.close();
    }
}
