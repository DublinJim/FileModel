package com.example.filemodel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HelloApplication extends Application {
  public static void main(String[] args) {
    launch();
  }

  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
    Scene scene = new Scene(fxmlLoader.load());
    stage.setTitle("Hello!");
    stage.setScene(scene);
    stage.show();
    //////////////////////////////////////////
    String path = "C:\\Users\\james.keogh\\Desktop\\templates\\Java.fx\\";
    String filename = "out.wav";
    String fileOut = path + filename;
    FileReader fileReader = new FileReader(filename);

    FileWriter fileWriter = new FileWriter(filename);

    fileWriter.write (fileOut);
  }
}
