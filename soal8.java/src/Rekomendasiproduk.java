import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rekomendasiproduk {

    public static void main(String[] args) {
        // Inisialisasi produk
        List<Map<String, Object>> products = new ArrayList<>();
        products.add(createProduct("TV", "elektronik", 1000));
        products.add(createProduct("Headphone", "elektronik", 200));
        products.add(createProduct("Baju", "fashion", 50));
        products.add(createProduct("Gitar", "musik", 300));
        products.add(createProduct("Sepatu", "olahraga", 80));
        products.add(createProduct("Kamera", "elektronik", 600));

        // Inisialisasi pelanggan
        Map<String, List<String>> customerPreferences = new HashMap<>();
        customerPreferences.put("Rina", List.of("elektronik", "musik"));

        // Mendapatkan rekomendasi produk untuk pelanggan
        List<String> recommendedProducts = recommendProducts(customerPreferences.get("Rina"), products);

        // Menampilkan rekomendasi produk
        System.out.println("rina: " + recommendedProducts);
    }

    public static Map<String, Object> createProduct(String name, String category, int price) {
        Map<String, Object> product = new HashMap<>();
        product.put("name", name);
        product.put("category", category);
        product.put("price", price);
        return product;
    }

    public static List<String> recommendProducts(List<String> interests, List<Map<String, Object>> products) {
        List<String> recommendedProducts = new ArrayList<>();

        // Memilih produk dari kategori yang diminati pelanggan
        for (String interest : interests) {
            for (Map<String, Object> product : products) {
                if (product.get("category").equals(interest) && !product.get("name").equals("Mouse")) {
                    recommendedProducts.add(product.get("name").toString());
                }
            }
        }

        return recommendedProducts;
    }
}
