package com.vietanh.restaurantmangement.items;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ItemsService {
    private final ItemsRepositories itemsRepositories;

    public ItemsService(ItemsRepositories itemsRepositories) {
        this.itemsRepositories = itemsRepositories;
    }

    public List<Items> getItems() {
        return itemsRepositories.findAll();
    }

    public Items getItemById(Long id) {
        return itemsRepositories.findById(id).orElseThrow(() -> new RuntimeException("Not find item"));
    }

    public Items insertItem(Items items) {
        return itemsRepositories.save(items);
    }

    public void deleteItemById(Long id) {
        itemsRepositories.deleteById(id);
    }

    public Items putItem(Items items) {
        return itemsRepositories.save(items);
    }
}
