package soal2;

public class Kucing extends HewanPeliharaan {
    private String warnaBulu;

    // Konstruktor untuk inisialisasi nama, ras, dan warna bulu
    public Kucing(String r, String n, String w) {
        super(r, n);  // Memanggil konstruktor parent class
        this.warnaBulu = w;
    }

    // Method untuk menampilkan detail kucing
    public void displayDetailKucing() {
        super.display();  // Memanggil method display dari parent class
        System.out.println("Memiliki warna bulu : " + this.warnaBulu);
    }
}
