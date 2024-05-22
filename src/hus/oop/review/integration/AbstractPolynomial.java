package hus.oop.review.integration;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder stringBuilder = new StringBuilder();
        int degree = degree();
        double coeffs[] = coefficients();

        stringBuilder.append("[");
        for (int i = degree; i >= 0; i--) {
            double coeff = coeffs[i];
            
            if (i == 0) {
                stringBuilder.append(coeff);
            } else {
                stringBuilder.append(coeff + "x^" + i + " + ");
            }
        }
        stringBuilder.append("]");

        return stringBuilder.toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        /* TODO */
        int degree = degree();
        double coeffs[] = coefficients();
        double derivativeCoefficients[] = new double[degree];

        for (int i = 1; i <= degree; i++) {
            derivativeCoefficients[i - 1] = coeffs[i] * i;
        }

        return derivativeCoefficients;
    }
}
