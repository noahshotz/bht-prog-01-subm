package student;

public class Student {

    private String prename, surname, street, houseNumber, zipCode, city, registrationNumber;
    private StudyCourse studyCourse;
    private int age;
    private Course[] bookedCourses;

    // constructor 1
    public Student(String prename, String surname, String street, String houseNumber, String zipCode, String city,
            String registrationNumber) {
        this.prename = prename;
        this.surname = surname;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.city = city;
        this.registrationNumber = registrationNumber;
    }

    // constructor 2
    public Student(String prename, String surname, String street, String houseNumber, String zipCode, String city,
            String registrationNumber, int age) {
        // do whatever
        this.prename = prename;
        this.surname = surname;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.city = city;
        this.registrationNumber = registrationNumber;
        this.age = age;
    }

    // constructor 3 (main-constructor)
    public Student(String prename, String surname, String street, String houseNumber, String zipCode, String city,
            String registrationNumber, StudyCourse studyCourse, int age) {
        // do whatever
        bookedCourses = new Course[5];

        this.prename = prename;
        this.surname = surname;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.city = city;
        this.registrationNumber = registrationNumber;
        this.age = age;
        this.studyCourse = studyCourse;
    }

    // book courses method
    public void bookCourse(Course course) {
        for (int i = 0; i < bookedCourses.length; i++) {
            if (bookedCourses[i] == null && i < 5) {
                bookedCourses[i] = course;
            } else {
                // skip and do nothing
            }
        }
    }

    // count courses method
    public int getBookedCoursesCount() {
        int count = 0;
        for (int i = 0; i < bookedCourses.length; i++) {
            if (bookedCourses[i] != null) {
                count++;
            }
        }
        return count;
    }

    // getters
    // for basic data
    public String getName() {
        return prename + " " + surname;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return street + " " + houseNumber;
    }
    public String getZipCodeAndCity() {
        return zipCode + " " + city;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public StudyCourse getStudyCourse() {
        return studyCourse;
    }

    public Course[] getCourse() {
        return bookedCourses;
    }

    // setters
    // for basic data
    void setName(String prename, String surname) {
		this.prename = prename;
        this.surname = surname;
	}
    void setAge(int age) {
		this.age = age;
	}
    void setAddress(String street, String houseNumber) {
		this.street = street;
        this.houseNumber = houseNumber;
	}
    void setZipCodeAndCity(String zipCode, String street) {
        this.zipCode = zipCode;
		this.street = street;
	}
    void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    void setStudyCourse(StudyCourse studyCourse) {
        this.studyCourse = studyCourse;
    }

    public String toString() {
        return prename + " " + surname + " " + age + " " + "(" + registrationNumber + ")" + "," + " " + studyCourse;
    }

}