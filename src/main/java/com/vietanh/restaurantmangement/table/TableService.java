package com.vietanh.restaurantmangement.table;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableService {
    @Autowired
    private TableRepositories tableRepositories;

    public List<TableEntity> getAllTables() {
        return tableRepositories.findAll();
    }

    public TableEntity getTableById(Long id) {
        return tableRepositories.findById(id).orElseThrow(() -> new RuntimeException("Table not found"));
    }

    public TableEntity saveTable(TableEntity table) {
        return tableRepositories.save(table);
    }

    public void deleteTable(Long id) {
        tableRepositories.deleteById(id);
    }
}
