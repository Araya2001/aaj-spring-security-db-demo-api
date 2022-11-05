package aaj.springsecuritydbdemo.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Warehouse extends BaseEntity {
  protected Integer id;
  private String region;
  private String name;

  @Basic
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }
  @Basic
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Warehouse warehouse = (Warehouse) o;
    return Objects.equals(id, warehouse.id) && Objects.equals(region, warehouse.region) && Objects.equals(name, warehouse.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), id, region, name);
  }
}
