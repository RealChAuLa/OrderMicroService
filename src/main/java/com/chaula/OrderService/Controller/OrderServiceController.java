package com.chaula.OrderService.Controller;

import com.chaula.OrderService.Data.CustomOrderServiceRepository;
import com.chaula.OrderService.Data.OrderServiceData;
import com.chaula.OrderService.Data.OrderServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.List;

@CrossOrigin("*")
@RestController
public class OrderServiceController {
    @Autowired
    OrderServiceRepository repo;

    @Autowired
    CustomOrderServiceRepository customRepo;
    @ApiIgnore
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }
    @GetMapping("/posts")
    public List<OrderServiceData> getAllPosts(){
        return repo.findAll();
    }
    @PostMapping("/post")
    public OrderServiceData createPost(@RequestBody OrderServiceData post){
        return repo.save(post);
    }
    // Search by username using MongoDB pipeline
    @GetMapping("/posts/username/{username}")
    public List<OrderServiceData> getPostsByUsername(@PathVariable String username) {
        return customRepo.findByUsernameUsingPipeline(username);
    }
}
