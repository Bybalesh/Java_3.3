public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int payment = service.calc(1_000_000, 9.99, 12);
        System.out.println(payment);

    }
}