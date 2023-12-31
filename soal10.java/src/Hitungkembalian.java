import java.util.HashMap;
import java.util.Map;

public class Hitungkembalian {

    public static void main(String[] args) {
        Kembalian(10000, 7500);
        Kembalian(5000, 1100);
        Kembalian(178000, 90500);
    }

    public static void Kembalian(int totalpemabayaran, int totalbelanja) {
        int change = totalpemabayaran - totalbelanja;

        // Pecahan uang yang tersedia
        int[] pecahanuang = { 100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100 };

        Map<String, Integer> uangkembali = new HashMap<>();

        // Menghitung lembar dan keping koin
        for (int pecahan : pecahanuang) {
            if (change >= pecahan) {
                int count = change / pecahan;
                uangkembali.put(String.valueOf(pecahan), count);
                change %= pecahan;
            }
        }

        // Menampilkan hasil
        System.out.println("Total Pembayaran: " + totalpemabayaran);
        System.out.println("Total Belanja: " + totalbelanja);
        System.out.println(uangkembali);
    }
}
