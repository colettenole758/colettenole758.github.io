import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * UI class responsible for displaying destinations.
 */
public class TopDestinationListFrame extends JFrame {

    private DefaultListModel<TextAndIcon> listModel;

    public TopDestinationListFrame() {
        setTitle("Top Travel Destinations");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        listModel = new DefaultListModel<>();
        JList<TextAndIcon> list = new JList<>(listModel);

        list.setCellRenderer(new TextAndIconListCellRenderer());

        add(new JScrollPane(list), BorderLayout.CENTER);

        loadDestinations();
    }

    private void loadDestinations() {
        DestinationService service = new DestinationService();
        List<Destination> destinations = service.getTopDestinations();

        for (Destination d : destinations) {
            listModel.addElement(
                new TextAndIcon(d.getDescription(), d.getImageIcon())
            );
        }
    }

    /**
     * Custom renderer for displaying text and icon together.
     */
    private static class TextAndIconListCellRenderer extends JLabel implements ListCellRenderer<TextAndIcon> {

        @Override
        public Component getListCellRendererComponent(
                JList<? extends TextAndIcon> list,
                TextAndIcon value,
                int index,
                boolean isSelected,
                boolean cellHasFocus) {

            setText(value.getText());
            setIcon(value.getIcon());

            if (isSelected) {
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());
            } else {
                setBackground(list.getBackground());
                setForeground(list.getForeground());
            }

            setOpaque(true);
            return this;
        }
    }
}