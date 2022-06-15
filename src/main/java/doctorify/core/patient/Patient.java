package doctorify.core.patient;

import doctorify.core.person.Person;
import lombok.Getter;
import lombok.Setter;

public class Patient extends Person {
  @Getter @Setter Double height;
  @Getter @Setter Double weight;
}
