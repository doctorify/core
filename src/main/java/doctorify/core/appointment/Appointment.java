package doctorify.core.appointment;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Appointment {
  @Getter @Setter private String id;
  @Getter @Setter private String doctorId;
  @Getter @Setter private String patientId;
  @Getter @Setter private Date startTime;
  @Getter @Setter private Date endTime;
}
