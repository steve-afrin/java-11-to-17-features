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
public class Person {
  @JsonProperty("name")
  Name name;

  @JsonProperty("age")
  Integer age;

  @JsonProperty("phone")
  PhoneNumber phone;

  @JsonProperty("address")
  Address home;
}
