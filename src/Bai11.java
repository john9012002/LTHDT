import java.util.Scanner;

public class Bai11 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập năm dương lịch (sau năm 1900): ");
        int year = scanner.nextInt();

        String[] can = {"Canh", "Tân", "Nhâm", "Quý", "Giáp", "Ất", "Bính", "Đinh", "Mậu", "Kỷ"};
        String[] chi = {"Tý", "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất", "Hợi"};

        int canIndex = (year - 1900) % 10;
        int chiIndex = (year - 1900) % 12;

        String lunarYear = can[canIndex] + " " + chi[chiIndex];

        System.out.println("Năm âm lịch tương ứng: " + lunarYear);
    }
}
