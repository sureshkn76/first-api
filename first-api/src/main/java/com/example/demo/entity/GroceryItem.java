package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("groceryitems")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GroceryItem {

    @Id
    private String id;
    private String name;
    private int quantity;
    private String category;

}

