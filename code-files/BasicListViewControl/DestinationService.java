import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.net.URL;

/**
 * ENHANCEMENT 2: Algorithms and Data Structures
 * Demonstrates dynamic data structures and sorting algorithm
 */
public class DestinationService {

    public List<Destination> getTopDestinations() {

        // DATA STRUCTURE: Dynamic ArrayList (scalable)
        List<Destination> list = new ArrayList<>();

        String[][] data = {
    {"Santorini, Greece", "/resources/santorini.jpg"},
    {"Kyoto, Japan", "/resources/kyoto.jpg"},
    {"Maui, Hawaii", "/resources/maui.jpg"},
    {"Paris, France", "/resources/paris.jpg"},
    {"Swiss Alps, Switzerland", "/resources/swiss.jpg"}
};

for (String[] item : data) {
    String desc = item[0];
    String imagePath = item[1];

    URL imgURL = getClass().getResource(imagePath);
    ImageIcon icon;

    if (imgURL != null) {
        icon = new ImageIcon(imgURL);
    } else {
        System.err.println("Image not found: " + imagePath);
        icon = new ImageIcon();
    }

    list.add(new Destination(desc, icon));
}

        // ALGORITHM: Alphabetical Sort Logic
        // By using a Comparator, we solve the logic problem of data organization.
        // This ensures a professional, predictable user experience.
        list.sort(Comparator.comparing(Destination::getDescription));

        return list;
    }
}