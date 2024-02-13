package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    Car car;
    @GetMapping("/cars")
    public String carsInfo(){
        List<String> cars = new ArrayList<>();
        cars.add(car.)
    }
}
