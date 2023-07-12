import java.time.LocalDate;
import java.time.Period;

public class Bai5 {
     public static void main(String[] args) {
        String name = "Vinh"; 
        int birthYear = 2002; 

        // Lấy năm hiện tại
        int currentYear = LocalDate.now().getYear();

        // Tính tuổi hiện tại
        int age = currentYear - birthYear;

        // Tính tuổi vào năm 2020
        int ageIn2020 = 2020 - birthYear;

        System.out.println("Ten: " + name);
        System.out.println("Nam sinh: " + birthYear);
        System.out.println("Tuoi hien tai: " + age);
        System.out.println("Tuoi vao nam 2020: " + ageIn2020);
    }
}
