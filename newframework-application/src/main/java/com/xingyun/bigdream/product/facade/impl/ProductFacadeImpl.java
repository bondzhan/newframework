package com.xingyun.bigdream.product.facade.impl;

import com.xingyun.bigdream.product.api.ProductFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Bond
 * @Date 2024/12/26
 * @Description TODO
 */

@RestController
@RequestMapping("/product")
public class ProductFacadeImpl implements ProductFacade<String> {

    @Override
    @GetMapping("/getProduct")
    public ResponseEntity getProduct() {
        return ResponseEntity.ok("ProductFacadeImpl.getProduct()");
    }
}
