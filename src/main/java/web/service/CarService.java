package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public interface CarService {

    List<Car> getAllCar();
    List<Car> getCountCar(int count);
}
