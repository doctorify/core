package doctorify.core.doctor;

import doctorify.core.person.Person;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Date;

@Document(collection = "doctors")
public class Doctor extends Person {
    List<String> specializationIds;
    Date practiseStartDate;
    Double consultationFee;

    public Double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(Double consultationFee) {
        this.consultationFee = consultationFee;
    }

    public Date getPractiseStartDate() {
        return practiseStartDate;
    }

    public void setPractiseStartDate(Date practiseStartDate) {
        this.practiseStartDate = practiseStartDate;
    }

    public List<String> getSpecializationIds() {
        return specializationIds;
    }

    public void setSpecializationIds(List<String> specializationIds) {
        this.specializationIds = specializationIds;
    }
}
