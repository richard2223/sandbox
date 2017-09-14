package za.co.absa.bas.fx.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import za.co.absa.bas.fx.domain.BASRecord;

import java.net.URL;
import java.util.ResourceBundle;

public class BASController implements Initializable {

    private ObservableList<BASRecord> fileData = FXCollections.observableArrayList();

    @FXML
    private Button upload;

    @FXML
    private Button generate;

    @FXML
    private TableView<String> fileTable;

    @FXML
    private void handleUploadAction(ActionEvent event) {
        System.out.println("handleUploadAction()");
    }

    @FXML
    private void handleGenerateAction(ActionEvent event) {
        System.out.println("handleGenerateAction()");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
