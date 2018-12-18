package com.dido.mms.cws.api;

public class QuoteDTO {

  private String type;
  private ValueDTO value;

  public QuoteDTO() {
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ValueDTO getValue() {
    return value;
  }

  public void setValue(ValueDTO value) {
    this.value = value;
  }
}
