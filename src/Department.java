import java.util.List;

public class Department {
    private String name;
    private List<Staff> staffMembers;

    public Department() {}

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<Staff> getStaffMembers() { return staffMembers; }
    public void setStaffMembers(List<Staff> staffMembers) { this.staffMembers = staffMembers; }
}
