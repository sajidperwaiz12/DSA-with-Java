public class Student {
    public String name;
    // final data members can be initialized as soon as they are declared
    private final int rollNumber;

    public Student(String n, int rn) {
        name = n;
        rollNumber = rn;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}
