public class Hangar {
    public static void main(String[] args) {
        Car newCar = new Car("Opel", 200000);
        Boat newBoat = new Boat("boatboat", 10000000);

        System.out.println(newCar.doStuff());
        System.out.println(newBoat.doStuff());
    }
}
