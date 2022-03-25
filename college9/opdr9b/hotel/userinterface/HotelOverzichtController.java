package opdr9b.hotel.userinterface;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import opdr9b.hotel.model.Boeking;
import opdr9b.hotel.model.Hotel;

import java.io.IOException;
import java.time.LocalDate;

public class HotelOverzichtController {
    @FXML
    private Label hotelnaamLabel;
    @FXML
    private ListView boekingenListView;
    @FXML
    private DatePicker overzichtDatePicker;

    private Hotel hotel = Hotel.getHotel();

    public void initialize() {
        hotelnaamLabel.setText("Boekingen hotel " + hotel.getNaam());
        overzichtDatePicker.setValue(LocalDate.now());
        toonBoekingen();
    }

    public void toonVorigeDag(ActionEvent actionEvent) {
        LocalDate dagEerder = overzichtDatePicker.getValue().minusDays(1);
        overzichtDatePicker.setValue(dagEerder);
    }

    public void toonVolgendeDag(ActionEvent actionEvent) {
        LocalDate dagLater = overzichtDatePicker.getValue().plusDays(1);
        overzichtDatePicker.setValue(dagLater);
    }

    public void nieuweBoeking(ActionEvent actionEvent) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Boekingen.fxml"));
        Parent root = loader.load();
        Stage newstage = new Stage();
        newstage.setScene(new Scene(root));
        newstage.initModality(Modality.APPLICATION_MODAL);
        newstage.showAndWait();

    }

    public void toonBoekingen() {
        ObservableList<String> boekingen = FXCollections.observableArrayList();
        Hotel hotelBoekingen = Hotel.getHotel();
        boekingen.add(hotelBoekingen.toString());
        for (Boeking b : hotel.getBoekingen()) {
            b.toString();
        }



//Breid methode toonBoekingen() uit zodat je alle boekingen (per boeking begin-/einddatum, kamernummer en klantnaam) toont op de datum die in het scherm is geselecteerd!
        // Vraag de boekingen op bij het Hotel-object.
        // Voeg voor elke boeking in nette tekst (string) toe aan de boekingen-lijst.
        boekingenListView.setItems(boekingen);
    }
}