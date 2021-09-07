package springboot_petstore.app.pet.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springboot_petstore.app.pet.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
