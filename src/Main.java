// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int account = 100;
        int bonus = 100;
        int refill = 1100;
        int cashback;


        if (refill >= 1000){
            cashback = refill / bonus;
        } else {
            cashback = 0;
        }

        int total = account + refill + cashback;

        System.out.printf("Количество бонусов: " + cashback);

        System.out.println("На счету: " + total);

        System.out.println("Пополнение на " + refill);
    }
}
