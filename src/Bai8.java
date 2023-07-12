import java.util.Scanner;

public class Bai8 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ho ten khach hang: ");
        String fullName = scanner.nextLine();

        System.out.print("Nhap so luong san pham da mua: ");
        int quantity = scanner.nextInt();

        int price = 2035; // Giá của mỗi sản phẩm
        int giftQuantity = quantity / 5; // Số phần quà được nhận
        int discountQuantity = quantity % 5; // Số sản phẩm được giảm giá
        float discountRate = 0.02f; // Tỷ lệ giảm giá 2%

        float totalPayment = quantity * price - discountQuantity * price * discountRate; // Tổng tiền phải trả

        System.out.println("Khach hang: " + fullName);
        System.out.println("So luong san pham da mua: " + quantity);
        System.out.println("So phan qua duoc nhan: " + giftQuantity);
        System.out.println("So san pham duoc giam gia: " + discountQuantity);
        System.out.println("Tong tien phai tra: " + totalPayment);
    }
}
