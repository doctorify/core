package doctorify.core.appointment;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Appointment {
  /** Appointment Id */
  @Getter @Setter private String id;
  /** Doctor Id */
  @Getter @Setter private String doctorId;
  /** Patient Id */
  @Getter @Setter private String patientId;
  /** Start time of the appointment */
  @Getter @Setter private Date startTime;
  /** End time of the appointment */
  @Getter @Setter private Date endTime;
}
