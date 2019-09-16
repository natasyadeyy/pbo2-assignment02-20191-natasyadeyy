package com.dey.controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class TokoKecilController {
    @FXML
    private TextField txtNama;

    @FXML
    private TextField txtHarga;

    @FXML
    private TextField txtCategory;
    @FXML
    private TableView<DataToko> tabelTokoKecil;
    @FXML
    private TableColumn<DataToko,String> col01;
    private ObservableList<DataToko> namee;
    @FXML
    private TableColumn<DataToko,String> col02;
    private ObservableList<DataToko> pricee;
    @FXML
    private TableColumn<DataToko,String> col03;
    private ObservableList<DataToko> categoryy;

    public TokoKecilController(ObservableList<DataToko> namee, ObservableList<DataToko> pricee, ObservableList<DataToko> categoryy) {
        this.namee = namee;
        this.pricee = pricee;
        this.categoryy = categoryy;
    }

    @FXML
    private void SaveAction(ActionEvent actionEvent) {
        DataToko i=new DataToko();
        i.setName(txtNama.getText().trim());
        i.setPrice(Double.parseDouble(txtHarga.getText().trim());
        i.setCategory(txtCategory.getText().trim());
        namee.add(i);

    }

    @FXML
    private void ResetAction(ActionEvent actionEvent) {
        txtNama.clear();
        txtHarga.clear();
        txtCategory.clear();
    }
}
