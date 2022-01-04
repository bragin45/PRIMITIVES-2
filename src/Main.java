public class Main {
    public static void main(String[] args) {
        int startBalance = 250;
        int receiptAmount = 200;
        int balanceAmount;
        int bonus = 0;

        if (receiptAmount > 100) {
            bonus = receiptAmount / 100;
            balanceAmount = startBalance + receiptAmount + bonus;
        } else {
            balanceAmount = startBalance + receiptAmount;
        }

        System.out.println("Итоготовый баланс: " + balanceAmount);
        System.out.println("В том числе бонусов: " + bonus);
    }
}
