public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println("Ежемесячный платеж (9,99%/1 год/1_000_000р) = " + service.calculate(9.99, 1, 1_000_000));
        System.out.println();
        System.out.println("Ежемесячный платеж (9,99%/2 года/1_000_000р) = " + service.calculate(9.99, 2, 1_000_000));
        System.out.println();
        System.out.println("Ежемесячный платеж (9,99%/3 года/1_000_000р) = " + service.calculate(9.99, 3, 1_000_000));
    }
}