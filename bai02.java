public class bai02 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5,6,7,8,9,10}; 
        int sum = calculateSum(numbers);
        int product = calculateProduct(numbers);

        System.out.println("Tổng: " + sum);
        System.out.println("Tích: " + product);
    }

    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int calculateProduct(int[] numbers) {
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }
}
