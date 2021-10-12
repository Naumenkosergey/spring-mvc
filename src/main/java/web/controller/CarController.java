package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        List<Car> cars = new ArrayList<>() {{
            add(new Car("Lancia", "lybra", 2000));
            add(new Car("Mersedess-benzz", "s500", 2015));
            add(new Car("RangeRover", "Velar", 2020));
            add(new Car("Skoda", "Superb", 2020));
            add(new Car("Kia", "K5", 2020));
        }};
        cars = CarService.getCarsCount(cars, count);
        model.addAttribute("cars", cars);
        return "car";
    }

}
