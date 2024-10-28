package com.newust.CarDetails.controller;

import com.newust.CarDetails.Entity.Car;
import com.newust.CarDetails.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Car")
public class CarController {

    @Autowired
    private CarService service;

    @GetMapping("/getSalesCount/{id}")
    public ResponseEntity<Integer> getSalesCount(@PathVariable Integer id){
        return ResponseEntity.ok(service.getSalesCountForCar(id));
    }

    @GetMapping("/getCar/{id}")
    public ResponseEntity<Car> getCar(@PathVariable int id){
        return ResponseEntity.ok(service.getCar(id));

    }
    @GetMapping("/getAllCar")
    public ResponseEntity<List<Car>> getall(){
        return ResponseEntity.ok(service.getAllCar());
    }

    @GetMapping("/getByType/{type}")
    public ResponseEntity<List<Car>> getbytype( @PathVariable String type){
        return ResponseEntity.ok(service.getbyType(type));
    }

    @PostMapping("/AddCar")
    public ResponseEntity<Car> createcar(@RequestBody Car car){
        return ResponseEntity.ok(service.createCar(car));
    }
}
