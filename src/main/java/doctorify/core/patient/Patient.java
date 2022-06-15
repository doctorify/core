package doctorify.core.patient;

import doctorify.core.person.Person;
import lombok.Getter;
import lombok.Setter;

public class Patient extends Person {
  /** Height of the patient */
  @Getter @Setter private Double height;
  /** Weight of the patient */
  @Getter @Setter private Double weight;
}
