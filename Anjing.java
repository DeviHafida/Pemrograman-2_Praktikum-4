package soal2;

public class Anjing extends HewanPeliharaan {
    private String warnaBulu;
    private String[] kemampuan;

    // Konstruktor untuk inisialisasi nama, ras, warna bulu, dan kemampuan
    public Anjing(String r, String n, String w, String[] k) {
        super(r, n);  // Memanggil konstruktor parent class
        this.warnaBulu = w;
        this.kemampuan = k;
    }

    // Method untuk menampilkan detail anjing
    public void displayDetailAnjing() {
        super.display();  // Memanggil method display dari parent class
        System.out.println("Memiliki warna bulu : " + this.warnaBulu);
        System.out.print("Memiliki kemampuan : ");
        for (String kemampuan : kemampuan) {
            System.out.print(kemampuan + " ");
        }
        System.out.println();  // Menambahkan baris baru setelah kemampuan
    }
}