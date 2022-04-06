package static_propety;

public class Car {
    private String ten;
    private String nangluong;
    public static int soxe;
    public Car(String ten,String nangluong){
        this.ten = ten;
        this.nangluong = nangluong;
        soxe++;
    }
}
