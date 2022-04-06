package thuchanh;

public class test {
    public static void main(String[] args) {
        phuongthuc_static a = new phuongthuc_static(111,"Tùng");
        a.display();
        phuongthuc_static b = new phuongthuc_static(222,"Đạt");
        b.display();
        phuongthuc_static.change();
        phuongthuc_static c = new phuongthuc_static(8,"năm++ = ");
        c.display();
    }
}
