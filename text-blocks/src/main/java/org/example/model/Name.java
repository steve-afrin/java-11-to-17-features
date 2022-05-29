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
public class Name {
  @JsonProperty("title")
  String title;

  @JsonProperty("first")
  String first;

  @JsonProperty("middle")
  String middle;

  @JsonProperty("last")
  String last;

  @JsonProperty("suffix")
  String suffix;
}
