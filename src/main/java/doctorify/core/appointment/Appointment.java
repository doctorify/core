package doctorify.core.appointment;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Appointment {
  /** Appointment ID. */
  @Getter @Setter private String id;
  /** Doctor ID. */
  @Getter @Setter private String doctorId;
  /** Patient ID. */
  @Getter @Setter private String patientId;
  /** Start time of the appointment. */
  @Getter @Setter private Date startTime;
  /** End time of the appointment. */
  @Getter @Setter private Date endTime;
}
