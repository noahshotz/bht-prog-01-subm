import student.*;

public class Main {

    public static void main(String[] args) {

        Student student = new Student(
            "John",
            "Doe",
            "Doestreet",
            "42",
            "12212",
            "Fancytown",
            "2323232",
            19
        );

        System.out.println("Name: " + student.getName());
        System.out.println("Address: " + student.getAddress());
        System.out.println("City: " + student.getZipCodeAndCity());
        System.out.println("Age: " + student.getAge());
        System.out.println("Reg: " + student.getRegistrationNumber());
        System.out.println("Course: " + student.getStudyCourse()); 
        
        System.out.println("toString: " + student.toString()); 

        System.out.println(student.getCourse());
        
        System.out.println("--------------");

        System.out.println(student.getBookedCoursesCount());
    }
}