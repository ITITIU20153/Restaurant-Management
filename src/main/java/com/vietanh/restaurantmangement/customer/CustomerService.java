package com.vietanh.restaurantmangement.customer;

import java.util.List;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.vietanh.restaurantmangement.system.BcryptPassword;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<CustomerProfile> findAllCustomers() {
        return customerRepository.findAll();
    }

    public CustomerProfile findCustomerById(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("not found Customer"));
    }

    public CustomerProfile createCustomer(CustomerProfile customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
        findCustomerById(id);
        customerRepository.deleteById(id);
    }
}
