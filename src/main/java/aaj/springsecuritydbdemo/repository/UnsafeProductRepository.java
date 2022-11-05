package aaj.springsecuritydbdemo.repository;

import aaj.springsecuritydbdemo.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UnsafeProductRepository {
  List<Product> findAllByWarehouseUnsafe(String warehouseId);
}
