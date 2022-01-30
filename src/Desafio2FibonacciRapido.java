import java.util.Scanner;

public class Desafio2FibonacciRapido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double f = (Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n))
                                                          / Math.sqrt(5);
        System.out.printf("%.1f%n", f);
    }
}
