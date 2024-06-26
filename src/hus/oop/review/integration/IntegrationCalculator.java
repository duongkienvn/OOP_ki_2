package hus.oop.review.integration;

public class IntegrationCalculator {
    private Integrator integrator;
    private Polynomial poly;

    /**
     * Hàm dựng, khởi tạo đa thức cần tính tích phân.
     *
     * @param poly
     */
    public IntegrationCalculator(Polynomial poly) {
        this.poly = poly;
        /* TODO */
    }

    /**
     * Hàm dựng, khởi tạo phương pháp tính tích phân và đa thức cần tính tích phân.
     *
     * @param integrator
     * @param poly
     */
    public IntegrationCalculator(Integrator integrator, Polynomial poly) {
        this.poly = poly;
        this.integrator = integrator;
        /* TODO */
    }

    public void setPoly(Polynomial poly) {
        this.poly = poly;
        /* TODO */
    }

    public void setIntegrator(Integrator integrator) {
        this.integrator = integrator;
        /* TODO */
    }

    public double integrate(double lower, double upper) {
        return integrator.integrate(poly, lower, upper);
        /* TODO */
    }
}
