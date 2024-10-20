import java.util.Scanner;

public class bai08 { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        System.out.println(" cv&s cua hinh tron");
         double r= sc.nextDouble(); 
          double S = 3.14*r*r;
          double C = 28 *3.14*r;
          System.out.println(" chu vi : "+C);
          System.out.println(" DIEN TICH : "+S);
    }
}
