package com.paulo.moviecatalog.repositories;


import com.paulo.moviecatalog.entities.Category;
import com.paulo.moviecatalog.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
