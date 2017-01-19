package audioflow.controllers;

import audioflow.objects.Track;
import javafx.beans.InvalidationListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.Callback;

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
    @FXML
    TableColumn<Track, Boolean> trackIsUntitledTableColumn;


    final ObservableList<Track> tracks = FXCollections.observableArrayList(
            new Track(0, "apple", false),
            new Track(1, "banana", false),
            new Track(2, "coconut", true)
    );

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("hello world");


        trackTable.setEditable(true);


        trackNumberTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("trackNumber")
        );

        trackTitleTableColumn.setSortable(false);
        trackTitleTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("trackTitle")
        );
        trackTitleTableColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        trackTitleTableColumn.setOnEditCommit(
                event -> event.getTableView().getItems().get(
                        event.getTablePosition().getRow()
                ).setTrackTitle(event.getNewValue())
        );

        trackIsUntitledTableColumn.setCellValueFactory(
                f -> f.getValue().getIsUntitled()
        );
        trackIsUntitledTableColumn.setCellFactory(
                tc -> new CheckBoxTableCell<>()
        );

        trackTable.setItems(tracks);
    }

    public void onDebugPress(ActionEvent event) {
        System.out.println("debug");
        String s = "albumArtistField:" + albumArtistField.getCharacters();
        System.out.println(s);


    }


}
