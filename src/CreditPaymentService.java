public class CreditPaymentService {

    public double calculate(double credit, double percent, double amountMonth){
        double monthPercent = percent / 12 / 100; //ежемесячная ставка

        double x = monthPercent * Math.pow((1 + monthPercent), amountMonth); //числитель формулы
        double y = Math.pow((1+monthPercent), amountMonth) - 1; //знаменатель формулы

        double monthPayment = credit * (x/y);
    return monthPayment;
}
    //Формула расчета аннуитетного платежа (А) представляет собой следующее соотношение:
    // А = K * (П * (1+П)^М) / ((1+П)^М - 1), где К – сумма кредита, П – процентная ставка, М – количество месяцев.
}
