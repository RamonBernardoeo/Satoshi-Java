import java.util.Scanner;

// Objetivo: Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%
public class ex02{
public static void main(String[] args) {
    double salInciail;
    double reajuste;
    double salFinal;
    System.out.println("Digite seu salário : ");
    Scanner entrada = new Scanner(System.in);
    salInciail = entrada.nextDouble();
    reajuste = salInciail * 0.15;
    salFinal = salInciail + reajuste;
    System.out.println("O salário com o reajuste equival no total: "+ salFinal);
    entrada.close();



} 

}