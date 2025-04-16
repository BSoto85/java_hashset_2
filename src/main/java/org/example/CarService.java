package org.example; // Make sure this matches your package

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CarService {
    Set<Car> cars = new HashSet<>();

    public void addCar(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("Car cannot be null");
        } else {
            cars.add(car);
        }
    }

    public Boolean removeCar(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("Car cannot be null");
        } else {
            return cars.remove(car);
        }
    }

    public int getCarCount() {
        return cars.size();
    }

    public Set<Car> getCarsByMake(String make) {
        if (make == null || make.isEmpty()) {
            throw new IllegalArgumentException("Make cannot be null or empty");
        } else {
            return cars.stream()
                    .filter(car -> car.getMake()
                            .equalsIgnoreCase(make)).collect(Collectors.toSet());
        }
    }

}