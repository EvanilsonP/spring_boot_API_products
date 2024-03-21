package com.example.springboot.repositories;

import com.example.springboot.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.rmi.server.UID;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UID> {

}
