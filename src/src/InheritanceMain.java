public class InheritanceMain {

    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.go();
        car.stop();

        Car ford = new Car();
        ford.go();
        ford.stop();

        Bicycle bike = new Bicycle();
        bike.go();
        bike.stop();

        System.out.println(ford.speed);

    }
}
