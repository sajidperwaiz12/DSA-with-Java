public class Student {
    private String name;
    private int rollNumber;

    public Student(String n, int rn) {
        name = n;
        rollNumber = rn;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setRollNumber(int rn) {
        if (rn <= 0) {
            return;
        }
        rollNumber = rn;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}
