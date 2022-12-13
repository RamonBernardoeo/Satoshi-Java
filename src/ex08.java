import java.util.Scanner;

// Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.

public class ex08 {
    public static void main(String[] args) {
        double rendimento,deposito;
        int meses;

        System.out.println("De quanto será o depósito: ");
        Scanner dep = new Scanner(System.in);
        deposito = dep.nextDouble();
        
        System.out.println("Por quantos meses: ");
        Scanner mes = new Scanner(System.in);
        meses = mes.nextInt();

        rendimento = (meses * 1.03) + deposito;
        System.out.println("O valor final após o valor aplicado será de: " + rendimento);
        
        dep.close();
        mes.close();




    }
    
}
