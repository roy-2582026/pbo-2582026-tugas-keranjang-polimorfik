public class TokoBuku {
    public static void main(String[] args) {
        // Membuat objek menggunakan polimorfisme
        Buku buku1 = new BukuCetak("Pemrograman Berorientasi Objek", "Tim PBO", 120000, 500);
        Buku buku2 = new BukuCetak("Struktur Data dan Algoritma", "Budi Raharjo", 95000, 400);
        BukuDigital buku3 = new BukuDigital("Clean Code e-Book", "Robert C. Martin", 150000, 15.5, "https://download.lib/cleancode");
        BukuAudio buku4 = new BukuAudio("Belajar Java Audiobook", "Ahmad Developer", 80000, 120, "https://download.lib/audiojava");

        // Memasukkan ke dalam keranjang belanja (Array Polimorfik)
        Buku[] keranjang = {buku1, buku2, buku3, buku4};

        System.out.println("=== DAFTAR BELANJA KERANJANG PBO ===");
        System.out.println("=====================================");

        int totalHarga = 0;
        for (Buku b : keranjang) {
            b.tampilkanInfo();
            totalHarga += b.getHarga();
            System.out.println("-------------------------------------");
        }

        System.out.println("Total Pembayaran: " + Buku.formatRupiah(totalHarga));
        System.out.println();

        // Demonstrasi Interface BisaDiunduh
        System.out.println("=== DAFTAR ITEM YANG DAPAT DIUNDUH ===");
        BisaDiunduh[] daftarUnduh = {buku3, buku4};
        for (BisaDiunduh item : daftarUnduh) {
            item.unduh();
            System.out.println("Link: " + item.getLinkUnduhan());
            System.out.println("-------------------------------------");
        }
    }
}