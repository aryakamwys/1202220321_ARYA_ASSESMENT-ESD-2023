import java.util.HashMap;
import java.util.Map;

public class JomokFriedChicken {

    public static void main(String[] args) {
        Map<String, Double> Hargamenu = new HashMap<>();
        Hargamenu.put("Ayam Goreng Krispi", 15.000);
        Hargamenu.put("Ayam Puk Puk (Bukan di geprek)", 13.000);
        Hargamenu.put("Ayam Bakar", 20.000);
        Hargamenu.put("Es teh", 5.000);
        Hargamenu.put("Es Jeruk", 7.000);

        int rehanAyamBakar = 2;
        int rehanEsTeh = 1;

        int ambaAyamPukPuk = 1;
        int ambaEsTeh = 3;

        int faizAyamGorengKrispi = 1;
        int faizEsJeruk = 1;
        int faizAyamPukPuk = 1;
        int faizEsTeh = 2;

        double rehanBill = Hitungbill(Hargamenu, rehanAyamBakar, 0, 0, rehanEsTeh, 0);
        double ambaBill = Hitungbill(Hargamenu, 0, ambaAyamPukPuk, 0, ambaEsTeh, 0);
        double faizBill = Hitungbill(Hargamenu, 0, faizAyamGorengKrispi, faizAyamPukPuk, faizEsTeh, faizEsJeruk);

        System.out.println("Biaya Rehan Whangsap: " + rehanBill);
        System.out.println("Biaya Amba Roni: " + ambaBill);
        System.out.println("Biaya Faiz Ngawi: " + faizBill);
    }

    public static double Hitungbill(Map<String, Double> Hargamenu, int ayamBakar, int ayamGorengKrispi,
            int ayamPukPuk, int esTeh, int esJeruk) {
        double total = 0;

        total += ayamBakar * Hargamenu.get("Ayam Bakar");
        total += ayamGorengKrispi * Hargamenu.get("Ayam Goreng Krispi");
        total += ayamPukPuk * Hargamenu.get("Ayam Puk Puk (Bukan di geprek)");

        total += esTeh * Hargamenu.get("Es teh");
        total += esJeruk * Hargamenu.get("Es Jeruk");

        double foodTax = 0.05;
        double drinkTax = 0.03;
        double totalTax = (ayamBakar + ayamGorengKrispi + ayamPukPuk) * foodTax + (esTeh + esJeruk) * drinkTax;

        total += totalTax;
        double transactionTax = 0.15;
        total += total * transactionTax;

        return total;
    }
}
