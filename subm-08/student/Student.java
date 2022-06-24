package student;

public class Student {

    private String prename, surname, street, houseNumber, zipCode, city, registrationNumber;
    private int age;
    private StudyCourse course;
    private Course[] bookedCourses;
    
    public Student(String prename, String surname, int age, String street, String houseNumber, String zipCode, String city, String registrationNumber, StudyCourse course, Course[] bookedCourses) {
        this.prename = prename;
        this.surname = surname;
        this.age = age;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.city = city;
        this.registrationNumber = registrationNumber;
        this.course = course;
        this.bookedCourses = bookedCourses;
    }
    public String getName(){
        return prename + " " + surname;
    }
    public int getAge(){
        return age;
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
    public StudyCourse getStudyCourse(){
        return course;
    }
    public String toString() {
        return prename + " " + surname + " " + age + " " + "(" + registrationNumber + ")" + "," + " " + course;
    }

    public Course[] getCourse(){
        return bookedCourses;
    }
}