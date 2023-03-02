import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner pegaDados = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int valor = pegaDados.nextInt();
        System.out.println(calcFibonacci(valor));
    }
    public static int calcFibonacci(int valor) {
        if (valor == 1) {
            return 0;
        }

        if (valor == 2) {
            return 1;
        }
        int i, fb = 0, fb1 = 0, fb2 = 1;
        for (i = 3; i <= valor; i++) {
            fb = fb1 + fb2;
            fb1 = fb2;
            fb2 = fb;
        }
        if (valor == (fb)){
            System.out.println("Não, faz parte");
        }else {
            System.out.println("Sim, faz parte!");
        }
        System.out.println("número digitado: ");

        return valor;
    }
}

