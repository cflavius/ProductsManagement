package com.flavius.productsmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flavius.productsmanagement.model.Product;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Integer>  {

}
