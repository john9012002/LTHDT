import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số N: ");
        int N = scanner.nextInt();

        int S1 = 0;
        int S2 = 1;
        double S3 = 0;
        double S4 = 0;

        for (int i = 1; i <= N; i++) {
            S1 += i;
            S2 *= i;
            S3 += 1.0 / i;
            S4 += 1.0 / (i * (i + 1));
        }

        System.out.println("Tổng S1: " + S1);
        System.out.println("Tổng S2: " + S2);
        System.out.println("Tổng S3: " + S3);
        System.out.println("Tổng S4: " + S4);
    }
}
