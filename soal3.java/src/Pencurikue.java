public class Pencurikue {

    public static void main(String[] args) {
        String[] urutanKedatangan = { "Ningguang", "Hutao", "Xiao", "Childe" };
        boolean[] cekKue = { true, false, false, false };

        boolean kueTetapAda = true;

        String pencuriKue = temukanPencuri(urutanKedatangan, cekKue, kueTetapAda);

        if (pencuriKue != null) {
            System.out.println("Pencuri kue kemungkinan adalah: " + pencuriKue);
        }
    }

    public static String temukanPencuri(String[] urutanKedatangan, boolean[] cekKue, boolean kueTetapAda) {
        for (int i = 0; i < urutanKedatangan.length; i++) {
            String tamu = urutanKedatangan[i];

            if (tamu.equals("Ningguang") && cekKue[i] && !kueTetapAda) {
                return tamu;
            } else if (tamu.equals("Hutao") && !cekKue[i] && kueTetapAda) {
                return tamu;
            } else if (tamu.equals("Xiao") && cekKue[i] && kueTetapAda) {
                return tamu;
            } else if (tamu.equals("Childe") && !cekKue[i] && kueTetapAda) {
                return tamu;
            }
        }

        return null;
    }
}
