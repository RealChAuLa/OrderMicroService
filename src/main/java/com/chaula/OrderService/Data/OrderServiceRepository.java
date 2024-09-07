package com.chaula.OrderService.Data;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface OrderServiceRepository extends MongoRepository<OrderServiceData,String> {

}
