package Opps.Encapsulation;

class Credential {
    private String Username;
    private String Password;

    // --- Corrected Getters and Setters ---

    // Getter for Username
    public String getUsername() {
        return this.Username;
    }

    // Setter for Username
    public void setUsername(String username) {
        this.Username = username;
    }

    // Getter for Password
    public String getPassword() {
        return this.Password;
    }

    // Setter for Password (fixed with 'this')
    public void setPassword(String Password) {
        this.Password = Password;
    }
}

public class Mainclass2 {
    public static void main(String[] args) {
        Credential c = new Credential();
        
        // These calls now work correctly with the fixed methods
        c.setUsername("shreyashk");
        c.setPassword("ghjk5467gbh567");
        
        System.out.println("Username: " + c.getUsername());
        System.out.println("Password: " + c.getPassword());
    }
}