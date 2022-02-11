package com.example.filemodel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
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
    String filename = "out";
    String extension = ".wav";

    int versionNumber = 1;
    String versionString = "(" + versionNumber + ")";

    String fileOut = path + filename + extension;
    File file = new File(fileOut);

    while (file.exists()) {
      System.out.println("file exists");
      versionNumber++;
      fileOut = path + filename + "(" + versionNumber + ")" + extension;
      file = new File(fileOut);
    }

    System.out.println("file out " + fileOut);
    FileWriter fileWriter = new FileWriter(fileOut);
  }
}
