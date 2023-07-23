module com.qaguru.gitconflict21 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.qaguru.gitconflict21 to javafx.fxml;
    exports com.qaguru.gitconflict21;
}