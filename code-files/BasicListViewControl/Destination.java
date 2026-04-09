import javax.swing.Icon;

/**
 * Model class representing a Travel Destination.
 * Decouples data from the UI rendering logic.
 */
public class Destination {
    private String description;
    private Icon imageIcon;

    public Destination(String description, Icon imageIcon) {
        this.description = description;
        this.imageIcon = imageIcon;
    }

    public String getDescription() { return description; }
    public Icon getImageIcon() { return imageIcon; }

    @Override
    public String toString() {
        return description;
    }
}