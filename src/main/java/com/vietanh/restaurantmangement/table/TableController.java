package com.vietanh.restaurantmangement.table;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/table")
public class TableController {
    @Autowired
    private TableService tableService;

    @GetMapping()
    public List<TableEntity> getAllTables() {
        return tableService.getAllTables();
    }

    @GetMapping("/{id}")
    public TableEntity getTableById(@PathVariable Long id) {
        return tableService.getTableById(id);
    }

    @PostMapping()
    public TableEntity saveTable(@RequestBody TableEntity table) {
        return tableService.saveTable(table);
    }

    @DeleteMapping("/{id}")
    public void deleteTable(@PathVariable Long id) {
        tableService.deleteTable(id);
    }
}
