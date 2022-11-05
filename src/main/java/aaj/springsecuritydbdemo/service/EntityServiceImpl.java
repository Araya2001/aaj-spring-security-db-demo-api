package aaj.springsecuritydbdemo.service;

import aaj.springsecuritydbdemo.domain.Product;
import aaj.springsecuritydbdemo.domain.Warehouse;
import aaj.springsecuritydbdemo.repository.ProductRepository;
import aaj.springsecuritydbdemo.repository.UnsafeProductRepository;
import aaj.springsecuritydbdemo.repository.WarehousetRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Log4j2
public class EntityServiceImpl implements EntityService {
  private final ProductRepository productRepository;
  private final WarehousetRepository warehousetRepository;
  private final UnsafeProductRepository unsafeProductRepository;

  @Autowired
  public EntityServiceImpl(ProductRepository productRepository, WarehousetRepository warehousetRepository, UnsafeProductRepository unsafeProductRepository) {
    this.productRepository = productRepository;
    this.warehousetRepository = warehousetRepository;
    this.unsafeProductRepository = unsafeProductRepository;
  }

  @Override
  public boolean saveProduct(Product product) {
    boolean isOk = false;
    try {
      productRepository.saveAndFlush(product);
      isOk = true;
    } catch (Exception e) {
      log.error("@EntityServiceImpl.saveProduct error:", e);
    }
    return isOk;
  }

  @Override
  public boolean saveWarehouse(Warehouse warehouse) {
    boolean isOk = false;
    try {
      warehousetRepository.saveAndFlush(warehouse);
      isOk = true;
    } catch (Exception e) {
      log.error("@EntityServiceImpl.saveWarehouse", e);
    }
    return isOk;
  }

  @Override
  public List<Product> findAllByWarehouse(Warehouse warehouse) {
    try {
      return productRepository.findAllByWarehouse(warehouse);
    } catch (Exception e) {
      log.error("@EntityServiceImpl.saveProduct error:", e);
    }
    return null;
  }

  @Override
  public List<Product> findAllByWarehouseUnsafe(Integer warehouse) {
    try {
      return unsafeProductRepository.findAllByWarehouseUnsafe(warehouse);
    } catch (Exception e) {
      log.error("@EntityServiceImpl.saveProduct error:", e);
    }
    return null;
  }

  @Override
  public List<Product> findAllProducts() {
    try {
      return productRepository.findAll();
    } catch (Exception e) {
      log.error("@EntityServiceImpl.saveProduct error:", e);
    }
    return null;
  }

  @Override
  public List<Warehouse> findAllWarehouses() {
    try {
      return warehousetRepository.findAll();
    } catch (Exception e) {
      log.error("@EntityServiceImpl.saveProduct error:", e);
    }
    return null;
  }

  @Override
  public Optional<Product> findProductById(Integer id) {
    try {
      return productRepository.findById(id);
    } catch (Exception e) {
      log.error("@EntityServiceImpl.saveProduct error:", e);
    }
    return Optional.empty();
  }

  @Override
  public Optional<Warehouse> findWarehouseById(Integer id) {
    try {
      return warehousetRepository.findById(id);
    } catch (Exception e) {
      log.error("@EntityServiceImpl.saveProduct error:", e);
    }
    return Optional.empty();
  }
}
