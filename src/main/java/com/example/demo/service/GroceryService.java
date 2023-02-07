package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.GroceryItem;
import com.example.demo.repository.ItemRepository;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class GroceryService {
	
	@Autowired
	ItemRepository itemRepo;
	
	public List<GroceryItem> getItems() {
		return itemRepo.findAll();
	}

	public void addItem(GroceryItem item) {
			itemRepo.save(item);
	}

}
