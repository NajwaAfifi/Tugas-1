public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan metode pada kelas String
        String namaLengkap = "John Doe";

        // Mengubah menjadi huruf kapital semua
        String kapital = namaLengkap.toUpperCase();
        System.out.println("Huruf kapital: " + kapital);

        // Mengubah menjadi huruf kecil semua
        String kecil = namaLengkap.toLowerCase();
        System.out.println("Huruf kecil: " + kecil);

        // Memeriksa apakah string diawali atau diakhiri dengan substring tertentu
        boolean awal = namaLengkap.startsWith("John");
        System.out.println("Diawali dengan 'John': " + awal);

        boolean akhir = namaLengkap.endsWith("Doe");
        System.out.println("Diakhiri dengan 'Doe': " + akhir);

        // Mengganti karakter tertentu
        String diganti = namaLengkap.replace('o', 'a');
        System.out.println("Karakter 'o' diganti dengan 'a': " + diganti);

        // Memisahkan string menjadi array substring
        String[] pecah = namaLengkap.split(" ");
        System.out.println("Nama depan: " + pecah[0]);
        System.out.println("Nama belakang: " + pecah[1]);
    }
}
