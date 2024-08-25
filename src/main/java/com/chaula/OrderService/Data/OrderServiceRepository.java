package com.chaula.OrderService.Data;
import com.chaula.OrderService.Data.OrderServiceData;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface OrderServiceRepository extends MongoRepository<OrderServiceData,String> {
}
