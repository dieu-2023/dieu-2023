public class SumArray {
    public static void main(String[] args) {
        // Khởi tạo mảng với các số nguyên
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Gọi hàm tính tổng và in kết quả
        int sum = calculateSum(numbers);
        System.out.println("Tổng các số trong mảng là: " + sum);
    }

    // Hàm tính tổng các số trong mảng
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
