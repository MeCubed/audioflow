package audioflow.objects;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ObservableValue;
import lombok.Data;

@Data
public class Track {

    private String  comment;
    private String  featuring;
    private BooleanProperty isUntitled = new SimpleBooleanProperty();
    private String  subtitle;
    private String  trackArtist;
    private String  trackComposer;
    private String  trackLabel;
    private Integer trackNumber;
    private String  trackTitle;

    public Track(Integer trackNumber, String trackTitle, Boolean isUntitled) {
        this.trackNumber = trackNumber;
        this.trackTitle = trackTitle;
        this.isUntitled.set(isUntitled);
    }

}
