import java.util.Scanner;

public class bai07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("một số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println(" nhập một số nguyên dương.");
        } else {
            long giaiThua = tinhGiaiThua(n);
            System.out.println("Giai thừa của " + n + " là: " + giaiThua);
        }

        scanner.close();
    }

    public static long tinhGiaiThua(int n) {
        long giaThua = 1;
        for (int i = 1; i <= n; i++) {
            giaThua *= i;
        }
        return giaThua;
    }
}

