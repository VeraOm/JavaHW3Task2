public class Bonus {

        public static void main(String[] args) {
            int AmountSum=10;
            int PaymentSum=1100;
            System.out.printf("Количество денег на текущем счёте - %d", AmountSum);
            System.out.println();
            System.out.printf("Сумма пополнения - %d", PaymentSum);
            System.out.println();

            if(PaymentSum > 1000){
                AmountSum=AmountSum+PaymentSum+(PaymentSum/100);
            }else{
                AmountSum=AmountSum+PaymentSum;
            }

            System.out.printf("Итоговая сумма - %d", AmountSum);
        }

}
