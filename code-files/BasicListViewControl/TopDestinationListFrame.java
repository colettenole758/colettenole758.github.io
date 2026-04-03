import java.awt.BorderLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.util.List;

public class TopDestinationListFrame extends JFrame {

    private DefaultListModel<TextAndIcon> listModel;

    public TopDestinationListFrame() {
        super("SNHU Travel - Sorted Destinations");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900, 750);
        this.setLocationRelativeTo(null);

        listModel = new DefaultListModel<>();

        // Call service (logic layer)
        DestinationService service = new DestinationService();
        List<Destination> destinations = service.getTopDestinations();

        // Populate UI
        for (Destination d : destinations) {
            listModel.addElement(new TextAndIcon(d.getDescription(), d.getImageIcon()));
        }

        JList<TextAndIcon> list = new JList<>(listModel);
        list.setCellRenderer(new TextAndIconListCellRenderer(15));

        this.add(new JScrollPane(list), BorderLayout.CENTER);
    }
}