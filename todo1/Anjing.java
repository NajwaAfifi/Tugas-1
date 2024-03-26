public class Anjing {
    private String nama;
    private int umur;
    private String jenis;
    private String warna;

    public Anjing(String nama, int umur, String jenis, String warna) {
        this.nama = nama;
        this.umur = umur;
        this.jenis = jenis;
        this.warna = warna;
    }

    public void makan() {
        System.out.println(nama + " sedang makan.");
    }

    public void minum() {
        System.out.println(nama + " sedang minum.");
    }

    public void buangKotoran() {
        System.out.println(nama + " sedang buang kotoran.");
    }

    public void bersuara() {
        System.out.println(nama + " mengeluarkan suara guk-guk.");
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getJenis() {
        return jenis;
    }

    public String getWarna() {
        return warna;
    }

    public static void main(String[] args) {
        Anjing anjing1 = new Anjing("Bobby", 5, "Golden Retriever", "Emas");
        Anjing anjing2 = new Anjing("Max", 3, "Bulldog", "Coklat");
        Anjing anjing3 = new Anjing("Rocky", 7, "Labrador", "Hitam");

        anjing1.makan();
        anjing1.minum();
        anjing1.buangKotoran();
        anjing1.bersuara();

        System.out.println("------------------------------------------------------------");
        System.out.println("Ini " + anjing1.getNama() + " " + anjing1.getJenis() + " berwarna " + anjing1.getWarna() + " dengan umur " + anjing1.getUmur() + " tahun.");

        anjing2.makan();
        anjing2.minum();
        anjing2.buangKotoran();
        anjing2.bersuara();

        System.out.println("------------------------------------------------------------");
        System.out.println("Ini " + anjing2.getNama() + " " + anjing2.getJenis() + " berwarna " + anjing2.getWarna() + " dengan umur " + anjing2.getUmur() + " tahun.");

        anjing3.makan();
        anjing3.minum();
        anjing3.buangKotoran();
        anjing3.bersuara();

        System.out.println("------------------------------------------------------------");
        System.out.println("Ini " + anjing3.getNama() + " " + anjing3.getJenis() + " berwarna " + anjing3.getWarna() + " dengan umur " + anjing3.getUmur() + " tahun.");
    }
}
