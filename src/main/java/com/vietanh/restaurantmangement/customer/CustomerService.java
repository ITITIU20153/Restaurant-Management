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

    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("not found Customer"));
    }

    public Boolean checkCustomerByUserName(String userName) {
        return customerRepository.existsByUserName(userName);
    }

    public Customer findCustomerByUserName(String userName) {
        return customerRepository.findCustomerByUserName(userName);
    }

    public Customer createCustomer(Customer customer) {
        if (checkCustomerByUserName(customer.getUserName())) {
            throw new RuntimeException("Username '" + customer.getUserName() + "' already esxit");
        }
        String passWord = customer.getPassWord();
        BcryptPassword encoder = new BcryptPassword();
        customer.setPassWord(encoder.encode(passWord));

        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
        findCustomerById(id);
        customerRepository.deleteById(id);
    }
}
