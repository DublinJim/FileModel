package com.example.filemodel;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private Text fileFoundTxt;

    @FXML
    private Text newFileTxt;

    @FXML
    private Button quitOut;

    @FXML
    void getTheFiles(ActionEvent event) throws IOException {
        FileCtr.checkSequenceFiles();
        fileFoundTxt.setText(FileCtr.checkFileExists());
        newFileTxt.setText(FileCtr.fileToWrite());
    }

}
