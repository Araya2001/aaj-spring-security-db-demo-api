package aaj.springsecuritydbdemo.service;

import aaj.springsecuritydbdemo.domain.Product;
import aaj.springsecuritydbdemo.domain.Warehouse;

import java.util.List;
import java.util.Optional;

public interface EntityService {
  boolean saveProduct(Product product);

  boolean saveWarehouse(Warehouse warehouse);

  List<Product> findAllByWarehouse(Warehouse warehouse);

  List<Product> findAllByWarehouseUnsafe(String warehouse);

  List<Product> findAllProducts();

  List<Warehouse> findAllWarehouses();

  Optional<Product> findProductById(Integer id);

  Optional<Warehouse> findWarehouseById(Integer id);

  public List<Product> findAllByWarehousePotentiallyUnsafe(Integer warehouse);
}
