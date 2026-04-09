import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.List;
import java.net.URL;

/**
 * Service layer responsible for providing destination data.
 */
public class DestinationService {

    private static final String IMAGE_PATH = "/resources/TestImage.jpg";

    public List<Destination> getTopDestinations() {
        List<Destination> list = new ArrayList<>();

        String[] descriptions = {
            "1. Santorini, Greece - Famous white-washed buildings.",
            "2. Kyoto, Japan - Classical Buddhist temples.",
            "3. Maui, Hawaii - Iconic beaches and sunrise views.",
            "4. Paris, France - The city of lights and art.",
            "5. Swiss Alps, Switzerland - World-class skiing."
        };

        // Load image ONCE (efficient)
        URL imgURL = getClass().getResource(IMAGE_PATH);
        ImageIcon icon;

        if (imgURL != null) {
            icon = new ImageIcon(imgURL);
        } else {
            System.err.println("Resource Missing: " + IMAGE_PATH);
            icon = new ImageIcon(); // fallback
        }

        for (String desc : descriptions) {
            list.add(new Destination(desc, icon));
        }

        return list;
    }
}