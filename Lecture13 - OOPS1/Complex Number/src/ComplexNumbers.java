public class ComplexNumbers {
    private int real;
    private int imaginary;

    public ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public int getReal() {
        return this.real;
    }

    public int getImaginary() {
        return this.imaginary;
    }

    public void print() {
        if (this.imaginary < 0) {
            System.out.println(this.real + " - i" + (this.imaginary * - 1));
        } else {
            System.out.println(this.real + " + i" + this.imaginary);
        }
    }

    public void add(ComplexNumbers c) {
        this.real += c.real;
        this.imaginary += c.imaginary;
    }

    public void multiply(ComplexNumbers c) {
        int r = this.real * c.real - this.imaginary * c.imaginary;
        this.imaginary = this.real * c.imaginary + this.imaginary * c.real;
        this.real = r;
    }

    public static ComplexNumbers add(ComplexNumbers c1, ComplexNumbers c2) {
        int newReal = c1.real + c2.real;
        int newImaginary = c1.imaginary + c2.imaginary;
        ComplexNumbers c = new ComplexNumbers(newReal, newImaginary);
        return c;
    }

    public ComplexNumbers conjugate() {
        int newReal = this.real;
        int newImaginary = this.imaginary * -1;
        ComplexNumbers c = new ComplexNumbers(newReal, newImaginary);
        return c;
    }
}
