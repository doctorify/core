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

    List<Doctor> getAll() {
        return doctorRepository.findAll();
    }

    public Doctor update(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public Doctor create(Doctor doctor) {
        return doctorRepository.insert(doctor);
    }

    public Doctor getById(String id) { return doctorRepository.findById(id).orElse(null); }

    public void delete(String id) {
        doctorRepository.deleteById(id);
    }
}

