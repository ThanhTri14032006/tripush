import java.util.Scanner;

public class bai222 {
    public static void main(String[] args) {
        Scanner sc =new Scanner( System.in );
         System.out.println( " tính phuong trinh bat 1) :  ");
         // dung double
        System.out.println( " nhap he so a :");
          double a = sc.nextDouble();
        System.out.println("nhap he so b: ");
         double b = sc.nextDouble();
        System.out.println( " nhap he so c :");
         double c = sc.nextDouble();
         //co 2 nhánh ( 1 và 1*) và 2
       // nên dung ìf else
        if (a==0) { if ( b==0 ) {
            System.out.println("phuong trinh co vo so nghiem : ");
        } else  {
            System.out.println("phuong trinh vo nghiem :");}
        } else  { double g= ( c-b)/a;
            System.out.println(" nghieme cuar phuong trinh la: X ="+g );}
    }
}
