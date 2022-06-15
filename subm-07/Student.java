public class Student {

    private String prename;
    private String surname;
    private String street;
    private String houseNumber;
    private String zipCode;
    private String city;
    private String registrationNumber;
    private String course;
    
    public Student(String prename, String surname, String street, String houseNumber, String zipCode, String city, String registrationNumber, String course) {
        this.prename = prename;
        this.surname = surname;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.city = city;
        this.registrationNumber = registrationNumber;
        this.course = course;
    }
    
    public String getName(){
        return prename + " " + surname;
    }
    public String getAddress(){
        return street + " " + houseNumber;
    }
    public String getZipCodeAndCity(){
        return zipCode + " " + city;
    }
    public String getRegistrationNumber(){
        return registrationNumber;
    }
    public String getCourse(){
        return course;
    }
    public String toString() {
        return prename + " " + surname + " " + "(" + registrationNumber + ")" + "," + " " + course;
    }
    
}