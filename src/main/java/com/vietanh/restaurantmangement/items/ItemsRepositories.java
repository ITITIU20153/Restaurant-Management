package com.vietanh.restaurantmangement.items;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsRepositories extends JpaRepository<Items, Long> {

}
