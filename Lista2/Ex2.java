import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o peso (em kg): ");
        double peso = ler.nextDouble();

        System.out.print("Digite a altura (em metros): ");
        double altura = ler.nextDouble();

        double imc = calcularIMC(peso, altura);

        System.out.println(imc);

        String classificacao = classificarIMC(imc);
        System.out.println(classificacao);

        ler.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.9) {
            return "Obesidade grau 1";
        } else if (imc >= 35 && imc <= 39.9) {
            return "Obesidade grau 2";
        } else {
            return "Obesidade grau 3";
        }
    }
}

