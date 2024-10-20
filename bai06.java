public class bai06{
    public static void main(String[] args) {
        int n = 5;
        double tong = 0.0;

        for (int i = 1; i <= n; i++) {
            double giaThua = tinhGiaThua(i);
            tong += 1.0 / giaThua;
        }

        tong += 1.0;

        System.out.println("Tổng S = " + tong);
    }

    public static double tinhGiaThua(int n) {
        double giaThua = 1;
        for (int i = 1; i <= n; i++) {
            giaThua *= i;
        }
        return giaThua;
    }
}

