package doctorify.core.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

/** Rest controller for doctors. */
@RestController
@RequestMapping("/doctors")
public class DoctorRestController {
  /** Instance of DoctorService. */
  @Autowired private DoctorService doctorService;

  /**
   * Get all the doctors.
   *
   * @return A list of all the doctors present
   */
  @GetMapping(value = "")
  public List<Doctor> getAll() {
    return doctorService.getAll();
  }

  /**
   * Get details for a given doctor.
   *
   * @param id The doctor id
   * @return The doctor
   */
  @GetMapping(value = "/{id}")
  public Doctor getById(@PathVariable final String id) {
    return doctorService.getById(id);
  }

  /**
   * Create a new doctor.
   *
   * @param doctor The doctor details
   * @return The newly created doctor
   */
  @PostMapping(value = "")
  public Doctor create(@RequestBody final Doctor doctor) {
    return doctorService.create(doctor);
  }

  /**
   * Update the details of a given doctor.
   *
   * @param id The doctor id
   * @param doctor The details to update
   * @return The updated doctor
   */
  @PutMapping(value = "/{id}")
  public Doctor update(@PathVariable final String id, @RequestBody final Doctor doctor) {
    /** If we don't set the id here, then it assigns a new id. Is this the right place to do it ? */
    doctor.setId(id);
    return doctorService.update(doctor);
  }

  /**
   * Delete a given doctor.
   *
   * @param id The doctor id
   */
  @DeleteMapping(value = "/{id}")
  public void delete(@PathVariable final String id) {
    doctorService.delete(id);
  }
}
