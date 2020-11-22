package com.herbalife.is.webmvndemo.service.impl;


import com.herbalife.is.webmvndemo.dao.OrderHeaderRepostory;
import com.herbalife.is.webmvndemo.entity.OrderHeaderEntity;
import com.herbalife.is.webmvndemo.service.OrderHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderHeaderServiceImp implements OrderHeaderService {

    private OrderHeaderRepostory orderHeaderRepostory;

    @Autowired
    public OrderHeaderServiceImp(OrderHeaderRepostory orderHeaderRepostory){
        this.orderHeaderRepostory = orderHeaderRepostory;
    }

    @Override
    public OrderHeaderEntity save(OrderHeaderEntity orderHeaderEntity) {
        return this.orderHeaderRepostory.save(orderHeaderEntity);
    }
}
