class Book {
    int jumlahHalaman = 100;
    double halamanPerHari = 0.5;

    int hitungHari() {
        return (int)(jumlahHalaman / halamanPerHari);
    }
}

public class Main {
    public static void main(String[] args) {
        Book b = new Book();
        System.out.println("Lama menulis: " + b.hitungHari() + " hari");
    }
}