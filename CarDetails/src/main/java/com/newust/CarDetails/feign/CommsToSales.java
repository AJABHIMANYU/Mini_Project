package com.newust.CarDetails.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="SalesDetails",url = "http://localhost:9869/api/Sales")
public interface CommsToSales {

    @GetMapping("/getcountofsales/{id}")
    public ResponseEntity<Integer> getcount(@PathVariable Integer id);
}
