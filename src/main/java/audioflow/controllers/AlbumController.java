package audioflow.controllers;

import audioflow.objects.Track;
import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.*;

public class AlbumController implements Initializable {

    @FXML
    Button debugButton;

    @FXML
    Label albumArtistLabel;
    @FXML
    TextField albumArtistField;
    @FXML
    Label albumComposerLabel;
    @FXML
    TextField albumComposerField;
    @FXML
    Label albumLabelLabel;
    @FXML
    TextField albumLabelField;
    @FXML
    Label albumTitleLabel;
    @FXML
    TextField albumTitleField;
    @FXML
    Label albumYearLabel;
    @FXML
    TextField albumYearField;
    @FXML
    Label discLabelLabel;
    @FXML
    TextField discLabelField;
    @FXML
    Label discNumberLabel;
    @FXML
    TextField discNumberField;
    @FXML
    Label suppressAlbumArtistLabel;
    @FXML
    CheckBox suppressAlbumArtistCheckbox;
    @FXML
    Label variousArtistsLabel;
    @FXML
    CheckBox variousArtistsCheckbox;

    @FXML
    TableView<Track> trackTable;
    @FXML
    TableColumn<Track, Integer> trackNumberTableColumn;
    @FXML
    TableColumn<Track, String> trackTitleTableColumn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("hello world");

        final ObservableList<Track> tracks = FXCollections.observableArrayList(
                new Track(0, "apple"),
                new Track(1, "banana")
        );
        trackTable.setEditable(true);
        trackNumberTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("trackNumber")
        );
        trackTitleTableColumn.setSortable(false);
        trackTitleTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("trackTitle")
        );
        trackTable.setItems(tracks);
    }

    public void onDebugPress(ActionEvent event) {
        System.out.println("debug");
        String s = "albumArtistField:" + albumArtistField.getCharacters();
        System.out.println(s);


    }


}
