package com.exercise10;

public class Main {
    public static void main(String[] args) {
        CarsMechanic carsMechanic = new CarsMechanic("david", 8, new String[]{"BMW", "FORD FOCUS", "AUDI"});
        System.out.println(carsMechanic);
        carsMechanic.repair();
        carsMechanic.replaceWheel();
        carsMechanic.useScrewdriver();

        AirplanesMechanic airplanesMechanic = new AirplanesMechanic("danny", 15, 100);
        System.out.println(airplanesMechanic);
        airplanesMechanic.repair();
        airplanesMechanic.checkEngine();
        airplanesMechanic.useScrewdriver();
    }
}
