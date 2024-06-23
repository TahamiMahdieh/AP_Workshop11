module org.main.workshop11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.main.workshop11 to javafx.fxml;
    exports org.main.workshop11;
}