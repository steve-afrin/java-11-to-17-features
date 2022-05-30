package org.example;

import org.example.model.Address;
import org.example.model.Name;
import org.example.model.Person;
import org.example.model.PhoneNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class RecordsTest {
  @Test
  @DisplayName("Validate equals(Object) implementation on record classes")
  void testEquality() {
    final var person1 = this.buildPerson();
    final var person2 = this.buildPerson();
    final var newPhone = new PhoneNumber("mobile", "801", "555", "1235");
    final var person3 = new Person(person1.name(), person1.age(), newPhone, person1.address());

    assertEquals(person1, person2);
    assertNotEquals(person1, person3);
    assertNotEquals(person2, person3);
  }

  @Test
  @DisplayName("Validate hashCode() implementation on record classes")
  void testHashCode() {
    final var person1 = this.buildPerson();
    final var person2 = this.buildPerson();
    final var newPhone = new PhoneNumber("mobile", "801", "555", "1235");
    final var person3 = new Person(person1.name(), person1.age(), newPhone, person1.address());

    assertEquals(person1.hashCode(), person2.hashCode());
    assertNotEquals(person1.hashCode(), person3.hashCode());
    assertNotEquals(person2.hashCode(), person3.hashCode());
  }

  @Test
  @DisplayName("Validate toString() implementation on record classes")
  void testToString() {
    final var person = this.buildPerson();
    final var expectedString = "Person[name=Name[title=Mr., first=Joe, middle=null, last=Smith, suffix=null], "
        + "age=32, phone=801-555-1234 (mobile), address=Address[street1=123 Smith Ave., street2=null, "
        + "unit=Apt. 215, city=South Jordan, state=UT, zipCode=84095-1234]]";
    assertEquals(expectedString, person.toString());
  }

  private Person buildPerson() {
    final var address = new Address("123 Smith Ave.", null, "Apt. 215", "South Jordan", "UT", "84095-1234");
    final var phone = new PhoneNumber("mobile", "801", "555", "1234");
    final var name = new Name("Mr.", "Joe", null, "Smith", null);
    return new Person(name, 32, phone, address);
  }
}
