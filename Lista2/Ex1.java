import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha a opção de conversão:");
        System.out.println("1. Real para Dólar (1 / 3,86)");
        System.out.println("2. Real para Euro (1 / 4,34)");
        System.out.println("3. Real para Libra (1 / 5,04)");
        System.out.println("4. Real para Peso Argentino (1 / 0,09)");

        int opcao = ler.nextInt();

        System.out.print("Digite o valor em reais: ");
        double valorEmReais = ler.nextDouble();

        double taxaDeConversao = 0.0;

        switch (opcao) {
            case 1:
                taxaDeConversao = 3.86;
                break;
            case 2:
                taxaDeConversao = 4.34;
                break;
            case 3:
                taxaDeConversao = 5.04;
                break;
            case 4:
                taxaDeConversao = 0.09;
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        if (taxaDeConversao > 0) {
            double valorConvertido = valorEmReais / taxaDeConversao;
            System.out.printf( obterNomeMoeda(opcao), valorConvertido);
        }

        ler.close();
    }

    public static String obterNomeMoeda(int opcao) {
        switch (opcao) {
            case 1:
                return "Dólar";
            case 2:
                return "Euro";
            case 3:
                return "Libra";
            case 4:
                return "Peso Argentino";
            default:
                return "";
        }
    }
}
