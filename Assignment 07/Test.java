package ssk3101_assignment7;

/**
 *
 * @author sinaa
 */
public class Test {

    public static void main(String[] args) {
        Sedan audiS6 = new Sedan(250, 568927, "Black", 2020, 4);
        Caravan venus = new Caravan(120, 269676, "White", 1320);
        MPV vellfire = new MPV(170, 382300, "Black", 16);
        Car[] cars = new Car[]{audiS6, venus, vellfire};
        for (Car car : cars) {
            System.out.println(car + "\n");
        }
    }

}
