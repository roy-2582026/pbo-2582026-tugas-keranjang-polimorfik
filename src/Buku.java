public abstract class Buku {
    protected String judul;
    protected String penulis;
    protected int harga;

    public Buku(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public abstract void tampilkanInfo();

    public int getHarga() {
        return harga;
    }

    // Menggunakan static agar bisa dipanggil langsung dari context static di TokoBuku
    public static String formatRupiah(int nominal) {
        return "Rp " + String.format("%,d", nominal).replace(',', '.');
    }
}