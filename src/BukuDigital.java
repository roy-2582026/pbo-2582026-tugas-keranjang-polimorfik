public class BukuDigital extends Buku implements BisaDiunduh {
    private double ukuranMb;
    private String linkUnduhan;

    public BukuDigital(String judul, String penulis, int harga, double ukuranMb, String linkUnduhan) {
        super(judul, penulis, harga);
        this.ukuranMb = ukuranMb;
        this.linkUnduhan = linkUnduhan;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("[Buku Digital] " + judul + " oleh " + penulis);
        System.out.println("Harga : " + formatRupiah(harga) + " | Ukuran: " + ukuranMb + " MB");
    }

    @Override
    public void unduh() {
        System.out.println("Mengunduh file digital dari: " + linkUnduhan);
    }

    @Override
    public String getLinkUnduhan() {
        return linkUnduhan;
    }
}