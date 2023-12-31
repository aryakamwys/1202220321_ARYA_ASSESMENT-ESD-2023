import java.util.HashSet;
import java.util.Set;

public class DuplikatChecker {

    public static void main(String[] args) {
        int[] data = { 20, 1, 3, 2, 4, 6, 8, 5, 7, 9, 11, 13, 15, 10, 12, 14, 16, 18, 20, 17, 19 };

        boolean hasDuplicate = checkForDuplicates(data);

        System.out.println(hasDuplicate);
    }

    public static boolean checkForDuplicates(int[] array) {
        Set<Integer> uniqueElements = new HashSet<>();

        for (int number : array) {
            if (!uniqueElements.add(number)) {
                return true;
            }
        }

        return false;
    }
}
