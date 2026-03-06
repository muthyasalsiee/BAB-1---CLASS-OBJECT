public class Mobil {

    private String noPlat;
    private String warna;
    private String manufaktur;
    private double kecepatan;
    private double waktu;

    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public void setManufaktur(String manufaktur){
        this.manufaktur = manufaktur;
    }

    public void setKecepatan(double kecepatan){
        this.kecepatan = ubahKecepatan(kecepatan);
    }

    public void setWaktu(double waktu){
        this.waktu = ubahSekon(waktu);
    }

    private double ubahSekon(double jam){
        double sekon = jam * 3600;
        return sekon;
    }

    private double ubahKecepatan(double km){
        double ms = km / 3.6;
        return ms;
    }

    public double hitungJarak(){
        double jarak = kecepatan * waktu;
        return jarak;
    }

    public void displayMessage(){

        System.out.println("Manufaktur mobil : " + manufaktur);
        System.out.println("Nomor plat       : " + noPlat);
        System.out.println("Warna mobil      : " + warna);
        System.out.println("Kecepatan mobil  : " + kecepatan + " m/s");

        double jarakKm = hitungJarak() / 1000;

        System.out.println("Jarak tempuh mobil : " + jarakKm + " km");
    }
}