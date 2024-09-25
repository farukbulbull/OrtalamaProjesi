import java.util.Scanner;

public class CiftVeDortKatlariTopla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;

        while (true) {
            System.out.print("Bir sayı girin (tek bir sayı girdiğinizde program sonlanır): ");
            int sayi = scanner.nextInt();

            // Tek sayı girilirse döngüden çık
            if (sayi % 2 != 0) {
                break;
            }

            // Çift ve 4'ün katı olan sayıları topla
            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
            }
        }

        System.out.println("Toplam: " + toplam);
        scanner.close();
    }
}
