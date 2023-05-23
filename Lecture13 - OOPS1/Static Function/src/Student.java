public class Student {
    public String name;
    private final int rollNumber;
    private static int numStudents;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        numStudents++;
    }

    public static int getNumStudents() {
        return numStudents;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}