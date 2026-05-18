package com.vietanh.restaurantmangement.order_items;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemsRepositories extends JpaRepository<OrderItems, Long> {
    @Query(value = """
            SELECT i.price
            FROM order_items_table oi
            JOIN item_table i
                ON i.id = oi.items_id
            WHERE oi.id = :id
            """, nativeQuery = true)

    Integer findPriceById(@Param("id") Long id);

    @Query(value = """
            Select o.name, oi.*, i.name, i.price
            From order_items_table as oi
            Join order_table as o on o.id = oi.order_id
            Join item_table as i on i.id = oi.items_id
            Where oi.order_id = :order_id;
                            """, nativeQuery = true)
    List<OrderItems> findBillByOrderId(@Param("order_id") Long order_id);

}
