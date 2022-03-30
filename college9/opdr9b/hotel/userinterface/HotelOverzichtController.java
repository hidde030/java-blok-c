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

import java.time.LocalDate;

public class HotelOverzichtController {
    @FXML
    private Label hotelnaamLabel;
    @FXML
    private ListView<String> boekingenListView;
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

    public void nieuweBoeking(ActionEvent actionEvent) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Boekingen.fxml"));
        Parent root = loader.load();
        Stage newstage = new Stage();
        newstage.setScene(new Scene(root));
        newstage.initModality(Modality.APPLICATION_MODAL);
        newstage.showAndWait();
        initialize();

    }

    public void toonBoekingen() {
        ObservableList<String> boekingen = FXCollections.observableArrayList();

        LocalDate date = overzichtDatePicker.getValue();

        for(Boeking boeking : hotel.getBoekingen()){
            if(boeking.getBoekDatum().equals(date)) {
                boekingen.add("Begin: " + boeking.getAankomstDatum() + " Eind: " + boeking.getVertrekDatum() + " Kamer: " + boeking.getKamer().getKamerNummer() + " Naam: " + boeking.getBoeker().getNaam());
            }
        }

        boekingenListView.setItems(boekingen);
    }
}