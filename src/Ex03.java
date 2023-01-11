import java.util.Scanner;

// Receba a base e a altura de um triângulo. Calcule e mostre a sua área

public class Ex03{
    public static void main(String[] args) {
        double area, base, altura;
        System.out.println("Digite a altura do triangulo: ");
        Scanner alt = new Scanner(System.in);
        altura = alt.nextDouble();
        System.out.println("Digite a base do triangulo: ");
        Scanner bas = new Scanner(System.in);
        base = bas.nextDouble();
        area = (altura*base)/2;
        System.out.println("A area do triangulo é: " + area);
        alt.close();
        bas.close();

        
    }
}
