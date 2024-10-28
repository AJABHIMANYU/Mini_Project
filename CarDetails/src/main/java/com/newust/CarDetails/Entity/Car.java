package com.newust.CarDetails.Entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Document(collection = "CarDetails")
public class Car {


    @Id
    private int carId;
    private String name;
    private String type;
    private Long Price;

}
