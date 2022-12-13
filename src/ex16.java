import java.util.Scanner;

//16.	Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.

public class ex16 {
    public static void main(String[] args) {
        double valorHora, salLiquido, salBruto,desconto;
        int horasTrabalhadas,descendentes;

        System.out.println("Escreva as horas trabalhadas: ");
        Scanner horas = new Scanner(System.in);
        horasTrabalhadas = horas.nextInt();


        System.out.println("Digite o valor da horas: ");
        Scanner valoresHora = new Scanner(System.in);
        valorHora = valoresHora.nextDouble();

        System.out.println("Digite o valor do desconto: ");
        Scanner valorDesconto = new Scanner(System.in);
        desconto = valorDesconto.nextDouble();

        System.out.println("Digite quantos descendentes o senhor possuí: ");
        Scanner descendencia = new Scanner(System.in);
        descendentes = descendencia.nextInt();


        salBruto = valorHora*horasTrabalhadas;
        salLiquido = (salBruto - (desconto/100) + (descendentes*100));
        
        System.out.println("O salário Bruto é de: " + salBruto);
        System.out.println("O salario liquido será de: " + salLiquido);

        descendencia.close();
        valorDesconto.close();
        valoresHora.close();
        horas.close();

    }
}
