package doctorify.core.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorRestController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping(value = "")
    public List<Doctor> getAllDoctors() {
        return doctorService.findAll();
    }

    @PostMapping(value = "")
    public Doctor saveOrUpdateDoctor(@RequestBody Doctor doctor) {
        return doctorService.saveOrUpdateDoctor(doctor);
    }
}
