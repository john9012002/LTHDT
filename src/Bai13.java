public class Bai13 {
    public static void main(String[] args) {
        int N = 1;
        int sum = 0;

        while (true) {
            sum += N;

            if (sum >= 200) {
                break;
            }

            N++;
        }

        System.out.println("Số tự nhiên N nhỏ nhất: " + N);
    }
}
