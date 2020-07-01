package com.flavius.productsmanagement.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flavius.productsmanagement.model.Product;
import com.flavius.productsmanagement.repositories.ProductsRepository;

@Service
public class ProductsServiceImpl implements ProductsService {
	
	@Autowired
	ProductsRepository productRepository;

	@Override
	public List<Product> getProducts() {
		List<Product> allProducts = productRepository.findAll();
		return allProducts;
	}

	@Override
	public Product addProduct(Product product) {
		productRepository.saveAndFlush(product);
		return product;
	}

	@Override
	public Product getProduct(int id) {
		Optional<Product> product = productRepository.findById(id);
		return product.orElse(null);
	}

	@Override
	public void removeProduct(int id) {
		productRepository.deleteById(id);
	}

	@Override
	public Product updateProduct(int id, Product product) {
		Product existingProduct = productRepository.getOne(id);
		existingProduct.setDescription(product.getDescription());
		existingProduct.setName(product.getDescription());
		return productRepository.saveAndFlush(existingProduct);
	}
	
}
