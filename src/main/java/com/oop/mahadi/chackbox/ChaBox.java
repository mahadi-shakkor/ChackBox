package com.oop.mahadi.chackbox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class ChaBox {

    @FXML
    private CheckBox ChackBOXFxid;

    @FXML
    private Label lavelFxid;

    @FXML
    void ChackBoxOnAction(ActionEvent event) {


        if (ChackBOXFxid.isSelected()){
            lavelFxid.setText("ON");
        }
        else{
            lavelFxid.setText("OFF");
        }

    }

}
