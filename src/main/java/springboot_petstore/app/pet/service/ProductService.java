package springboot_petstore.app.pet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot_petstore.app.pet.entity.Product;
import springboot_petstore.app.pet.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void saveProduct(Product product){
        productRepository.save(product);
    }

    public List<Product> getAllProducts(){
       return (List<Product>) productRepository.findAll();
    }

}
