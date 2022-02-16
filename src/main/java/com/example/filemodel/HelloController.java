package com.example.filemodel;

import java.io.IOException;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private Text fileFoundTxt;

    @FXML
    private Text newFileTxt;

    @FXML
    void getTheFiles() throws IOException {
        FileCtr.checkSequenceFiles();
        fileFoundTxt.setText(FileCtr.checkFileExists());
        newFileTxt.setText(FileCtr.fileToWrite());
    }

    @FXML
    void quitTheApp() {
        Platform.exit();

    }

}
