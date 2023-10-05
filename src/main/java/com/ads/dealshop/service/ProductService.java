package com.ads.dealshop.service;
import com.ads.dealshop.model.Product;

import com.ads.dealshop.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List; 

@Service
public class ProductService {
	@Autowired

	  private ProductRepository productRepository;

	     public void addProduct(Product product) {

	      productRepository.save(product);
}
	     public Product loadById(int productId) {
	    	   return productRepository.findById(productId).get();

	    	}
	     public List<Product> loadList() {
	    	    return (List<Product>)productRepository.findAll();

	    	  }
	     public void  updateProduct(Product product) {
	         productRepository.save(product);

	     }
	     public void deleteProduct(int productId) {
	         productRepository.deleteById(productId);

	     }
}
