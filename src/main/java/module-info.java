module com.example.actividad6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.actividad6 to javafx.fxml;
    exports com.example.actividad6;
}