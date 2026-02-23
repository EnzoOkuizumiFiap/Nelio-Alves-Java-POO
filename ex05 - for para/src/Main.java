import java.util.Scanner;

public class Main {
    //Quando se sabe previamente a quantidade de repetições, ou o intervalo de valores
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            soma += x;
        }
        System.out.println("A soma total é " + soma + " e a quantidade de repetições é " + N);
        sc.close();
    }
}
