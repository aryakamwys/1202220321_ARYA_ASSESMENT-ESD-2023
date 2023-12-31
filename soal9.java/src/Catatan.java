import java.util.*;

public class Catatan {

    public static void main(String[] args) {
        List<String> listanaknakal1 = Arrays.asList("Bagas", "Dimas", "Bagas", "Bagas", "Indra", "Gilang", "Gilang",
                "Hana", "Fajar", "Fajar");
        List<String> listanaknakal2 = Arrays.asList("Bagas", "Dimas", "Fajar", "Bagas", "Indra", "Gilang", "Gilang",
                "Bagas", "Fajar", "Fajar");
        List<String> listanaknakal3 = Arrays.asList("Aisyah", "Bagas", "Dewi", "Dimas", "Eka", "Fajar", "Gilang",
                "Hana",
                "Indra", "Jihan");

        printstatus(listanaknakal1);
        printstatus(listanaknakal2);
        printstatus(listanaknakal3);
    }

    public static void printstatus(List<String> anaknakal) {
        Map<String, Integer> countMap = new HashMap<>();

        for (String kid : anaknakal) {
            countMap.put(kid, countMap.getOrDefault(kid, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(countMap.entrySet());
        sortedList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        System.out.println(anaknakal);

        if (sortedList.size() > 0) {
            System.out.println(sortedList.get(0).getKey() + " Nakal");
        }
        System.out.println();
    }
}
