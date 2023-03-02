import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner pegaDados = new Scanner(System.in);
        String palavra = pegaDados.nextLine();
        System.out.println("Digite uma palavra: ");
        System.out.println(reverterString(palavra));
    }
    static String reverterString(String palavra) {
        String convertida = "";
        for (int i = palavra.length() - 1;  0 <= i; i--) {
            convertida += palavra.charAt(i);
        }
        return convertida;
    }
}
