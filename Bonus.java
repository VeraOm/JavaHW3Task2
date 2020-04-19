public class Bonus {

    public static void main(String[] args) {
        int amountSum = 10;
        int paymentSum = 1100;
        System.out.printf("Количество денег на текущем счёте - %d", amountSum);
        System.out.println();
        System.out.printf("Сумма пополнения - %d", paymentSum);
        System.out.println();

        if (paymentSum > 1000) {
            amountSum = amountSum + paymentSum + (paymentSum / 100);
        } else {
            amountSum = amountSum + paymentSum;
        }

        System.out.printf("Итоговая сумма - %d", amountSum);
    }

}
