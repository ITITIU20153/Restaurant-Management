package com.vietanh.restaurantmangement.table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-table")
public class CustomerTableController {
    @Autowired
    private CustomerTableService customerTableService;

    @GetMapping()
    public java.util.List<CustomerTable> getAllCustomerTables() {
        return customerTableService.getAllCustomerTables();
    }

    @GetMapping("/{id}")
    public CustomerTable getCustomerTableById(@PathVariable Long id) {
        return customerTableService.getCustomerTableById(id);
    }

    @PostMapping()
    public CustomerTable saveCustomerTable(@RequestBody CustomerTable customerTable) {
        return customerTableService.saveCustomerTable(customerTable);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomerTable(@PathVariable Long id) {
        customerTableService.deleteCustomerTable(id);
    }

}
