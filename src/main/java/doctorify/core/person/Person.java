package doctorify.core.person;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

class Contact {
  @Getter @Setter String email;
  @Getter @Setter String phone;
}

class Address {
  @Getter @Setter String locality;
  @Getter @Setter String city;
  @Getter @Setter String state;
  @Getter @Setter String country;
  @Getter @Setter String zipCode;
}

enum Gender {
  MALE,
  FEMALE
}

public class Person {
  @Getter @Setter String id;
  @Getter @Setter String name;
  @Getter @Setter Date dateOfBirth;
  @Getter @Setter Gender gender;
  @Getter @Setter Contact contact;
  @Getter @Setter Address address;
}
