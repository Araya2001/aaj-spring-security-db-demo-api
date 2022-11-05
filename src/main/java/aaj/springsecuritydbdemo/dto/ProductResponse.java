package aaj.springsecuritydbdemo.dto;

import aaj.springsecuritydbdemo.domain.Product;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ProductResponse extends AbstractResponse implements Serializable {
  @SerializedName("product")
  private List<Product> product;

  public List<Product> getProduct() {
    return product;
  }

  public void setProduct(List<Product> product) {
    this.product = product;
  }
}
