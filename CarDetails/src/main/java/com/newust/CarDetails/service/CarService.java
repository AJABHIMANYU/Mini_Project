package com.newust.CarDetails.service;

import com.newust.CarDetails.Entity.Car;
import com.newust.CarDetails.feign.CommsToSales;
import com.newust.CarDetails.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepo repo;

    @Autowired
    private CommsToSales comms;

    public Integer getSalesCountForCar(Integer carId) {
        ResponseEntity<Integer> response = comms.getcount(carId);
        return response.getBody();
    }

    public Car createCar(Car c){
        return repo.save(c);

    }
    public Car getCar(int id) {
        Optional<Car> op = repo.findByCarId(id);
        if (op == null) {
            return null;
        } else {

            return op.get();


        }
    }

    public List<Car> getAllCar(){
        List<Car> li =repo.findAll();
        return li;
    }

    public List<Car> getbyType(String type){
        List<Car> li =repo.findByType(type);
        return li;
    }
}
