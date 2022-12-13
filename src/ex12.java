import java.util.Scanner;

//Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade atual e quantos anos terá daqui a 17 anos

public class ex12 {

    public static void main(String[] args) {
        int anoAtual, anoNasc, idadeAtual,idadeFutura;

        System.out.println("Digite o ano atual: ");
        Scanner atual = new Scanner(System.in);
        anoAtual = atual.nextInt();

        System.out.println("Digite o ano de nascimento: ");
        Scanner nascimento = new Scanner(System.in);
        anoNasc = nascimento.nextInt();

        idadeAtual = anoAtual - anoNasc;
        idadeFutura = idadeAtual + 17;
        System.out.println("A sua idade atual é: " + idadeAtual + "\n Sua idade depois de 17 anos será: " + idadeFutura);

        nascimento.close();
        atual.close();

    }
    
}
