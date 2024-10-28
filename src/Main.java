import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create instances and test the implementation

        // Create a FullName instance
        FullName fullName = new FullName();
        fullName.setFirstName("John");
        fullName.setMiddleName("H.");
        fullName.setLastName("Doe");

        // Create an Address instance
        Address address = new Address();
        address.setStreet("123 Main St");
        address.setCity("Springfield");
        address.setState("IL");
        address.setPostalCode("62701");
        address.setCountry("USA");

        // Create a Phone instance
        Phone phone = new Phone();
        phone.setCountryCode("+1");
        phone.setAreaCode("217");
        phone.setNumber("5551234");

        // Create a Patient instance
        Patient patient = new Patient();
        patient.setId("P001");
        patient.setName(fullName);
        patient.setGender(Gender.MALE);
        patient.setBirthDate(new Date(90, 1, 1)); // Date(year, month, day) - deprecated
        patient.setAccepted(new Date());
        patient.setSickness(new History());
        patient.setPrescriptions(new ArrayList<>());
        patient.setAllergies(new ArrayList<>());
        patient.setSpecialReqs(new ArrayList<>());

        // Print patient details
        System.out.println("Patient ID: " + patient.getId());
        System.out.println("Patient Name: " + patient.getName().getFirstName() + " " +
                patient.getName().getMiddleName() + " " + patient.getName().getLastName());
        System.out.println("Patient Gender: " + patient.getGender());
        System.out.println("Patient BirthDate: " + patient.getBirthDate());
    }
}
