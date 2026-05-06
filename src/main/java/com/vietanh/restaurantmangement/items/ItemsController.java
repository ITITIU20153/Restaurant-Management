package com.vietanh.restaurantmangement.items;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemsController {
    private final ItemsService itemsService;

    public ItemsController(ItemsService itemsService) {
        this.itemsService = itemsService;
    }

    @GetMapping()
    public ResponseEntity<List<Items>> getAllItems() {
        return ResponseEntity.ok(itemsService.getItems());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Items> getItemById(@PathVariable Long id) {
        return ResponseEntity.ok(itemsService.getItemById(id));
    }

    @PostMapping()
    public ResponseEntity<Items> insertItem(@RequestBody Items item) {
        return ResponseEntity.status(HttpStatus.CREATED).body(itemsService.insertItem(item));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteItem(@PathVariable Long id) {
        itemsService.deleteItemById(id);
        return ResponseEntity.noContent().build();
    }
}
