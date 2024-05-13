public class Polynomial {
    double[] coefs;
    Polynomial() {
        coefs = new double[]{0};
    }
    Polynomial(double[] coefs) {
        this.coefs = coefs;
    }

    Polynomial add(Polynomial other) {
        int length = Math.max(this.coefs.length, other.coefs.length);
        double[] newCoefs = new double[length];
        for (int i = 0; i < length; i++) {
            newCoefs[i] = 0;
            if(i < this.coefs.length) {
                newCoefs[i] += this.coefs[i];
            }
            if(i < other.coefs.length) {
                newCoefs[i] += other.coefs[i];
            }
        }
        return new Polynomial(newCoefs);
    }

    double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coefs.length; i++) {
            result += coefs[i] * Math.pow(x, i);
        }
        return  result;
    }
    boolean hasRoot(double x) {
        return Math.abs(evaluate(x)) < 0.000001;
    }
}