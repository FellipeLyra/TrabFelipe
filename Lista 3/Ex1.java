public class Ex1 {
    public static void main (String[] args){
        int a = 10;
        int b = 20;

        trocarValores (a,b);
    }

    public static void trocarValores(int x, int y){
        int temp = x;
        x = y;
        y = temp;

        System.out.println("Valores trocados: a = " + x + ", b = "+ y);
    }
}
