package CarTask.service;
import CarTask.model.Car;
import java.util.ArrayList;
import java.util.List;

public class FindCars {
    public static Car[] findCarsByValue(Car[] cars, int startValue, int endValue) {
        List<Car> filteredByValue = new ArrayList<>();
        for (Car car : cars) {
            if ((car.getCarValue() >= startValue) && (car.getCarValue() <= endValue)) {
                filteredByValue.add(car);
            }
        }
        return filteredByValue.toArray(new Car[0]);
    }
    public static Car[] findCarsInYears(Car[] cars, int startYear, int endYear) {
        List<Car> filteredByYearCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getCarYear() >= startYear && car.getCarYear() <= endYear) {
                filteredByYearCars.add(car);
            }
        }
        return filteredByYearCars.toArray(new Car[0]);
    }
}