package com.newust.SalesDetails.repository;

import com.newust.SalesDetails.entity.Sales;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SalesRepository extends MongoRepository<Sales,Long> {

    Optional<Sales> findBySalesId(Long l);
}
