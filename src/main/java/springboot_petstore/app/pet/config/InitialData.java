package springboot_petstore.app.pet.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import springboot_petstore.app.pet.entity.Product;
import springboot_petstore.app.pet.service.ProductService;

import javax.annotation.PostConstruct;

@Configuration
public class InitialData {

    @Autowired
    private ProductService productService;

    @PostConstruct
    public void initializeProductsIntoShop(){
        Product productOne = new Product("Dog bowl", 10.99);
        Product productTwo = new Product("Cat collar", 2.99);
        Product productThree = new Product("Dog raincoat", 20.99);
        productService.saveProduct(productOne);
        productService.saveProduct(productTwo);
        productService.saveProduct(productThree);
    }

}
