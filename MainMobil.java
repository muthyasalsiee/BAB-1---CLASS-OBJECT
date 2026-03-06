import java.util.Scanner;

public class MainMobil {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Mobil m1 = new Mobil();

        System.out.print("Masukkan manufaktur mobil: ");
        String manufaktur = input.nextLine();
        m1.setManufaktur(manufaktur);

        System.out.print("Masukkan nomor plat: ");
        String plat = input.nextLine();
        m1.setNoPlat(plat);

        System.out.print("Masukkan warna mobil: ");
        String warna = input.nextLine();
        m1.setWarna(warna);

        System.out.print("Masukkan kecepatan mobil (km/jam): ");
        double kecepatan = input.nextDouble();
        m1.setKecepatan(kecepatan);

        System.out.print("Masukkan waktu tempuh (jam): ");
        double waktu = input.nextDouble();
        m1.setWaktu(waktu);

        System.out.println("\nInformasi Mobil:");
        m1.displayMessage();

        input.close();
    }
}