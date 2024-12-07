package soal1;

import java.util.Scanner;

public class InfoPet {
    public static void main(String[] args) {
        // Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta input nama hewan peliharaan
        System.out.print("Nama Hewan Peliharaan: ");
        String nama = scanner.nextLine();

        // Meminta input ras hewan peliharaan
        System.out.print("Ras: ");
        String ras = scanner.nextLine();

        // Inisialisasi objek HewanPeliharaan dengan konstruktor
        HewanPeliharaan hewan = new HewanPeliharaan(nama, ras);

        // Memanggil method display untuk menampilkan output
        hewan.display();

        // Menutup scanner
        scanner.close();
    }
}