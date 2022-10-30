package archLab;
import javafx.geometry.Insets;
import javafx.scene.control.Label;


public class label extends Label {
    public static Insets LABEL_PADDING = new Insets(30);

    public label() {
        // TODO: set Label properties like padding
        this.setPadding(LABEL_PADDING);
    }
}
