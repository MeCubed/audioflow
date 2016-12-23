package audioflow.objects;

import lombok.Data;

@Data
public class Track {

    private String  comment;
    private String  featuring;
    private boolean isUntitled;
    private String  subtitle;
    private String  trackArtist;
    private String  trackComposer;
    private String  trackLabel;
    private Integer trackNumber;
    private String  trackTitle;

    public Track(Integer trackNumber, String trackTitle) {
        this.trackNumber = trackNumber;
        this.trackTitle = trackTitle;
    }

}
