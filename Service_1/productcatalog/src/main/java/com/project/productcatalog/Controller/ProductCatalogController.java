package com.project.productcatalog.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCatalogController {

    @GetMapping("/product")
    public String getProductList(){
        return "ProductList";
    }

}
