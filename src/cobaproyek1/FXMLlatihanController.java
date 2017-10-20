/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaproyek1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author zendy bramantia
 */
public class FXMLlatihanController implements Initializable {

    @FXML
    private TextField editnama;
    @FXML
    private TextField editalamat;
    @FXML
    private TextField editabsen;
    @FXML
    private TextField edittelepon;
    @FXML
    private TextArea hasil;
    @FXML
    private Button hapus;
    @FXML
    private Button proses;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void action(ActionEvent event) {
    String nama = editnama.getText();
    String alamat = editalamat.getText();
    String absen = editabsen.getText();
    String telepon = edittelepon.getText();
    
    hasil.setText(
    "Nama Anda "+nama+
    "\n Alamat Anda "+alamat+
    "\n Absen Anda "+absen+
    "\n Telepon Anda "+telepon);

    }

    @FXML
    void action2(ActionEvent event) {
        hasil.setText("");
        editnama.setText("");
        editalamat.setText("");
        editabsen.setText("");
        edittelepon.setText("");

    }
    
}
