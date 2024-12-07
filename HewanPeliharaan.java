package soal1;

public class HewanPeliharaan {
	    private String nama;
	    private String ras;

	    // Konstruktor
	    public HewanPeliharaan(String r, String n) {
	        this.nama = n;
	        this.ras = r;
	    }

	    // Method untuk menampilkan detail hewan peliharaan
	    public void display() {
	        System.out.println("Detail Hewan Peliharaan:");
	        System.out.println("Nama hewan peliharaanku adalah : " + this.nama);
	        System.out.println("Dengan ras : " + this.ras);
	    }
	}