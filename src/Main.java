//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tracker tracker = new Satelite();
        Position seattle = tracker.position(1000, 3000);
        Driver driver = new GoodDriver(tracker);
        Car car = new VW();
        if (driver.travel(car, seattle)) {
            System.out.println("Drink coffee");
        } else {
            System.out.println("Call for help");
        }
    }
}