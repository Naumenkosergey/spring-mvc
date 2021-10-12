package web.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@AllArgsConstructor
@Service
public class CarServiceImpl implements CarService {

    private CarDao carDao;

    @Override
    public List<Car> getAllCar() {
        return carDao.getAllCar();
    }

    @Override
    public List<Car> getCountCar(int count) {
        return carDao.getCountCar(count);
    }
}
