import java.util.List;

public class Hospital {
    private String id;
    private String name;
    private Address address;
    private Phone phone;
    private List<Department> departments;

    public Hospital() {}

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }
    public Phone getPhone() { return phone; }
    public void setPhone(Phone phone) { this.phone = phone; }
    public List<Department> getDepartments() { return departments; }
    public void setDepartments(List<Department> departments) { this.departments = departments; }
}
