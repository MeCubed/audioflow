package audioflow.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("hello world");
    }

    public void onDebugPress(ActionEvent event) {
        System.out.println("debug");
    }


}
