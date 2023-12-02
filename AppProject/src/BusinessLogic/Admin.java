package BusinessLogic;
import java.util.ArrayList;
import java.util.List;


public class Admin  extends Customer{

		
	private String firstName;
    private String lastName;
    private String address;
    private String zip;
    private String state;
    private String username;
    private String password;
    private String email;
    private String SSN;
    private String securityQuestion;
    private String securityAnswer;

    public Admin() {
        // Default constructor
    }

    // Additional constructor for Admin class
    public Admin(String firstName, String lastName, String address, String zip, String state,
                 String username, String password, String email, String SSN, String securityQuestion,
                 String securityAnswer) {
        super(); // Call the constructor of the superclass (Customer)
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.zip = zip;
        this.state = state;
        this.username = username;
        this.password = password;
        this.email = email;
        this.SSN = SSN;
        this.securityQuestion = securityQuestion;
        this.securityAnswer = securityAnswer;
    }

    // Method for adding a new flight to the system
    public void addFlight(Flight newFlight) {
        // Implement logic to add a new flight to the database
        // Example: FlightDatabase.addFlight(newFlight);
    }

    // Method for updating an existing flight in the system
    public void updateFlight(Flight updatedFlight) {
        // Implement logic to update an existing flight in the database
        // Example: FlightDatabase.updateFlight(updatedFlight);
    }

    // Method for deleting an existing flight from the system
    public void deleteFlight(String flightID) {
        // Implement logic to delete an existing flight from the database
        // Example: FlightDatabase.deleteFlight(flightID);
    }

    // Method to get a list of all flights in the system
    public List<Flight> getAllFlights() {
        // Implement logic to retrieve all flights from the database
        // Example: return FlightDatabase.getAllFlights();
        return null; // Replace with actual logic
    }
    
    // Add any additional methods or logic specific to the Admin class
}

