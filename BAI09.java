
import java.util.Scanner;

public class BAI09 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println( " đổi tiền Việt ra ngoại tệ");
        System.out.println("Mời bạn nhập lựa chọn:");

        System.out.printf(" nhap so tien USD : ");
        int a = sc.nextInt();
        if (a== 1)
        {
            System.out.println(" nhap so tien ban muon chuyen ");
 double vnd =sc.nextDouble( );
 double usd = vnd/24000;
            System.out.println("Số tiền đổi được là: %.2f USD\n"+ usd);}
        else{
            System.out.println("truong hop con lai ko hop le ");
    }
        sc.close();
}
}
