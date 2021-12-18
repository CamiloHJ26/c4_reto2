package com.usa.ciclo4.reto2ciclo4.repository.crud;

import com.usa.ciclo4.reto2ciclo4.model.Product;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductCrudRepository extends MongoRepository<Product, Integer> {
        Optional<Product> findByReference(String reference);
}
