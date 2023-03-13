package HUONG7;

public class Owner {
    private String idNumber;
    private String name;
    private String email;
    
    public Owner(String idNumber, String name, String email) {
        this.idNumber = idNumber;
        this.name = name;
        this.email = email;
    }
    
    public String getIdNumber() {
        return idNumber;
    }
    
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}
