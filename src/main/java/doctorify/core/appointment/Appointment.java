package doctorify.core.appointment;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Appointment {
  @Getter @Setter String id;
  @Getter @Setter String doctorId;
  @Getter @Setter String patientId;
  @Getter @Setter Date startTime;
  @Getter @Setter Date endTime;
}
