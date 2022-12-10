import java.util.Scanner;
//Objetivo: Mostre a área de um quadrado
/*Neste caso eu usei a classe Scanner para input,
 para saber mais acesse a devmedia, tem um conteúdo
 muito bom
 */
public class ex01 {
    public static void main(String[] args){
        int area;
        int lado;
        System.out.println("Digite o lado: ");
        Scanner lado1 = new Scanner(System.in);
        lado = lado1.nextInt();
        area = lado*lado;
        System.out.println("A area do quadrado equivale a: " + area);
        lado1.close();
        


    }
}
