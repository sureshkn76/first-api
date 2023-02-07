package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.GroceryItem;

@Repository
public interface ItemRepository extends MongoRepository<GroceryItem, String> {


}