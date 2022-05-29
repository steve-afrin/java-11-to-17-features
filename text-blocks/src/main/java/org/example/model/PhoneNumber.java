package org.example.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@Value
@Builder
@Jacksonized
@JsonInclude(NON_NULL)
public class PhoneNumber {
  @JsonProperty("type")
  String type;

  @JsonProperty("areacode")
  String areaCode;

  @JsonProperty("prefix")
  String prefix;

  @JsonProperty("number")
  String number;

  @Override
  public String toString() {
    return String.format("(%s) %s-%s (%s)", this.areaCode, this.prefix, this.number, this.type);
  }
}
