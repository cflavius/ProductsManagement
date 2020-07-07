package com.flavius.productsmanagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flavius.productsmanagement.model.Product;
import com.flavius.productsmanagement.services.ProductsService;

@RestController
public class ProductsController {

	@Autowired
	ProductsService productsService;
	
	@GetMapping("/products")
	List<Product> getProducts() {
		return productsService.getProducts();
	}
	
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product product) {
		return productsService.addProduct(product);
	}
	
	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable (value = "id") int id) {
		return productsService.getProduct(id);
	}
	
	@DeleteMapping("/products/{id}")
	public void deleteProduct(@PathVariable int id) {
		productsService.removeProduct(id);
	}
	
	@PatchMapping("/products/{id}")
	public Product updateProduct(@PathVariable int id, @RequestBody Product product) {
		return productsService.updateProduct(id, product);
	}
	
}
