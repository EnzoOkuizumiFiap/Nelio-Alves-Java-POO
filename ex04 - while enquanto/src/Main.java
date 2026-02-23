import java.util.Scanner;

public class Main {
    //Não se sabe previamente a quantidade de repetições que será realizada.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int soma = 0;

        while(x != 0) {
            x = scan.nextInt();
            soma += x;
        }
        System.out.println("Soma total é " + soma);
        scan.close();
    }


}
