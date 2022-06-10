public class Envelope {

    int width = 60;
    int padding = 3;
    String spaceChar = " ";
    String borderHorizontalChar = "-";
    String borderVerticalChar = "|";
    String cornerChar = "+";
    String lineBreak = "\n";

    String fromName = "BHT Berlin";
    String fromAddress = "Luxemburger Str. 10";
    String fromZipCodeAndCity = "13353 Berlin";
    
    public void printEnvelope(Student[] toStudents) {
        System.out.println("test @ envelope");
    }
}