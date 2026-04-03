import javax.swing.SwingUtilities;

/**
 * Entry point for the Top Destination application.
 */
public class TopFiveDestinationList {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TopDestinationListFrame frame = new TopDestinationListFrame();
            frame.setTitle("Top 5 Destination List");
            frame.setVisible(true);
        });
    }
}
