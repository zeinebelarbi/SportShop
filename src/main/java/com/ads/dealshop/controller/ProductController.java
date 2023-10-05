package com.ads.dealshop.controller;
import com.ads.dealshop.model.Product;

import com.ads.dealshop.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RestController;

 

import java.util.List;

 

@RestController

@RequestMapping(value = "/product")
public class ProductController {
	@Autowired

	  private ProductService productService;

	 

	  @PostMapping(value = "/add")

	  public void addProduct(@RequestBody Product product) {

	    productService.addProduct(product);

	  }
	  @GetMapping(value="/load-product/{productId}")
	  public @ResponseBody Product loadById (@PathVariable("productId") int productId)  {

	    return productService.loadById (productId);

	  }
	  @GetMapping(value="/load-list")
	  public @ResponseBody List<Product> loadList ()  {

	    return productService.loadList ();

	  }
	  @PutMapping("/update")
	  public void updateProduct(@RequestBody Product product) {

	     productService.updateProduct(product);

	  }
	  @DeleteMapping("/delete/{productId}")
	  public void deleteProduct(@PathVariable("productId") int productId) {

	     productService.deleteProduct(productId);

	  }


}


