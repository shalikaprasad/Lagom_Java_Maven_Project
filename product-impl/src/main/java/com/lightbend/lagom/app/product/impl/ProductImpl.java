package com.lightbend.lagom.app.product.impl;

import akka.NotUsed;
import com.kelaniya.uni.product.api.Product;
import com.kelaniya.uni.product.api.ProductService;
import com.lightbend.lagom.javadsl.api.ServiceCall;


import java.util.concurrent.CompletableFuture;

public class ProductImpl implements ProductService {

    public ProductImpl() {
    }

    @Override
    public ServiceCall<NotUsed, Product> getProductById(String id){
        System.out.println("get product by id method is called with id "+ id);

        return request -> CompletableFuture.completedFuture(new Product());
    }
}
