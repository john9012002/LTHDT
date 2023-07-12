public class Bai1{
    public static void main(String[] args) {
        // Kiểm tra xem đã truyền tham số tên vào hay chưa
        if (args.length > 0) {
            String name = args[0]; // Lấy tên từ tham số đầu tiên
            System.out.println("Hello " + name + "!");
        } else {
            System.out.println("Vui lòng nhập tên của bạn khi chạy chương trình!");
        }
    }
}
