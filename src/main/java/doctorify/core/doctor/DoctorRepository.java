package doctorify.core.doctor;

import org.springframework.data.mongodb.repository.MongoRepository;

import javax.print.Doc;
import java.util.List;

public interface DoctorRepository extends MongoRepository<Doctor, Long> {
}
