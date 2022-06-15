package doctorify.core.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorRestController {
  @Autowired private DoctorService doctorService;

  @GetMapping(value = "")
  public List<Doctor> getAll() {
    return doctorService.getAll();
  }

  @GetMapping(value = "/{id}")
  public Doctor getById(@PathVariable String id) {
    return doctorService.getById(id);
  }

  @PostMapping(value = "")
  public Doctor create(@RequestBody Doctor doctor) {
    return doctorService.create(doctor);
  }

  @PutMapping(value = "/{id}")
  public Doctor update(@PathVariable String id, @RequestBody Doctor doctor) {
    /** If we don't set the id here, then it assigns a new id. Is this the right place to do it ? */
    doctor.setId(id);
    return doctorService.update(doctor);
  }

  @DeleteMapping(value = "/{id}")
  public void delete(@PathVariable String id) {
    doctorService.delete(id);
  }
}
