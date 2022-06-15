public class Student {

    private String fullName;
    private String fullAddress;
    private String fullZipCodeAndCity;

    public Student(String prename, String surname, String street, String houseNumber, String zipCode, String city,
            String registrationNumber, String course) {
        fullName = prename + " " + surname;
        fullAddress = street + " " + houseNumber;
        fullZipCodeAndCity = zipCode + " " + city;
    }

    public String getFullName() {
        return fullName;
    }
    public String getFullAddress() {
        return fullAddress;
    }
    public String getFullZipCodeAndCity() {
        return fullZipCodeAndCity;
    }

}