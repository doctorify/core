package doctorify.core.patient;

import doctorify.core.person.Person;

public class Patient extends Person {
    Double height;
    Double weight;

    public Patient(String id) {
        super(id);
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
