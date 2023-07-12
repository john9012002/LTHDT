import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap do dai canh a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap do dai canh b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhap do dai canh c: ");
        double c = scanner.nextDouble();

        if (a == b && b == c) {
            System.out.println("Day la tam giac deu");
        } else if (a == b && c * c == a * a + b * b) {
            System.out.println("Day la tam giac vuong can tai C");
        } else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
            System.out.println("Day la tam giac vuong");
        } else if (a == b || b == c || c == a) {
            System.out.println("Day la tam giac can");
        } else {
            System.out.println("Day la tam giac thuong");
        }
    }
}
