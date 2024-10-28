package com.newust.SalesDetails.service;

import com.newust.SalesDetails.entity.Sales;
import com.newust.SalesDetails.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class SalesService {

    @Autowired
    private SalesRepository repo;

    public Sales createSales(Sales sales){
        return repo.save(sales);

    }
    public List<Sales> getallSales(){
        return repo.findAll();

    }
    public Sales getbyid(Long id){
        Optional<Sales> op=repo.findBySalesId(id);
        if(op.isPresent())
            return op.get();
        else
            return null;

    }

    public Integer getcountofCarsold(int id){
        List<Sales> li=repo.findAll();
        int c=0;
        for(Sales s:li){
            if(s.getCarId()==id){
                c++;
            }
        }
        return c;
    }
}
