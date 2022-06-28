package student;

public class Course {

    private String name;
    private String teacher;

    public Course(String name, String teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String name(){
        return name;
    }
    public String teacher(){
        return teacher;
    }
    
}