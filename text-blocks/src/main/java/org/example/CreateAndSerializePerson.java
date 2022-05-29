package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.Address;
import org.example.model.Name;
import org.example.model.Person;
import org.example.model.PhoneNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Creates a {@link Person} object and serializes it to JSON. The log output
 * of this program is able to be used as input to the two test classes:
 *
 * <ul>
 *   <li>PersonalDeserializationTest</li>
 *   <li>PreTextBlockTest</li>
 * </ul>
 */
public final class CreateAndSerializePerson {
  private static final Logger LOG = LoggerFactory.getLogger(CreateAndSerializePerson.class);
  private static final ObjectMapper MAPPER = new ObjectMapper();

  private CreateAndSerializePerson() {
  }

  public static void main(final String[] args) {
    final var address = Address.builder()
        .street1("123 Smith Ave.")
        .unit("Apt. 215")
        .city("South Jordan")
        .state("UT")
        .zipCode("84095-1234")
        .build();
    final var phone = PhoneNumber.builder()
        .areaCode("801")
        .prefix("555")
        .number("1234")
        .type("mobile")
        .build();
    final var name = Name.builder()
        .first("Joe")
        .last("Smith")
        .title("Mr.")
        .build();
    final var person = Person.builder()
        .name(name)
        .age(32)
        .home(address)
        .phone(phone)
        .build();

    try {
      final var serializedPerson = MAPPER.writeValueAsString(person);
      LOG.info("{}", serializedPerson);
    } catch (JsonProcessingException ex) {
      LOG.warn("Failed to serialize Person object", ex);
    }
  }
}
