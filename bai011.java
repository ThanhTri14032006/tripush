import java.util.Scanner;

public class bai011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in  );
        System.out.println( "  - tinh tong tich hieu thuong cua 2 so nguyen - ");
        System.out.println(" Số nguyên a: ");
        int a = sc.nextInt();
        System.out.println( " Số  nguyên b : ");
         int b = sc.nextInt();
         int tong = a+b;
         int tich= a*b ;
         int hieu = a-b ;
         double thuong = b != 0 ?( double ) a/b : Double.NaN;//dòng này tùm lùm zậy coi lại đi=))) b != 0 phải cho vào ngoặc nha 
        System.out.println( " tong "+tong );
        System.out.println( " tich "+tich );
        System.out.println( " hieu "+hieu );
        System.out.println( "thuong "+thuong );

    }
}
