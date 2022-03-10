package com.ttn.springdata.product.repos;

import com.ttn.springdata.product.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
