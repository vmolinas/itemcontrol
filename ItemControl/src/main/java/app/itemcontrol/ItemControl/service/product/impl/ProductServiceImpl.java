package app.itemcontrol.ItemControl.service.product.impl;

import app.itemcontrol.ItemControl.domain.Product;
import app.itemcontrol.ItemControl.service.product.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

/*
    private final ProductRepository productRepository;
*/

    Map<UUID, Product> productMap;

    public ProductServiceImpl(){
        productMap = new HashMap<>();
        Product product = new Product();
        product.setIdProduct(UUID.randomUUID());
        product.setName("lingot");
        product.setDescription("no se que sea");
        product.setCategory("nada");
        product.setStockNumber(3312);
        product.setPrice(132.132);
        product.setQuantityAvailable(123);
        product.setMinimumAmountAllowed(100);
        productMap.put(product.getIdProduct(), product);
    }

    @Override
    public List<Product> getAllProducts() {
        /*return productRepository.findAll();*/
        return new ArrayList<>(productMap.values());
    }
}
