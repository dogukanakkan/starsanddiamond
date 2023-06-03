import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elmasın yüksekliğini girin (tek sayı olmalı): ");
        int yukseklik = scanner.nextInt();

        // Üst kısmı çizdirme
        for (int satir = 1; satir <= yukseklik; satir++) {
            for (int bosluk = 1; bosluk <= yukseklik - satir; bosluk++) {
                System.out.print(" ");
            }
            for (int yildiz = 1; yildiz <= 2 * satir - 1; yildiz++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Alt kısmı çizdirme
        for (int satir = yukseklik - 1; satir >= 1; satir--) {
            for (int bosluk = 1; bosluk <= yukseklik - satir; bosluk++) {
                System.out.print(" ");
            }
            for (int yildiz = 1; yildiz <= 2 * satir - 1; yildiz++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
