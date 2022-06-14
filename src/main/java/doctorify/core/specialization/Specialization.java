package doctorify.core.specialization;

public class Specialization {
    Long id;
    String name;

    public Specialization(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
