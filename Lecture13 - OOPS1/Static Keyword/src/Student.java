public class Student {
    public String name;
    private final int rollNumber;
    public static int numStudents;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        numStudents++;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}
