package CarTask.creator;

import CarTask.model.CarBrand;
import CarTask.model.Car;
import CarTask.model.CarModel;
import java.util.Random;
public class FactoryCar {
    public static Car[] createCars(int size) {
        Car[] cars = new Car[size];
        Random random = new Random();
        CarBrand[] carBrands = CarBrand.values();
        int brandBorder = carBrands.length;
        CarModel[] carModels = CarModel.values();
        int modelBorder = carModels.length;
        for (int i = 0; i < size; i++) {
            Car car = new Car();
            int idRandom = random.nextInt(10000, 99999);
            car.setCarId(idRandom);
            int brandRandom = random.nextInt(brandBorder);
            CarBrand currentCarBrand = carBrands[brandRandom];
            car.setBrand(currentCarBrand);
            int modelRandom = random.nextInt(modelBorder);
            CarModel currentCarModel = carModels[modelRandom];
            car.setModel(currentCarModel);
            int YearRandom = random.nextInt(1980,2023);
            car.setCarYear(YearRandom);
            int valueRandom = random.nextInt(1000,10000);
            car.setCarValue(valueRandom);
            int CarNumberFirstRandom = random.nextInt(0,9999);
            int CarNumberEndRandom = random.nextInt(1,7);
            String carLetterInNumber = "BY-";
            car.setCarNumber(CarNumberFirstRandom+carLetterInNumber+CarNumberEndRandom);
            cars[i] = car;
        }
        return cars;
    }
}