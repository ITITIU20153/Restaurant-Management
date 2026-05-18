package com.vietanh.restaurantmangement.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // @Query(value = """
    // Select customer
    // From customer
    // Where username = :userName
    // """, nativeQuery = true)
    // Customer findCustomerByUserName(String userName);

    boolean existsByUserName(String userName);

    @Query(value = """
            Select *
            From customer_table
            Where username = :userName
            """, nativeQuery = true)
    Customer findCustomerByUserName(String userName);
}
