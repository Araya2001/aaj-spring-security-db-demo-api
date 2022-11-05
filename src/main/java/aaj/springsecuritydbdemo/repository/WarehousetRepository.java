package aaj.springsecuritydbdemo.repository;

import aaj.springsecuritydbdemo.domain.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehousetRepository extends JpaRepository<Warehouse, Integer> {
}
