package com.chaula.OrderService.Data;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface OrderServiceRepository extends MongoRepository<OrderServiceData,String> {


    // Aggregation query to find the top 4 cloth_id by total quantity
    @Aggregation(pipeline = {
            "{ $group: { _id: '$cloth_id', totalQuantity: { $sum: '$quantity' } } }",
            "{ $sort: { totalQuantity: -1 } }",
            "{ $limit: 4 }"
    })
    List<TopSalesData> findTop4ClothIdByTotalQuantity();
}
