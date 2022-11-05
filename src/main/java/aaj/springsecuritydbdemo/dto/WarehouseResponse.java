package aaj.springsecuritydbdemo.dto;

import aaj.springsecuritydbdemo.domain.Warehouse;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class WarehouseResponse extends AbstractResponse implements Serializable {
  @SerializedName("warehouse")
  private List<Warehouse> warehouse;

  public List<Warehouse> getWarehouse() {
    return warehouse;
  }

  public void setWarehouse(List<Warehouse> warehouse) {
    this.warehouse = warehouse;
  }
}
