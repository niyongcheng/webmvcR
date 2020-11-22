package com.herbalife.is.webmvndemo.dao;

import com.herbalife.is.webmvndemo.entity.OrderHeaderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderHeaderRepostory extends JpaRepository<OrderHeaderEntity,Integer> {
}
