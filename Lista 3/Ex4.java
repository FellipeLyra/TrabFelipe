public class Ex4 {
    public static void main(String[] args){
        if (args.length != 3){
            System.out.println("Por favor, forneça dia mês e ano como argumentos");
            return;
        }
        int dia = Integer.parseInt(args[0]);
        int mes = Integer.parseInt(args[1]);
        int ano = Integer.parseInt(args[2]);

        if (verificarData(dia, mes, ano)){
            System.out.printf("Data válida: %02d/%02d/%04d\n" , dia, mes, ano);
        } else{
            System.out.println("Data inválida!");
        }
    }

    public static boolean verificarData(int dia, int mes, int ano){
        if (ano < 1 || mes < 1 || mes > 12 || dia < 1){
            return false;
        }

        int[] diaNoMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)){
            diaNoMes[2] = 29;
        }

        return dia <= diaNoMes[mes];
    }
}
