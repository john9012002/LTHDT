import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        System.out.println("-----Menu-----");
        System.out.println("1. Tính tuổi");
        System.out.println("2. Gửi lời chúc sinh nhật");
        System.out.println("3. Tính điểm trung bình");
        System.out.println("4. Tính tiền sản phẩm mua");
        System.out.println("5. Kiểm tra tính chất của tam giác");
        System.out.println("6. Xác định ngày trong tuần");
        System.out.println("7. Chuyển đổi năm âm lịch");
        System.out.println("8. Tính các tổng");
        System.out.println("9. Tìm số tự nhiên n");
        System.out.print("Chọn một số từ 1 đến 9: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                calculateAge();
                break;
            case 2:
                sendBirthdayWishes();
                break;
            case 3:
                calculateGPA();
                break;
            case 4:
                calculateTotalPrice();
                break;
            case 5:
                checkTriangle();
                break;
            case 6:
                findDayOfWeek();
                break;
            case 7:
                convertToLunar();
                break;
            case 8:
                calculateSums();
                break;
            case 9:
                findN();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                break;
        }
    }

    public static void calculateAge() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên của người: ");
        String name = scanner.nextLine();
        System.out.print("Nhập năm sinh của người: ");
        int birthYear = scanner.nextInt();

        int currentYear = 2023;
        int age = currentYear - birthYear;
        int age2020 = 2020 - birthYear;

        System.out.println("Tên: " + name);
        System.out.println("Năm sinh: " + birthYear);
        System.out.println("Tuổi hiện tại: " + age);
        System.out.println("Tuổi năm 2020: " + age2020);
    }

    public static void sendBirthdayWishes() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên người thứ nhất: ");
        String name1 = scanner.nextLine();
        System.out.print("Nhập tên người thứ hai: ");
        String name2 = scanner.nextLine();

        System.out.println("Thân gửi " + name1 + "!");
        System.out.println("Nhân dịp sinh nhật của " + name1 + ",");
        System.out.println("Cho phép " + name2 + " gửi đến " + name1 + " những lời chúc tốt đẹp nhất về sức khoẻ, hạnh phúc và thành công trong mọi lĩnh vực.");
        System.out.println("Gửi lời thăm sức khoẻ hai bác của " + name1 + ".");
        System.out.println("Bạn của " + name1 + ": " + name2);
    }

    public static void calculateGPA() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ tên sinh viên: ");
        String fullName = scanner.nextLine();
        System.out.print("Nhập điểm môn học 1: ");
        float grade1 = scanner.nextFloat();
        System.out.print("Nhập điểm môn học 2: ");
        float grade2 = scanner.nextFloat();
        System.out.print("Nhập điểm môn học 3: ");
        float grade3 = scanner.nextFloat();

        float average = (grade1 + grade2 + grade3) / 3;

        System.out.println("Họ tên: " + fullName);
        System.out.println("Điểm trung bình: " + Math.round(average * 100) / 100.0);
    }

    public static void calculateTotalPrice() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ tên khách hàng: ");
        String customerName = scanner.nextLine();
        System.out.print("Nhập số lượng sản phẩm đã mua: ");
        int quantity = scanner.nextInt();
        int price = 2035;

        int quantityOfGifts = quantity / 5;
        int discountedQuantity = quantity % 5;
        float totalPayment = quantity * price - discountedQuantity * (price * 0.02f);

        System.out.println("Khách hàng: " + customerName);
        System.out.println("Số lượng sản phẩm đã mua: " + quantity);
        System.out.println("Số phần quà được nhận: " + quantityOfGifts);
        System.out.println("Số sản phẩm được giảm giá: " + discountedQuantity);
        System.out.println("Tổng tiền phải trả: " + totalPayment);
    }

    public static void checkTriangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập độ dài cạnh a: ");
        int sideA = scanner.nextInt();
        System.out.print("Nhập độ dài cạnh b: ");
        int sideB = scanner.nextInt();
        System.out.print("Nhập độ dài cạnh c: ");
        int sideC = scanner.nextInt();

        if (sideA == sideB && sideB == sideC) {
            System.out.println("Đây là tam giác đều.");
        } else if (sideA == sideB && sideC * sideC == sideA * sideA + sideB * sideB
                || sideA == sideC && sideB * sideB == sideA * sideA + sideC * sideC
                || sideB == sideC && sideA * sideA == sideB * sideB + sideC * sideC) {
            System.out.println("Đây là tam giác vuông cân.");
        } else if (sideA * sideA == sideB * sideB + sideC * sideC
                || sideB * sideB == sideA * sideA + sideC * sideC
                || sideC * sideC == sideA * sideA + sideB * sideB) {
            System.out.println("Đây là tam giác vuông.");
        } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            System.out.println("Đây là tam giác cân.");
        } else {
            System.out.println("Đây là tam giác thường.");
        }
    }

    public static void findDayOfWeek() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ngày: ");
        int day = scanner.nextInt();
        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();
        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();

        if (month < 3) {
            month = month + 12;
            year = year - 1;
        }

        int dayOfWeek = (day + 2 * month + 3 * (month + 1) / 5 + year + year / 4) % 7;

        switch (dayOfWeek) {
            case 0:
                System.out.println("Chủ nhật");
                break;
            case 1:
                System.out.println("Thứ hai");
                break;
            case 2:
                System.out.println("Thứ ba");
                break;
            case 3:
                System.out.println("Thứ tư");
                break;
            case 4:
                System.out.println("Thứ năm");
                break;
            case 5:
                System.out.println("Thứ sáu");
                break;
            case 6:
                System.out.println("Thứ bảy");
                break;
            default:
                System.out.println("Lỗi tính toán.");
                break;
        }
    }

    public static void convertToLunar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập năm dương lịch sau năm 1900: ");
        int lunarYear = scanner.nextInt();

        String[] can = {"Giáp", "Ất", "Bính", "Đinh", "Mậu", "Kỷ", "Canh", "Tân", "Nhâm", "Quý"};
        String[] chi = {"Tý", "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất", "Hợi"};

        int canIndex = (lunarYear - 1900) % 10;
        int chiIndex = (lunarYear - 1900) % 12;

        System.out.println("Năm âm lịch: " + can[canIndex] + " " + chi[chiIndex]);
    }

    public static void calculateSums() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();

        int sum1 = 0;
        int product = 1;
        float sum2 = 0.0f;
        float sum3 = 0.0f;

        int i = 1;
        while (true) {
            sum1 += i;
            product *= i;

            if (i <= n) {
                sum3 += (float) 1 / i;
            }

            if (i < n) {
                sum2 += (float) 1 / (i * (i + 1));
            } else {
                sum2 += (float) 1 / (i * (i + 1));
                break;
            }

            i++;
        }

        System.out.println("S1 = " + sum1);
        System.out.println("S2 = " + product);
        System.out.println("S3 = " + Math.round(sum2 * 100) / 100.0);
        System.out.println("S4 = " + Math.round(sum3 * 100) / 100.0);
    }

    public static void findN() {
        int sum = 0;
        int i = 0;

        while (true) {
            i++;
            sum += i;

            if (sum >= 200) {
                break;
            }
        }

        System.out.println("Số tự nhiên n nhỏ nhất sao cho (1 + 2 + ... + n) >= 200: " + i);
    }
}