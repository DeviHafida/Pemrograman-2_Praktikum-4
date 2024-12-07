package soal1;

public class InfoPet {
    public static void main(String[] args) {
        // Membuat objek dengan method yang meminta input
        HewanPeliharaan hewan = HewanPeliharaan.createFromInput();
        // Menampilkan detail hewan peliharaan
        hewan.display();
    }
}