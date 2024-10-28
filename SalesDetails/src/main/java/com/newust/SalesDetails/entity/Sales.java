package com.newust.SalesDetails.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class Sales {
    @Id
    private long salesId;
    private int carId;
    private Date salesDate;
}
