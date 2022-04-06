package static_propety;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Fernari","350");
        System.out.println(Car.soxe);
        Car car1 = new Car("abv","123");
        System.out.println(Car.soxe);
    }
}
