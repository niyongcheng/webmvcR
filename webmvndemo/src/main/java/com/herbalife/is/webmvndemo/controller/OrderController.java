package com.herbalife.is.webmvndemo.controller;

import com.herbalife.is.webmvndemo.entity.OrderHeaderEntity;
import com.herbalife.is.webmvndemo.service.OrderHeaderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class OrderController {

    private OrderHeaderService orderHeaderService;

    public OrderController(OrderHeaderService orderHeaderService){
        this.orderHeaderService = orderHeaderService;
    }

    @PostMapping("orderHeader")
    public OrderHeaderEntity orderHeaderSave(@RequestBody OrderHeaderEntity orderHeaderEntity){
        return this.orderHeaderService.save(orderHeaderEntity);
    }
}
