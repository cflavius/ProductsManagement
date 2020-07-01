package com.flavius.productsmanagement.services;

import java.util.List;

import com.flavius.productsmanagement.model.Product;

public interface ProductsService {

	List<Product> getProducts();
	
	Product addProduct(Product product);
	
	Product getProduct(int id);
	
	void removeProduct(int id);
	
	public Product updateProduct(int id, Product product);
}
