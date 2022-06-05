import java.util.Scanner;

public class prime_number_finder {
    static boolean asal(int sayi, int i) {

        if (sayi <= 2) {
            return (sayi == 2) ? true : false;
        }
        if (sayi % i == 0) {
            return false;
        }

        if (i * i > sayi) {
            return true;
        }
        return asal(sayi, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayiyi giriniz: ");
        int sayi = sc.nextInt();

        if (asal(sayi, 2)) {
            System.out.println(sayi + " sayisi asal sayidir. ");
        } else {
            System.out.println(sayi + " sayisi asal sayi değildir.");
        }
    }
}