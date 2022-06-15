package doctorify.core.person;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

class Contact {
  @Getter @Setter private String email;
  @Getter @Setter private String phone;
}

class Address {
  @Getter @Setter private String locality;
  @Getter @Setter private String city;
  @Getter @Setter private String state;
  @Getter @Setter private String country;
  @Getter @Setter private String zipCode;
}

enum Gender {
  MALE,
  FEMALE
}

public class Person {
  @Getter @Setter private String id;
  @Getter @Setter private String name;
  @Getter @Setter private Date dateOfBirth;
  @Getter @Setter private Gender gender;
  @Getter @Setter private Contact contact;
  @Getter @Setter private Address address;
}
