package doctorify.core.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    Doctor findById(String id) {
        return doctorRepository.findById(id).orElse(null);
    }
    List<Doctor> findAll() {
        return doctorRepository.findAll();
    }

    public Doctor saveOrUpdateDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }
}
