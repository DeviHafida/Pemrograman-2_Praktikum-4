package soal2;

public class HewanPeliharaan {
    private String nama;
    private String ras;

    // Konstruktor untuk inisialisasi nama dan ras
    public HewanPeliharaan(String r, String n) {
        this.nama = n;
        this.ras = r;
    }

    // Method untuk menampilkan detail umum hewan peliharaan
    public void display() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + this.nama);
        System.out.println("Dengan ras : " + this.ras);
    }
}