package com.chaula.OrderService.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.match;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;

@Repository
public class CustomOrderServiceRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<OrderServiceData> findByUsernameUsingPipeline(String username) {
        // Creating the aggregation pipeline
        Aggregation aggregation = newAggregation(
                match(org.springframework.data.mongodb.core.query.Criteria.where("username").is(username))
        );

        // Executing the aggregation and getting the result
        AggregationResults<OrderServiceData> results = mongoTemplate.aggregate(aggregation, "Orders", OrderServiceData.class);
        return results.getMappedResults();
    }
}
