import java.util.Scanner;

class Tempo{
        int horas;
    int minutos;
    int segundos;
}

public class Ex3 {
    public static void converterTempo(int totalSegundos, Tempo tempo){
        tempo.horas = totalSegundos / 3600;
        tempo.minutos = (totalSegundos % 3600) / 60;
        tempo.segundos = totalSegundos % 60;
    }

    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);

        int totalSegundos;
        System.out.println("Coloque o total de segundos para a conversão: ");
        totalSegundos = scanner.nextInt();

        Tempo tempo = new Tempo();
        converterTempo(totalSegundos, tempo);
        
        System.out.printf("%02d:%02d:%02d", tempo.horas, tempo.minutos, tempo.segundos);
    }
}

