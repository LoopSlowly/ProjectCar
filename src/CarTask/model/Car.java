package CarTask.model;

import java.util.StringJoiner;

public class Car {
    private int carId;
    private CarBrand carBrand;
    private CarModel carModel;
    private int carYear;
    private int carValue;
    private String carNumber;

    public Car(int carId, CarBrand carBrand, CarModel carModel, int carYear, int carValue, String carNumber) {
        this.carId = carId;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carYear = carYear;
        this.carValue = carValue;
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Car.class.getSimpleName() + "[", "]")
                .add("carId=" + carId)
                .add("carBrand=" + carBrand)
                .add("carModel=" + carModel)
                .add("carYear=" + carYear)
                .add("carValue=" + carValue)
                .add("carNumber='" + carNumber + "'")
                .toString();
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public CarBrand getBrand() {
        return carBrand;
    }

    public void setBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    public CarModel getModel() {
        return carModel;
    }

    public void setModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public double getCarValue() {
        return carValue;
    }

    public void setCarValue(int carValue) {
        this.carValue = carValue;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
    }
