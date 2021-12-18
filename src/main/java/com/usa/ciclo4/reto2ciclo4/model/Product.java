package com.usa.ciclo4.reto2ciclo4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "products")
public class Product {
    @Id
    private String reference;
    private String brand;
    private String category;
    private String name;
    private String description;
    private boolean availability;
    private double price;
    private Integer quantity;
    private String photography;

}
