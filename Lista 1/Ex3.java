import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o raio da esfera: ");
        double raio = ler.nextDouble();

        double pi = 3.14;
        double volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);

        System.out.println(volume);

        ler.close(); 
    }
}
