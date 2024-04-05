package com.sujey.tienda.controllers;

import com.sujey.tienda.Decathlon;
import com.sujey.tienda.models.AccesoriosVenta;
import com.sujey.tienda.models.Administracion;
import com.sujey.tienda.models.RopaVenta;
import com.sujey.tienda.models.SupleVenta;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ProductosVendidosController {

    @FXML
    private ListView<String> List4;

    @FXML
    private Button offWindow;

    @FXML
    private Button ver4;

    @FXML
    void OnMouseClickedVer4(MouseEvent event) {
        Administracion admi = Decathlon.getAdmin();
        ArrayList<AccesoriosVenta> listaVentasAccesorios = admi.getListVentaAc();
        ArrayList<RopaVenta> listaVentasRopa = admi.getListVentaRo();
        ArrayList<SupleVenta> listaVentasSuplemento = admi.getListVentaSu();

        List4.getItems().clear();

        for (AccesoriosVenta venta : listaVentasAccesorios) {
            List4.getItems().add(venta.toString());
        }

        for (RopaVenta venta : listaVentasRopa) {
            List4.getItems().add(venta.toString());
        }

        for (SupleVenta venta : listaVentasSuplemento) {
            List4.getItems().add(venta.toString());
        }
    }

    @FXML
    void OnMouseClickedoffWindow(MouseEvent event) {
        Stage stage = (Stage) offWindow.getScene().getWindow();
        stage.close();
    }

}