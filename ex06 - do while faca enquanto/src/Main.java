import java.util.Locale;
import java.util.Scanner;

public class Main {
    //usado quando não se sabe previamente a quantidade de repetições, mas é necessário que o bloco seja executado pelo menos uma vez, independentemente da condição.

    // Ou seja, o bloco de comandos executa pelo menos uma vez, pois a condição é verificada no final.
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan =  new Scanner(System.in);

        char resp;

        do {
            System.out.print("Digite a temperatura C°:");
            double C = scan.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Temperatura em Fahrenheit°: %.1f%n", F);
            System.out.print("Deseja continuar? (s/n)");
            resp = scan.next().charAt(0);
        } while (resp != 'n');

        scan.close();
    }
}
