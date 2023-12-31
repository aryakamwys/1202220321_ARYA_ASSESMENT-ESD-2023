import java.util.List;

public class Appreview {

    public static void main(String[] args) {
        List<Double> reviews = List.of(5.0, 4.0, 2.5, 5.0, 3.6, 1.1, 3.6, 4.0, 4.2, 1.5);

        analyzeReviews(reviews);
    }

    public static void analyzeReviews(List<Double> ratings) {
        if (ratings == null || ratings.isEmpty()) {
            System.out.println("Data review tidak tersedia.");
            return;
        }

        double lowestRating = Double.MAX_VALUE;
        double highestRating = Double.MIN_VALUE;
        double totalRating = 0;

        for (double rating : ratings) {
            if (rating < lowestRating) {
                lowestRating = rating;
            }

            if (rating > highestRating) {
                highestRating = rating;
            }

            totalRating += rating;
        }

        double averageRating = totalRating / ratings.size();

        System.out.println("[ " + lowestRating + ", " + highestRating + ", " + averageRating + " ]");
    }
}
