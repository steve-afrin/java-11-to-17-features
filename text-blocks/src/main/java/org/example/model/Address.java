package org.example.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;

@Value
@Builder
@Jacksonized
@JsonInclude(NON_NULL)
public class Address {
  @JsonProperty("street_1")
  String street1;

  @JsonProperty("street_2")
  String street2;

  @JsonProperty("unit")
  String unit;

  @JsonProperty("city")
  String city;

  @JsonProperty("state")
  String state;

  @JsonProperty("zipcode")
  String zipCode;
}
