package com.vietanh.restaurantmangement.table;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerTableRepository extends JpaRepository<CustomerTable, Long> {

}
