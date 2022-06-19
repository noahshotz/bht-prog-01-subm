import student.Student;

public class Main {

    public static void main(String[] args) {
        
        Student s1 = new Student("John", "Doe", "Doestreet", "42", "12212", "Fancytown", "2323232", MEDIENINFORMATIK);
        Student s2 = new Student("Bessie", "Clemente", "Wilson Avenue", "40", "75081", "Texas", "63453",MEDIENINFORMATIK);
        
        Tester.testRender(new Student[] { s1 });
        
        System.out.println("--------------------------------------");
        
        Tester.testRender(new Student[] { s1, s2 });
    }
}