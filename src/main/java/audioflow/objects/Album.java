package audioflow.objects;

import lombok.Data;

@Data
public class Album {

    private String  albumArtist         = null;
    private String  albumComposer       = null;
    private String  albumLabel          = null;
    private String  albumTitle          = null;
    private Integer albumYear           = null;
    private String  discLabel           = null;
    private Integer discNumber          = null;
    private Boolean suppressAlbumArtist = null;
    private Boolean variousArtists      = null;

    public Album(String albumArtist,
                 String albumComposer,
                 String albumLabel,
                 String albumTitle,
                 Integer albumYear,
                 String discLabel,
                 Integer discNumber,
                 Boolean suppressAlbumArtist,
                 Boolean variousArtists) {

    }

}
