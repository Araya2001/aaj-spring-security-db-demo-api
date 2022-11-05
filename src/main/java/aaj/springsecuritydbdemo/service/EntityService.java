package aaj.springsecuritydbdemo.service;

import aaj.springsecuritydbdemo.domain.Product;
import aaj.springsecuritydbdemo.domain.Warehouse;

import java.util.List;
import java.util.Optional;

public interface EntityService {
  boolean saveProduct(Product product);

  boolean saveWarehouse(Warehouse warehouse);

  List<Product> findAllByWarehouse(Warehouse warehouse);

  List<Product> findAllByWarehouseUnsafe(Warehouse warehouse);

  Optional<Product> findProductById(Integer id);

  Optional<Product> findWarehouseById(Integer id);
}
