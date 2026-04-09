import javax.swing.Icon;

/**
 * Helper class to combine text and icon for UI rendering.
 */
class TextAndIcon {
    private final String text;
    private final Icon icon;

    public TextAndIcon(String text, Icon icon) {
        this.text = text;
        this.icon = icon;
    }

    public String getText() {
        return text;
    }

    public Icon getIcon() {
        return icon;
    }

    @Override
    public String toString() {
        return text;
    }
}