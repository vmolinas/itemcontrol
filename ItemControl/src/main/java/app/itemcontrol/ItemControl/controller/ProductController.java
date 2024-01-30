package app.itemcontrol.ItemControl.controller;

import app.itemcontrol.ItemControl.domain.Product;
import app.itemcontrol.ItemControl.service.product.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/app/v1/product")
public class ProductController {

    private final ProductService productService;

    @GetMapping()
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
}