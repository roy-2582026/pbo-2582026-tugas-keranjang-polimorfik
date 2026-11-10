public class BukuAudio extends Buku implements BisaDiunduh {
    private int durasiMenit;
    private String linkUnduhan;

    public BukuAudio(String judul, String penulis, int harga, int durasiMenit, String linkUnduhan) {
        super(judul, penulis, harga);
        this.durasiMenit = durasiMenit;
        this.linkUnduhan = linkUnduhan;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("[Buku Audio] " + judul + " oleh " + penulis);
        System.out.println("Harga : " + formatRupiah(harga) + " | Durasi: " + durasiMenit + " menit");
    }

    @Override
    public void unduh() {
        System.out.println("Mengunduh audio buku dari: " + linkUnduhan);
    }

    @Override
    public String getLinkUnduhan() {
        return linkUnduhan;
    }
}