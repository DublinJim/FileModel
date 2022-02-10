package com.example.filemodel;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class HelloController {

    @FXML
    void quitApp() {
        Platform.exit ();
    }

}
