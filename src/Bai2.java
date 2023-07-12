public class Bai2 {
    public static void main(String[] args) {
        // Kiểm tra xem đã truyền đủ tham số tên và tuổi vào hay chưa
        if (args.length == 2) {
            String name = args[0]; // Lấy tên từ tham số đầu tiên
            int age = Integer.parseInt(args[1]); // Lấy tuổi từ tham số thứ hai và chuyển đổi sang kiểu int
            System.out.println("Tôi là " + name + ", tôi " + age + " tuổi!");
        } else {
            System.out.println("Vui lòng nhập tên và tuổi của bạn khi chạy chương trình!");
        }
    }
}
