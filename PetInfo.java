package soal2;

import java.util.Scanner;

public class PetInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input pilihan jenis hewan
        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();  // Menangani newline setelah angka

        // Variabel untuk menyimpan input nama, ras, warna bulu, dan kemampuan
        String nama, ras, warnaBulu;
        String[] kemampuan;

        // Berdasarkan pilihan, mengatur input yang diperlukan
        if (pilihan == 1) {
            System.out.print("Nama hewan peliharaan: ");
            nama = scanner.nextLine();
            System.out.print("Ras: ");
            ras = scanner.nextLine();
            System.out.print("Warna Bulu: ");
            warnaBulu = scanner.nextLine();

            // Membuat objek Kucing
            Kucing kucing = new Kucing(ras, nama, warnaBulu);
            kucing.displayDetailKucing();  // Menampilkan detail kucing
        } else if (pilihan == 2) {
            System.out.print("Nama hewan peliharaan: ");
            nama = scanner.nextLine();
            System.out.print("Ras: ");
            ras = scanner.nextLine();
            System.out.print("Warna Bulu: ");
            warnaBulu = scanner.nextLine();
            System.out.print("Kemampuan: ");
            String inputKemampuan = scanner.nextLine();
            kemampuan = inputKemampuan.split(",");  // Memisahkan kemampuan berdasarkan koma

            // Membuat objek Anjing
            Anjing anjing = new Anjing(ras, nama, warnaBulu, kemampuan);
            anjing.displayDetailAnjing();  // Menampilkan detail anjing
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();  // Menutup scanner
    }
}