package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class PreTextBlockTest {
  private static final ObjectMapper MAPPER = new ObjectMapper();

  // String constant for the JSON to be deserialized represented the
  // old way before text blocks.
  private static final String PERSON_JSON = "{\n"
      + "  \"name\": {\n"
      + "    \"title\": \"Mr.\",\n"
      + "    \"first\": \"Joe\",\n"
      + "    \"last\": \"Smith\"\n"
      + "  },\n"
      + "  \"age\": 32,\n"
      + "  \"phone\": {\n"
      + "    \"type\": \"mobile\",\n"
      + "    \"areacode\": \"801\",\n"
      + "    \"prefix\": \"555\",\n"
      + "    \"number\": \"1234\"\n"
      + "  },\n"
      + "  \"address\": {\n"
      + "    \"street_1\": \"123 Smith Ave.\",\n"
      + "    \"unit\": \"Apt. 215\",\n"
      + "    \"city\": \"South Jordan\",\n"
      + "    \"state\": \"UT\",\n"
      + "    \"zipcode\": \"84095-1234\"\n"
      + "  }\n"
      + "}";

  @Test
  void testJsonDeserialization() throws JsonProcessingException {
    final var person = MAPPER.readValue(PERSON_JSON, Person.class);
    // Validate name
    assertEquals("Mr.", person.getName().getTitle());
    assertEquals("Joe", person.getName().getFirst());
    assertEquals("Smith", person.getName().getLast());
    assertNull(person.getName().getMiddle());
    assertNull(person.getName().getSuffix());
    // Validate age
    assertEquals(32, person.getAge());
    // Validate phone number
    assertEquals("mobile", person.getPhone().getType());
    assertEquals("801", person.getPhone().getAreaCode());
    assertEquals("555", person.getPhone().getPrefix());
    assertEquals("1234", person.getPhone().getNumber());
    // Validate address
    assertEquals("123 Smith Ave.", person.getHome().getStreet1());
    assertNull(person.getHome().getStreet2());
    assertEquals("Apt. 215", person.getHome().getUnit());
    assertEquals("South Jordan", person.getHome().getCity());
    assertEquals("UT", person.getHome().getState());
    assertEquals("84095-1234", person.getHome().getZipCode());
  }
}
