import java.util.Scanner;

public class bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" phương trinh bac 2 ");
        System.out.println(" nhap he so a : ");
        double a = sc.nextDouble();
        System.out.println(" nhap he so b");
        double b = sc.nextDouble();
        System.out.println(" nhap he so c");
        double c = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println(" phuongh trinh co vo so nghiem  ");
                } else {
                    System.out.println(" phuongh trinh  vo  nghiem ");
                }
            } else {
                double g = -c / b;
                System.out.println("phuong trinh co nghiem duy nhat :X=" + g);
            }
            // delta
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                //::))
                double x1 = (-b + Math.sqrt (delta)) /(2 * a);
                double x2 = (-b - Math.sqrt (delta)) /(2 * a);
                System.out.println("  phuong trinh cos 2 nghiem phan biet x1=" + x1 + ",x2" + x2);
            } else {
                System.out.println("phuong trinh vo so nghiem ");

            }

        }
    }
}