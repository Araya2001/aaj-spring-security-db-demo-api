package aaj.springsecuritydbdemo.repository;

import aaj.springsecuritydbdemo.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UnsafeProductRepositoryImpl implements UnsafeProductRepository {
  private final EntityManager em;

  @Autowired
  public UnsafeProductRepositoryImpl(EntityManager em) {
    this.em = em;
  }

  @Override
  public List<Product> findAllByWarehouseUnsafe(String warehouseId) {
    String sql = "SELECT * from product where warehouse = " + warehouseId;
    Query query = em.createNativeQuery(jpql, Product.class);
    return (List<Product>) query.getResultList();
  }
}
