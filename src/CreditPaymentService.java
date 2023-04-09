public class CreditPaymentService {
    public int calc(int s, double p, int b2) {
        int calc;
        double a = p / (12 * 100);
        double a1 = a + 1;
        double a2;
        a2 = Math.pow(a1, b2);
        double b;
        b = a * (a2 / (a2 - 1));
        double c;
        c = b * s;
        calc = (int) c;
        return calc;
    }

}
