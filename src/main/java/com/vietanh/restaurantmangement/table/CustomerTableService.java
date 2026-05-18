package com.vietanh.restaurantmangement.table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerTableService {
    @Autowired
    private CustomerTableRepository customerTableRepository;

    public java.util.List<CustomerTable> getAllCustomerTables() {
        return customerTableRepository.findAll();
    }

    public CustomerTable getCustomerTableById(Long id) {
        return customerTableRepository.findById(id).orElseThrow(() -> new RuntimeException("CustomerTable not found"));
    }

    public CustomerTable saveCustomerTable(CustomerTable customerTable) {
        return customerTableRepository.save(customerTable);
    }

    public void deleteCustomerTable(Long id) {
        customerTableRepository.deleteById(id);
    }

}
