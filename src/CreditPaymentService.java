public class CreditPaymentService {
    public int calculate(double annualRate, int years, int sum) {
        double mouthRate = annualRate / 12 / 100;
        double monthlyPayment = (sum * mouthRate) / (1 - Math.pow((1 + mouthRate), -(years * 12)));
        int result = (int) monthlyPayment;
        return result;
    }
}
