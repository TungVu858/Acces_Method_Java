package thuchanh;

public class phuongthuc_static {
//    int rollno;
//    String name;
//    static String college = "BachKhoa";
//    static void change(){
//        college = "QuốcGia";
//    }
//    phuongthuc_static(int r , String n){
//        rollno = r;
//        name = n;
//    }
//    void display(){
//        System.out.println(rollno + " " + name + " " + college);
//    }
//
//    public static void main(String[] args) {
//        phuongthuc_static.change();
//        phuongthuc_static a = new phuongthuc_static(111,"Tùng");
//        phuongthuc_static b = new phuongthuc_static(222,"Đạt");
//        a.display();
//        b.display();
//    }
    private int rollno;
    private String name;
    private static String college = " ";
    phuongthuc_static (int r , String n){
        rollno = r;
        name = n;
    }
    static void change(){
        college = "Phong";
    }
    void display(){
        System.out.println(rollno + " " + name + " " +college);
    }
}
