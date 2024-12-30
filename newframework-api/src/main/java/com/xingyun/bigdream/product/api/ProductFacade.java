package com.xingyun.bigdream.product.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;

/**
 * @Author Bond
 * @Date 2024/12/26
 * @Description TODO
 */
@FeignClient(name = "product-service", path = "/product/facade")
public interface ProductFacade<T> {
     ResponseEntity<T> getProduct();
}
