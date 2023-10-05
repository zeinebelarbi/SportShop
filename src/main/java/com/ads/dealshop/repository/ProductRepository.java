package com.ads.dealshop.repository;
import org.springframework.data.repository.CrudRepository;

import com.ads.dealshop.model.Product;
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
