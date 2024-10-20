import java.util.Scanner;

public class bai05 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         System.out.println(" tong cac day so sau : ");
        System.out.println("moi nhap gia tri n sau: ");
        int n = sc.nextInt();
        double s = 0.0;
        for(int i =1; i<=n;i++ ){
            s+= 1.0/i; 
        
        System.out.println(" tong cua day so la : "+s  );
    }


    }

}
