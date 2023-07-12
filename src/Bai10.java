import java.util.Scanner;

public class Bai10 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ngay: ");
        int day = scanner.nextInt();

        System.out.print("Nhap thang: ");
        int month = scanner.nextInt();

        System.out.print("Nhap nam: ");
        int year = scanner.nextInt();

        if (month < 3) {
            month += 12;
            year--;
        }

        int dayOfWeek = (day + 2 * month + 3 * (month + 1) / 5 + year + year / 4) % 7;

        switch (dayOfWeek) {
            case 0:
                System.out.println("Ngay thu hai");
                break;
            case 1:
                System.out.println("Ngay thu ba");
                break;
            case 2:
                System.out.println("Ngay thu tu");
                break;
            case 3:
                System.out.println("Ngay thu nam");
                break;
            case 4:
                System.out.println("Ngay thu sau");
                break;
            case 5:
                System.out.println("Ngay thu bay");
                break;
            case 6:
                System.out.println("Ngay chu nhat");
                break;
        }
    }
}
