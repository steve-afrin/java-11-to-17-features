package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class PersonDeserializationTest {
  private static final ObjectMapper MAPPER = new ObjectMapper();

  // Example String constant using the new text block feature for
  // the JSON payload to be deserialized.
  private static final String PERSON_JSON = """
          {
            "name": {
              "title": "Mr.",
              "first": "Joe",
              "last": "Smith"
            },
            "age": 32,
            "phone": {
              "type": "mobile",
              "areacode": "801",
              "prefix": "555",
              "number": "1234"
            },
            "address": {
              "street_1": "123 Smith Ave.",
              "unit": "Apt. 215",
              "city": "South Jordan",
              "state": "UT",
              "zipcode": "84095-1234"
            }
          }
      """;

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

  @Test
  @DisplayName("Test indent() on a text block")
  void testIndent() {
    System.out.println("Before using the indent() method ...");
    System.out.printf("\"\"\"\n%s\"\"\"\n", PERSON_JSON);
    System.out.println("\nAfter the invocation of indent(-5) ...");
    System.out.printf("\"\"\"\n%s\"\"\"\n", PERSON_JSON.indent(-5));
    System.out.println("\nAfter the invocation of indent(20) ...");
    System.out.printf("\"\"\"\n%s\"\"\"\n", PERSON_JSON.indent(20));
  }
}
