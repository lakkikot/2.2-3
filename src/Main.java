public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit = 1_000_000; //размер кредита
        double percent = 9.99; //процентная ставка
        double amountMonth; //срок кредита

        int monthPayment = (int) service.calculate(credit, percent, 12);
        System.out.println("Ежемесячный платеж составит: " + monthPayment + " руб.");

        monthPayment = (int) service.calculate(credit, percent, 24);
        System.out.println("Ежемесячный платеж составит: " + monthPayment + " руб.");

        monthPayment = (int) service.calculate(credit, percent, 36);
        System.out.println("Ежемесячный платеж составит: " + monthPayment + " руб.");

    }
}
