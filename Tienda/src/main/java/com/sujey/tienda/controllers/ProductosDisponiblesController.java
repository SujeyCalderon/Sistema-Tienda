package com.sujey.tienda.controllers;

import com.sujey.tienda.Decathlon;
import com.sujey.tienda.models.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ProductosDisponiblesController {
    @FXML
    private ListView<String> Lis;

    @FXML
    private Button Ver;

    @FXML
    private Button offWindow;

    @FXML
    void OnMouseClickedVer(MouseEvent event) {
        Administracion admi = Decathlon.getAdmin();
        ArrayList<Accesorio> listaAccesorio = admi.getListAccesorio();
        ArrayList<Ropa> listaRopa = admi.getListRopa();
        ArrayList<Suplemento> listaSuplemento = admi.getListSuplemento();

        Lis.getItems().clear();

        for (Accesorio accesorios : listaAccesorio) {
            Lis.getItems().add(accesorios.toString());
        }

        for (Ropa ropa : listaRopa) {
            Lis.getItems().add(ropa.toString());
        }

        for (Suplemento suplemento : listaSuplemento) {
            Lis.getItems().add(suplemento.toString());
        }
    }


    @FXML
    void onMouseClickedOffWindow(MouseEvent event) {
        Stage stage = (Stage) offWindow.getScene().getWindow();
        stage.close();
    }
}
