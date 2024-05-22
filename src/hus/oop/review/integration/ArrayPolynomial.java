package hus.oop.review.integration;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] coefficents;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ArrayPolynomial() {
        /* TODO */
        coefficents = new double[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Lấy hệ số của đa thức tại phần tử index
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
        /* TODO */
        return coefficents[index];
    }

    /**
     * Lấy mảng các hệ số của đa thức.
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        /* TODO */
        return coefficents;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial append(double coefficient) {
        /* TODO */
        if (this.coefficents.length <= size) {
            enlarge();
        }

        coefficents[size] = coefficient;
        size++;
        return this;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insert(double coefficient, int index) {
        /* TODO */
        if (coefficents.length <= size) {
            enlarge();
        }

        for (int i = size; i > index; i--) {
            coefficents[i] = coefficents[i - 1];
        }
        size++;
        return this;
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial set(double coefficient, int index) {
        /* TODO */
        coefficents[index] = coefficient;
        return this;
    }

    /**
     * Lấy bậc của đa thức.
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        /* TODO */
        return size - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {
        /* TODO */
        int degree = degree();
        double sum = 0;
        for (int i = 0; i <= degree; i++) {
            sum += coefficents[i] * Math.pow(x, i);
        }

        return sum;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ArrayPolynomial là đa thức đạo hàm của đa thức hiện tại.
     */
    @Override
    public Polynomial derivative() {
        /* TODO */
        double[] derivativeCoeffs = differentiate();
        ArrayPolynomial derivative = new ArrayPolynomial();

        for (double coeff : derivativeCoeffs) {
            derivative.append(coeff);
        }

        return derivative;
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial plus(ArrayPolynomial another) {
        /* TODO */
        int maxDegree = Math.max(this.degree(), another.degree());

        for (int i = 0; i <= maxDegree; i++) {
            double coeff = (i < this.size ? this.coefficents[i] : 0) +
                    (i < another.size ? another.coefficents[i] : 0);
            this.set(coeff, i);
        }

        return this;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial minus(ArrayPolynomial another) {
        /* TODO */
        int maxDegree = Math.max(this.degree(), another.degree());

        for (int i = 0; i <= maxDegree; i++) {
            double coeff = (i < this.size ? this.coefficents[i] : 0) -
                    (i < another.size ? another.coefficents[i] : 0);
            this.set(coeff, i);
        }

        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial multiply(ArrayPolynomial another) {
        /* TODO */
        int maxDegree = this.degree() + another.degree();
        double resultCoeffs[] = new double[maxDegree + 1];

        for (int i = 0; i <= degree(); i++) {
            for (int j = 0; j <= another.degree(); j++) {
                resultCoeffs[i + j] = this.coefficents[i] * another.coefficents[j];
            }
        }
        while (this.coefficents.length < maxDegree) {
            enlarge();
        }
        coefficents = resultCoeffs;
        return this;
    }

    /**
     * Thêm kích thước để lưu đa thức khi cần thiết.
     */
    private void enlarge() {
        /* TODO */
        double newArr[] = new double[coefficents.length * 2];
        System.arraycopy(coefficents, 0, newArr, 0, coefficents.length);
        coefficents = newArr;
    }
}
