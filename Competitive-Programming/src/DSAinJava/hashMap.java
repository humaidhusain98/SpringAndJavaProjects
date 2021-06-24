package DSAinJava;
// Import the HashMap class
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class hashMap {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("England", null);
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        Set<String> keyset= capitalCities.keySet();
    }
}