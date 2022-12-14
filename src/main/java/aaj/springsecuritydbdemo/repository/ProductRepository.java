package aaj.springsecuritydbdemo.repository;

import aaj.springsecuritydbdemo.domain.Product;
import aaj.springsecuritydbdemo.domain.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

  List<Product> findAllByWarehouse(Warehouse warehouse);
}
