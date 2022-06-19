public class Tester {

    public static void testRenderName(String fromName) {
        System.out.print("Test render:" + fromName);
    }

    public void testRender(Student[] toStudents){
        for(int i = 0; i < toStudents.length; i++){    
            testRenderName(toStudents[i].getName());
        }
    }
    
}