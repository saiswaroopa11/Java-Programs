class Student {
    private String name;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John Doe");
        student.setMarks(85);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Marks: " + student.getMarks());
    }
}