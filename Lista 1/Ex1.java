package felipe;

import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.print("Digite um caractere: ");
    String ch = ler.nextLine();

    System.out.print("Digite um número inteiro: ");
    int numInt = ler.nextInt();

    System.out.print("Digite um número float: ");
    float numFloat = ler.nextFloat();

    System.out.print("Digite um número double: ");
    double numDouble = ler.nextDouble();

    System.out.println(ch);
    System.out.println(numInt);
    System.out.println(numFloat);
    System.out.println(numDouble);
  }
}
