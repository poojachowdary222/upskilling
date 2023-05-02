package oopcoding;

import java.util.ArrayList;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car car1 = new Car();
        car1.setMake("Toyota");
        car1.setModel("Camry");
        car1.setYear(2022);
        cars.add(car1);

        Car car2 = new Car();
        car2.setMake("Honda");
        car2.setModel("Civic");
        car2.setYear(2021);
        cars.add(car2);

        Car car3 = new Car();
        car3.setMake("Ford");
        car3.setModel("Mustang");
        car3.setYear(2023);
        cars.add(car3);

        Car car4 = new Car();
        car4.setMake("Chevrolet");
        car4.setModel("Corvette");
        car4.setYear(2021);
        cars.add(car4);

        Car car5 = new Car();
        car5.setMake("Tesla");
        car5.setModel("Model S");
        car5.setYear(2022);
        cars.add(car5);

        for (Car car : cars) {
            System.out.println("Make: " + car.getMake());
            System.out.println("Model: " + car.getModel());
            System.out.println("Year: " + car.getYear());
            System.out.println();
        }
    }
}
