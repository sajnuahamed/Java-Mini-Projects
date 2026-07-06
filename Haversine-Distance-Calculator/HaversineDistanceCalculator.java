
import java.util.Scanner;

/**
 * Calculates the great-circle distance between two geographic coordinates using
 * the Haversine formula.
 */
public class HaversineDistanceCalculator {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Haversine Distance Calculator ===\n");
            final double EARTH_RADIUS_KM = 6371; // ~ Radius of the earth
            //latitudes of point 1 and point 2 (in radians).
            double latitude1;
            double latitude2;
            // longitudes of point 1 and point 2 (in radians).
            double longitude1;
            double longitude2;

            double distance;

            System.out.println("Enter the latitude of the first location: ");
            latitude1 = Math.toRadians(scanner.nextDouble());
            System.out.println("Enter the longitude of the first location: ");
            longitude1 = Math.toRadians(scanner.nextDouble());
            System.out.println("Enter the latitude of the second location: ");
            latitude2 = Math.toRadians(scanner.nextDouble());
            System.out.println("Enter the longitude of the second location: ");
            longitude2 = Math.toRadians(scanner.nextDouble());

            // 1. Convert latitude and longitude differences
            double dLat = latitude2 - latitude1;
            double dLon = longitude2 - longitude1;

            // 2. Calculate the square of the half-chord length between the points (the 'a' term)
            double sinLatPart = Math.pow(Math.sin(dLat / 2), 2);
            double sinLonPart = Math.pow(Math.sin(dLon / 2), 2);
            double cosTerms = Math.cos(latitude1) * Math.cos(latitude2);

            double a = sinLatPart + (cosTerms * sinLonPart);

            // 3. Calculate the angular distance in radians (the 'c' term)
            double c = 2 * Math.asin(Math.sqrt(a));

            // 4. Calculate final distance
            distance = EARTH_RADIUS_KM * c;

            System.out.printf("%nDistance between the two locations: %d km%n",
                    Math.round(distance));
        }
    }

    /*
    Test case 1
    New York City (40.7128° N, 74.0060° W) and London (51.5074° N, 0.1278° W) distance ~ 5570 km.
     */
}
