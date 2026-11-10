public class BukuCetak extends Buku {
    private int beratGram;

    public BukuCetak(String judul, String penulis, int harga, int beratGram) {
        super(judul, penulis, harga);
        this.beratGram = beratGram;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("[Buku Cetak] " + judul + " oleh " + penulis);
        System.out.println("Harga : " + formatRupiah(harga) + " | Berat: " + beratGram + " gram");
    }
}