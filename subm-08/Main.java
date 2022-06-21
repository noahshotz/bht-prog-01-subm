import student.Student;
import student.StudyCourse;


public class Main {

    public static void main(String[] args) {

        Tester tester = new Tester();
        
        Student s1 = new Student("John", "Doe", "Doestreet", "42", "12212", "Fancytown", "2323232", studycourse.MEDIENINFORMATIK);
        Student s2 = new Student("Bessie", "Clemente", "Wilson Avenue", "40", "75081", "Texas", "63453", studycourse.MEDIENINFORMATIK);
        
        tester.testRender(new Student[] { s1 });
        
        System.out.println("--------------------------------------");
        
        //Tester.testRender(new Student[] { s1, s2 });
    }
}