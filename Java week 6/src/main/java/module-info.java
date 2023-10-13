module com.example.java_week_6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_week_6 to javafx.fxml;
    exports com.example.java_week_6;
}