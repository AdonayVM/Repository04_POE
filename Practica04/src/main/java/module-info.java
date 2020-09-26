module controller {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens controller to javafx.fxml;
    exports controller;
    exports model;
}
