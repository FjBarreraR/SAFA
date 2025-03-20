module org.example.pruebaentorno {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.pruebaentorno to javafx.fxml;
    exports org.example.pruebaentorno;
}