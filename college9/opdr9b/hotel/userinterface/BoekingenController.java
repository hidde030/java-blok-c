package opdr9b.hotel.userinterface;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import opdr9b.hotel.model.Hotel;
import opdr9b.hotel.model.KamerType;

import java.time.LocalDate;

public class BoekingenController {

    @FXML public TextField NaamInput;
    @FXML public TextField AdresInput;
    @FXML public DatePicker AankomstInput;
    @FXML public DatePicker VertekInput;
    @FXML public ComboBox<KamerType>  KamerInput;
    @FXML public Button reset;
    @FXML public Button boek;
//    private Hotel hotel = Hotel.getHotel();
    public void initialize() {
        AankomstInput.setValue(LocalDate.now());
        VertekInput.setValue(LocalDate.now().plusDays(1));

        for (KamerType kamerType : Hotel.getHotel().getKamerTypen()) {
            KamerInput.getItems().add(kamerType);
        }


    }

    public void boek(ActionEvent actionEvent) throws Exception {
        if (NaamInput != null && AdresInput != null && KamerInput.getValue() != null && (AankomstInput.getValue().isAfter(LocalDate.now()) || AankomstInput.getValue().isEqual(LocalDate.now())) && (VertekInput.getValue().isAfter(LocalDate.now()) || VertekInput.getValue().isEqual(LocalDate.now()))) {
            String naamInvoer = NaamInput.getText();
            String adresInvoer = AdresInput.getText();
            LocalDate aankomstDatum = AankomstInput.getValue();
            LocalDate vertrekDatum = VertekInput.getValue();
            KamerType kamerType = (KamerType) KamerInput.getSelectionModel().getSelectedItem();

            Hotel.getHotel().voegBoekingToe(aankomstDatum, vertrekDatum, naamInvoer, adresInvoer, kamerType);

            resetBoeking();
        }
        else {
            System.out.println("Verkeerde gegevens");
        }

        Button source = (Button)actionEvent.getSource();
        Stage stage = (Stage)source.getScene().getWindow();
        stage.close();

    }
    public void resetBoeking() {
        NaamInput.clear();
        AdresInput.clear();
        AankomstInput.getEditor().clear();
        VertekInput.getEditor().clear();
        AankomstInput.setValue(null);
        VertekInput.setValue(null);
        KamerInput.setValue(null);
    }

}

