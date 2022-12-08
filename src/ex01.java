import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){
        int area;
        int lado;
        System.out.println("Digite o lado: ");
        Scanner lado1 = new Scanner(System.in);
        lado = lado1.nextInt();
        area = lado*lado;
        System.out.println(area);


    }
}
