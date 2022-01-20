package ch.ictbz.tannenbaum.tannenbaum;

import javafx.beans.value.ChangeListener;
import javafx.css.PseudoClass;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;

import java.util.function.UnaryOperator;

public class Controller {

    public TextField stammbreiteTextField;
    public TextField stammhoeheTextField;
    public TextField kronenhoeheTextField;
    public TextArea tanneTextArea;

    @FXML
    protected void onButtonTanneZeichnen() {

        int stammbreite = Integer.parseInt(stammbreiteTextField.getText());
        int stammhoehe = Integer.parseInt(stammhoeheTextField.getText());
        int kronenhoehe = Integer.parseInt(kronenhoeheTextField.getText());

        Tannenbaum tannenbaum = new Tannenbaum(stammbreite, stammhoehe, kronenhoehe);

        tannenbaum.zeichne();
        tanneTextArea.setText(tannenbaum.getZeichnung());

    }


}