import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = ler.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = ler.nextInt();

        if (numero2 != 0) {
            int restoDivisao = numero1 % numero2;
            System.out.println(restoDivisao);
        } else {
            System.out.println("Não é possível dividir por zero. Por favor, insira um segundo número diferente de zero.");
        }

        ler.close(); 
}
}
