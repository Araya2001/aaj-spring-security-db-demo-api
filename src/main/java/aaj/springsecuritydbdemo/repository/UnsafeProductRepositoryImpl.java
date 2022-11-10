package aaj.springsecuritydbdemo.repository;

import aaj.springsecuritydbdemo.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
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
    String sql = "SELECT * from product where warehouse_id = " + warehouseId;
    Query query = em.createNativeQuery(sql, Product.class);
    return (List<Product>) query.getResultList();
  }

  @Override
  public List<Product> findAllByWarehousePotentiallyUnsafe(@Param("warehouseId") Integer warehouseId) {
    String jpql = """
        SELECT p FROM Product p WHERE p.warehouse.id = :id
        """;
    TypedQuery<Product> query = em.createQuery(jpql, Product.class).setParameter("id", warehouseId);
    return query.getResultList();
  }
}
