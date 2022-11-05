package aaj.springsecuritydbdemo.controller;

import aaj.springsecuritydbdemo.dto.ProductResponse;
import aaj.springsecuritydbdemo.service.EntityService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Log4j2
@RestController
@ControllerAdvice
@RequestMapping("/v1/unsafe-entity")
public class UnsafeEntityController {
  private final EntityService entityService;

  @Autowired
  public UnsafeEntityController(EntityService entityService) {
    this.entityService = entityService;
  }

  @GetMapping(value = "/product/by-warehouse", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<ProductResponse> doGetByWarehouse(@RequestParam(required = false, name = "id") String id, HttpServletRequest httpServletRequest) {
    log.warn("NEW REQUEST - HTTP GET request on resource mapping \"v1/unsafe-entity/product/by-warehouse " + httpServletRequest.getHeader("X-FORWARDED-FOR"));
    HttpStatus status = HttpStatus.OK;
    ProductResponse productResponse = new ProductResponse();
    productResponse.setMessage("");
    productResponse.setResult(true);
    productResponse.setStatus("OK");
    productResponse.setProduct(entityService.findAllByWarehouseUnsafe(id));
    if (productResponse.getProduct() == null) {
      productResponse.setMessage("INTERNAL SERVER ERROR");
      productResponse.setResult(false);
      productResponse.setStatus("ERROR");
      status = HttpStatus.INTERNAL_SERVER_ERROR;
    }
    return new ResponseEntity<>(productResponse, status);
  }
}
