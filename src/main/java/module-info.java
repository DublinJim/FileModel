module com.example.filemodel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.filemodel to javafx.fxml;
    exports com.example.filemodel;
}