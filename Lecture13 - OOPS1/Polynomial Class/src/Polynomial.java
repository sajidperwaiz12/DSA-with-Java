public class Polynomial {
    DynamicArray poly;

    public Polynomial() {
        poly = new DynamicArray();
    }

    public void setCoefficient(int degree, int coeff){
        poly.set(degree, coeff);
    }

    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree.
    public void print(){
        for (int i = 0; i < poly.size(); i++) {
            if (poly.get(i) == 0) {
                continue;
            }
            System.out.print(poly.get(i) + "x" + i + " ");
        }
        System.out.println();
    }

    public Polynomial add(Polynomial p){
        Polynomial p1 = new Polynomial();
        int max = poly.size() > p.poly.size() ? poly.size() : p.poly.size();
        for (int i = 0; i < max; i++) {
            p1.setCoefficient(i, poly.get(i) + p.poly.get(i));
        }
        return p1;
    }

    public Polynomial subtract(Polynomial p){
        Polynomial p1 = new Polynomial();
        int max = poly.size() > p.poly.size() ? poly.size() : p.poly.size();
        for (int i = 0; i < max; i++) {
            p1.setCoefficient(i, poly.get(i) - p.poly.get(i));
        }
        return p1;
    }

    public Polynomial multiply(Polynomial p){
        Polynomial p1 = new Polynomial();
        for (int i = 0; i < poly.size(); i++) {
            int prod = 0;
            for (int j = 0; j < p.poly.size(); j++) {
                prod = p1.poly.get(i + j);
                prod = prod + poly.get(i) * p.poly.get(j);
                p1.setCoefficient(i + j, prod);
            }
        }
        return  p1;
    }
}
