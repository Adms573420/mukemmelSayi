import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Bir Sayi Giriniz:");
        int sayi = scanner.nextInt();
        int total = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                total += i;

            }
        }

        System.out.println(sayi + " sayisinin bolenleri toplami :" + total);
    }
}
