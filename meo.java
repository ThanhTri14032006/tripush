
public class meo {private String ten;
private int tuoi;

public meo(String ten, int tuoi) {
    this.ten = ten;
    this.tuoi = tuoi;
}

public void keu() {
    System.out.println(ten + " đang kêu: Meo Meo!");
}

public void chay() {
    System.out.println(ten + " đang chạy rất nhanh!");
}

public void hienThiThongTin() {
    System.out.println("Tên: " + ten + ", Tuổi: " + tuoi + " năm");
}

public static void main(String[] args) {
    meo conMeo = new meo("Mimi", 2);
    conMeo.hienThiThongTin();
    conMeo.keu();
    conMeo.chay();
}
}
