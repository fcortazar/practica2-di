module org.fcd.practica2psp {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.fcd.practica2psp to javafx.fxml;
    exports org.fcd.practica2psp;
}