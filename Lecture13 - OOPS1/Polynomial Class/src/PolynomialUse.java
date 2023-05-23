public class PolynomialUse {
    public static void main(String[] args) {
        Polynomial p1 = new Polynomial();
        p1.setCoefficient(0, 3);
        p1.setCoefficient(2, 2);
        p1.print();

        Polynomial p2 = new Polynomial();
        p2.setCoefficient(0, 3);
        p2.setCoefficient(2, 2);
        p2.setCoefficient(2, 5);
        p2.setCoefficient(1, 4);
        p2.print();

        Polynomial p3 = p1.add(p2);
        p1.print();
        p2.print();
        p3.print();

        Polynomial p4 = p3.subtract(p2);
        p2.print();
        p3.print();
        p4.print();

        Polynomial p5 = p4.multiply(p3);
        p3.print();
        p4.print();
        p5.print();
    }
}
