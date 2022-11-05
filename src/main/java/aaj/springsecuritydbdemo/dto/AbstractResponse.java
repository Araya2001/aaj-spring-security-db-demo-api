package aaj.springsecuritydbdemo.dto;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public abstract class AbstractResponse implements Serializable {
  @SerializedName("status")
  protected String status;
  @SerializedName("message")
  protected String message;
  @SerializedName("result")
  protected boolean result;

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public boolean isResult() {
    return result;
  }

  public void setResult(boolean result) {
    this.result = result;
  }

  @Override
  public String toString() {
    return "Response{" +
        "status='" + status + '\'' +
        ", message='" + message + '\'' +
        ", result=" + result +
        '}';
  }
}
