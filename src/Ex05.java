import java.util.Scanner;

// Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possue2 raízes).

public class Ex05 {
    public static void main(String[] args) {
        double a,b,c;
        double x1,x2;
        double bhaskara = 0;
        
        System.out.println("Digite coeficiente A: ");

        Scanner coeA = new Scanner(System.in);
        a = coeA.nextDouble();

        System.out.println("Digite o coeficiente B: ");

        Scanner coeB = new Scanner(System.in);
        b = coeB.nextDouble();

        System.out.println("Digite o coeficiente C: ");

        Scanner coeC = new Scanner(System.in);
        c = coeC.nextDouble();
        bhaskara = Math.pow(bhaskara, 2) - 4*a*c;

        x1 = ((-b + Math.sqrt(bhaskara))/(2*a));
        x2 = ((-b - Math.sqrt(bhaskara))/(2*a));
        coeC.close();
        coeB.close();
        coeA.close();
        
        System.out.println("X1 = " + x1 + "\nX2= " + x2);
        

    
    }
}
