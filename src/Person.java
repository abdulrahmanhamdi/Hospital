import java.util.Date;

public class Person {
    private String title;
    private String givenName;
    private String middleName;
    private String familyName;
    private FullName name;
    private Date birthDate;
    private Gender gender;
    private Address homeAddress;
    private Phone phone;

    public Person() {}

    // Getters and Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getGivenName() { return givenName; }
    public void setGivenName(String givenName) { this.givenName = givenName; }
    public String getMiddleName() { return middleName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }
    public String getFamilyName() { return familyName; }
    public void setFamilyName(String familyName) { this.familyName = familyName; }
    public FullName getName() { return name; }
    public void setName(FullName name) { this.name = name; }
    public Date getBirthDate() { return birthDate; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }
    public Gender getGender() { return gender; }
    public void setGender(Gender gender) { this.gender = gender; }
    public Address getHomeAddress() { return homeAddress; }
    public void setHomeAddress(Address homeAddress) { this.homeAddress = homeAddress; }
    public Phone getPhone() { return phone; }
    public void setPhone(Phone phone) { this.phone = phone; }
}
