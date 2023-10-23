package CarTask.main;

import CarTask.creator.FactoryCar;
import CarTask.model.Car;
import CarTask.service.FindCars;

public class CarMain {
    public static void main(String[] args) {
        Car[] cars = FactoryCar.createCars(10);
        System.out.println("Cars:");
        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("\nCars from 2000 to 2023\n");
        Car[] filteredByYearCars = FindCars.findCarsInYears(cars, 2000, 2023);
        for (Car filteredByYearCar : filteredByYearCars) {
            System.out.println(filteredByYearCar);
        }

        System.out.println("\nCars from 2500 to 5000\n");
        Car[] filteredByValue = FindCars.findCarsByValue(cars, 2500, 5000);
        for (Car car : filteredByValue) {
            System.out.println(car);
        }
    }



}