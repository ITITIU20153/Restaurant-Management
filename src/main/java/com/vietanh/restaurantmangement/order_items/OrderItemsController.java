package com.vietanh.restaurantmangement.order_items;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/orderitems")
public class OrderItemsController {
    @Autowired
    private OrderItemsService orderItemsService;

    @GetMapping()
    public ResponseEntity<List<OrderItems>> getOrderItems() {
        return ResponseEntity.ok(orderItemsService.getOrderItems());
    }

    @GetMapping("/{order_id}")
    public ResponseEntity<List<OrderItems>> getItemsBill(@PathVariable Long order_id) {
        return ResponseEntity.ok(orderItemsService.findBillByOrderId(order_id));
    }

    @PostMapping()
    public ResponseEntity<OrderItems> postMethodName(@RequestBody OrderItems orderItems) {

        return ResponseEntity.status(HttpStatus.CREATED).body(orderItemsService.insertOrderItems(orderItems));
    }

}
