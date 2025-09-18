package com.project.ecommerce.repository;

import com.project.ecommerce.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderRepository extends MongoRepository<Order, String>
{

    List<Order> findByUserID(String userId);
}
