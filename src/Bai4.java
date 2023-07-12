import java.time.LocalDate;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Nhap ten cua ban: ");
        String name=scanner.nextLine();

        System.out.print("Nhap nam sinh cua ban: ");
        int birthYear = scanner.nextInt();

        // Lấy năm hiện tại
        int currentYear = LocalDate.now().getYear();

        // Tính tuổi hiện tại
        int age = currentYear - birthYear;

        // Tính tuổi vào năm 2025
        int ageIn2025 = 2025 - birthYear;
        
        System.out.println("Ten: "+name);
        System.out.println("Nam sinh: " + birthYear);
        System.out.println("Tuoi hien tai: " + age);
        System.out.println("Tuoi vao nam 2025: " + ageIn2025);
    }
}
