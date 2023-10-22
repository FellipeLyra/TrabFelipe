import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um valor em pés (ft): ");
        double valorEmPes = ler.nextDouble();

        double valorEmMetros = valorEmPes * 0.3048;

        System.out.println(valorEmMetros);

        ler.close(); 
    }
}

