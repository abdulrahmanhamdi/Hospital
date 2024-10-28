import java.util.List;

public class OperationsStaff extends Staff {
    private List<Patient> patients;

    public OperationsStaff() {}

    // Getters and Setters
    public List<Patient> getPatients() { return patients; }
    public void setPatients(List<Patient> patients) { this.patients = patients; }
}
