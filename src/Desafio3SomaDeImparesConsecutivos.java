import java.io.IOException;
import java.util.Scanner;

public class Desafio3SomaDeImparesConsecutivos {
    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int menor;
        int maior;
        int soma = 0;

        menor = (a < b) ? a : b;
        maior = (a > b) ? a : b;

        for (int i = menor + 1; i < maior; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
        System.out.println(soma);
    }
}
