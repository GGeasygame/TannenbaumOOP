module ch.ictbz.tannenbaum.tannenbaum {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.ictbz.tannenbaum.tannenbaum to javafx.fxml;
    exports ch.ictbz.tannenbaum.tannenbaum;
}