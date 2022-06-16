package doctorify.core.doctor;

import doctorify.core.person.Person;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Date;

@Document(collection = "doctors")
public class Doctor extends Person {
  /** Specializations that the doctor has. */
  @Getter @Setter private List<String> specializationIds;
  /** Start date of practise. */
  @Getter @Setter private Date practiseStartDate;
  /** Consultation fees. */
  @Getter @Setter private Double consultationFee;
}
