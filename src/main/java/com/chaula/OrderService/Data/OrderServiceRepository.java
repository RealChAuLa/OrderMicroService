package com.chaula.OrderService.Data;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface OrderServiceRepository extends MongoRepository<OrderServiceData,String> {
}
