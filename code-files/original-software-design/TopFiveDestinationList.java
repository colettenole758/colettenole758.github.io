import javax.swing.SwingUtilities;

public class TopFiveDestinationList {
   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            TopDestinationListFrame topDestinationListFrame = new TopDestinationListFrame();
            topDestinationListFrame.setTitle("Top 5 Destination List");
            topDestinationListFrame.setVisible(true);
         }
      });
   }
}
