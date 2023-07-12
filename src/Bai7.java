import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ho ten sinh vien : ");
        String fullName = scanner.nextLine();

        System.out.print("Nhap diem mon hoc 1: ");
        float grade1 = scanner.nextFloat();

        System.out.print("Nhap diem mon hoc 2: ");
        float grade2 = scanner.nextFloat();

        System.out.print("Nhap diem mon hoc 3: ");
        float grade3 = scanner.nextFloat();

        // Tính điểm trung bình
        float average = (grade1 + grade2 + grade3) / 3;

        // Làm tròn điểm trung bình đến 2 số lẻ
        float roundedAverage = (float) Math.round(average * 100) / 100;

        System.out.println("Ho ten sinh vien : " + fullName);
        System.out.println("Diem trung binh : " + roundedAverage);
    }
}
