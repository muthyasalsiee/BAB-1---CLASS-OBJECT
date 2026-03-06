class Buku {

    String JudulBuku;
    int TahunTerbit;
    Penulis[] penulis;

    Buku(String JudulBuku, int TahunTerbit, Penulis[] penulis){
        this.JudulBuku = JudulBuku;
        this.TahunTerbit = TahunTerbit;
        this.penulis = penulis;
    }

    void tampilBuku(){

        System.out.println("Judul Buku : " + JudulBuku);
        System.out.println("Tahun : " + TahunTerbit);

        System.out.print("Penulis : ");

        for(Penulis p : penulis){
            System.out.print(p.NamaPenulis + " ");
        }

        System.out.println("\n");
    }
}