module com.oop.mahadi.chackbox {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.oop.mahadi.chackbox to javafx.fxml;
    exports com.oop.mahadi.chackbox;
}