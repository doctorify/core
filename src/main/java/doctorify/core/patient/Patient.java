package doctorify.core.patient;

import doctorify.core.person.Person;
import lombok.Getter;
import lombok.Setter;

public class Patient extends Person {
  @Getter @Setter private Double height;
  @Getter @Setter private Double weight;
}
