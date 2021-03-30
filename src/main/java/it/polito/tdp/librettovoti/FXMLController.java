package it.polito.tdp.librettovoti;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.librettovoti.model.Libretto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXMLController {
	
	private Libretto model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtVoto;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtData;

    @FXML
    private Button btnInserisci;

    @FXML
    void handleInserisci(ActionEvent event) {
    	
    	
    	
    	
    }

    @FXML
    void initialize() {
        assert txtVoto != null : "fx:id=\"txtVoto\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtData != null : "fx:id=\"txtData\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";

    }

	public void setModel(Libretto model) {
		// TODO Auto-generated method stub
		this.model = model;
	}
}