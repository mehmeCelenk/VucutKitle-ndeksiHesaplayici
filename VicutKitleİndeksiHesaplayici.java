import java.util.Scanner;
public class VicutKitleİndeksiHesaplayici{
    public static void main(String[] args) {
        double kilo, boy,kitleİndeksi;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        kilo = input.nextDouble();

        kitleİndeksi = kilo / (boy * boy);
        System.out.println("Vücüt kitle indeksiniz :" + kitleİndeksi );
    }
}