package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {

    List<Car> cars = new ArrayList<>() {{
        add(new Car("Lancia", "lybra", 2000));
        add(new Car("Mersedess-benzz", "s500", 2015));
        add(new Car("RangeRover", "Velar", 2020));
        add(new Car("Skoda", "Superb", 2020));
        add(new Car("Kia", "K5", 2020));
    }};

    @Override
    public List<Car> getAllCar() {
        return cars;
    }

    @Override
    public List<Car> getCountCar(int count) {
        if (count >= 5)
            getAllCar();
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
