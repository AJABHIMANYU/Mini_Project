package com.newust.CarDetails.repository;

import com.newust.CarDetails.Entity.Car;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarRepo extends MongoRepository<Car,Integer> {

    Optional<Car> findByCarId(int carId);
   public  List<Car> findByType(String Type);

}
