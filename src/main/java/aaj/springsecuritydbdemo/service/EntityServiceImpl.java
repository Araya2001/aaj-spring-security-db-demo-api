package aaj.springsecuritydbdemo.service;

import aaj.springsecuritydbdemo.domain.Product;
import aaj.springsecuritydbdemo.domain.Warehouse;

import java.util.List;
import java.util.Optional;

public class EntityServiceImpl implements EntityService {
  @Override
  public boolean saveProduct(Product product) {
    return false;
  }

  @Override
  public boolean saveWarehouse(Warehouse warehouse) {
    return false;
  }

  @Override
  public List<Product> findAllByWarehouse(Warehouse warehouse) {
    return null;
  }

  @Override
  public List<Product> findAllByWarehouseUnsafe(Warehouse warehouse) {
    return null;
  }

  @Override
  public Optional<Product> findProductById(Integer id) {
    return Optional.empty();
  }

  @Override
  public Optional<Product> findWarehouseById(Integer id) {
    return Optional.empty();
  }
}
