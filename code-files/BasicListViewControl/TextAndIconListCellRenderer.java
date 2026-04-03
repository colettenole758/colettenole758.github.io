import java.awt.Component;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 * Custom renderer for displaying text and icon in a JList.
 */
class TextAndIconListCellRenderer extends JLabel implements ListCellRenderer<TextAndIcon> {

    private static final Border NO_FOCUS_BORDER = new EmptyBorder(1, 1, 1, 1);
    private final Border insideBorder;

    public TextAndIconListCellRenderer() {
        this(5, 5, 5, 5);
    }

    public TextAndIconListCellRenderer(int padding) {
    this(padding, padding, padding, padding);
}

    public TextAndIconListCellRenderer(int top, int right, int bottom, int left) {
        insideBorder = BorderFactory.createEmptyBorder(top, left, bottom, right);
        setOpaque(true);
    }

    @Override
    public Component getListCellRendererComponent(
            JList<? extends TextAndIcon> list,
            TextAndIcon value,
            int index,
            boolean isSelected,
            boolean hasFocus) {

        setText(value.getText());
        setIcon(value.getIcon());

        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }

        Border outsideBorder = hasFocus
                ? UIManager.getBorder("List.focusCellHighlightBorder")
                : NO_FOCUS_BORDER;

        setBorder(BorderFactory.createCompoundBorder(outsideBorder, insideBorder));

        return this;
    }
}