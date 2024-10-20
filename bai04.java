import java.util.Scanner;

public class bai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println( "  tinh tông các sưo nguyen duong từ 1 tới 5 ");
        System.out.println( " 0<n<=5");
        System.out.println( " nhập so nguyêm m ( n> 0:)");
        int n =sc.nextInt();
        if ( n>0) {
            int sum = n * (n + 1) / 2;
            System.out.println(" tong cac so tu 1 den n " + n + "la:" + sum);
        } else {
            System.out.println(" nhap 1 soo lon hon 0 ");
        }
//
         sc.close();
    }
}
