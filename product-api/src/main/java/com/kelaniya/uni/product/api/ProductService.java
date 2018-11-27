package com.kelaniya.uni.product.api;

import akka.NotUsed;
import com.lightbend.lagom.javadsl.api.Descriptor;
import com.lightbend.lagom.javadsl.api.ServiceCall;
import com.lightbend.lagom.javadsl.api.Service;

import static com.lightbend.lagom.javadsl.api.Service.named;
import static com.lightbend.lagom.javadsl.api.Service.pathCall;

public interface ProductService extends Service {

    public ServiceCall<NotUsed, Product> getProductById(String id);

    @Override
    default Descriptor descriptor() {
        // @formatter:off
        return named("product").withCalls(
                pathCall("/api/product/:id",  this::getProductById)
        ).withAutoAcl(true);
        // @formatter:on
    }


}
