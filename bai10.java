import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean tiepTuc = true;
        while (tiepTuc) {
        System.out.println("chuong trinh mo phong may ban nuoc tu dong : ");
        System.out.println(" Moi ban chon mot loai nuoc : ");
        System.out.println(" 1 . Coca cola( 10000)  ");
        System.out.println(" 2 . Fanta( 8000)  ");
        System.out.println(" 3 . Pocari( 16000)  ");
        System.out.println(" 4 . Pesi( 7000)  ");
        System.out.println(" 5 . XaXi( 14000)  ");

        System.out.println(" 0 . Thoát");
        int luachon = sc.nextInt();
        int gia = 0;
        switch (luachon) {
            case 1:
                gia = 10000;
                System.out.println(" ban da chon Coca Cola");
                System.out.println(" Moi ban thanh toan. ");
                break;
            case 2:
                gia = 8000;

                System.out.println(" ban da chon Fanta");
                System.out.println(" Moi ban thanh toan.");
                break;
            case 3:
                gia = 16000;

                System.out.println(" ban da chon Pocari : ");
                System.out.println(" Moi ban thanh toan. ");
                System.out.println("Cảm ơn bạn đã sử dụng dịch vụ!");
                case 4:
                gia =7000;
                System.out.println(" bai da chon Pesi " );
                System.out.println(" Moi ban thanh toan. "); 
                System.out.println("Cảm ơn bạn đã sử dụng dịch vụ!");
            case 0:
                System.out.println("Cảm ơn bạn đã sử dụng dịch vụ!");
                tiepTuc = false;  
                break;
            default:
                System.out.println(" cac loai con lai het hang .");
                System.out.println("  xin cam on.");
                break;
        }
        System.out.println(" Tien thua " + gia + " vnd");
        System.out.println(" MOI BAN THANH TOAN : ");
        int tienKhachDua = sc.nextInt();
        if (tienKhachDua < gia) {
            System.out.println("Số tiền không đủ. Vui lòng thử lại.");
        } else {
            int tienThua = tienKhachDua - gia;
            System.out.println("Cảm ơn bạn đã mua hàng!");
            if (tienThua > 0) {
                System.out.println("Tiền thối lại: " + tienThua + " VNĐ");

            }
        }

    }sc.close();
    }
}

