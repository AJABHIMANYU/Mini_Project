package com.newust.SalesDetails.controller;

import com.newust.SalesDetails.entity.Sales;
import com.newust.SalesDetails.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Sales")
public class SalesController {

    @Autowired
    private SalesService service;

    @PostMapping("/createSales")
    public ResponseEntity<Sales> CreateSales(@RequestBody Sales sales){
        return ResponseEntity.ok(service.createSales(sales));
    }

    @GetMapping("/getsalesbyId/{id}")
    public ResponseEntity<Sales> getsalesbyid(@PathVariable Long id){
        return ResponseEntity.ok(service.getbyid(id));
    }

    @GetMapping("/getAllsales")
    public ResponseEntity<List<Sales>> getallSales(){
        return ResponseEntity.ok(service.getallSales());
    }

    @GetMapping("/getcountofsales/{id}")
    public ResponseEntity<Integer> getcount(@PathVariable Integer id){
        return ResponseEntity.ok(service.getcountofCarsold(id));
    }

}
