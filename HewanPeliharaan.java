package soal1;

import java.util.Scanner;

public class HewanPeliharaan {
    private String nama;
    private String ras;

    // Konstruktor
    public HewanPeliharaan(String nama, String ras) {
        this.nama = nama;
        this.ras = ras;
    }

    // Method untuk menampilkan detail hewan peliharaan
    public void display() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah: " + this.nama);
        System.out.println("Dengan ras: " + this.ras);
    }

    // Method untuk meminta input dari pengguna
    public static HewanPeliharaan createFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama Hewan Peliharaan: ");
        String nama = scanner.nextLine();
        System.out.print("Ras: ");
        String ras = scanner.nextLine();
        scanner.close();
        return new HewanPeliharaan(nama, ras); // Mengembalikan objek yang diinisialisasi
    }
}