import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

class TextAndIconListCellRenderer extends JLabel implements ListCellRenderer {
   private static final Border NO_FOCUS_BORDER = new EmptyBorder(1, 1, 1, 1);
   private Border insideBorder;

   public TextAndIconListCellRenderer() {
      this(0, 0, 0, 0);
   }

   public TextAndIconListCellRenderer(int padding) {
      this(padding, padding, padding, padding);
   }

   public TextAndIconListCellRenderer(int topPadding, int rightPadding, int bottomPadding, int leftPadding) {
      this.insideBorder = BorderFactory.createEmptyBorder(topPadding, leftPadding, bottomPadding, rightPadding);
      this.setOpaque(true);
   }

   public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean hasFocus) {
      TextAndIcon tai = (TextAndIcon)value;
      this.setText(tai.getText());
      this.setIcon(tai.getIcon());
      if (isSelected) {
         this.setBackground(list.getSelectionBackground());
         this.setForeground(list.getSelectionForeground());
      } else {
         this.setBackground(list.getBackground());
         this.setForeground(list.getForeground());
      }

      Border outsideBorder;
      if (hasFocus) {
         outsideBorder = UIManager.getBorder("List.focusCellHighlightBorder");
      } else {
         outsideBorder = NO_FOCUS_BORDER;
      }

      this.setBorder(BorderFactory.createCompoundBorder(outsideBorder, this.insideBorder));
      this.setComponentOrientation(list.getComponentOrientation());
      this.setEnabled(list.isEnabled());
      this.setFont(list.getFont());
      return this;
   }

   public void validate() {
   }

   public void invalidate() {
   }

   public void repaint() {
   }

   public void revalidate() {
   }

   public void repaint(long tm, int x, int y, int width, int height) {
   }

   public void repaint(Rectangle r) {
   }
}
