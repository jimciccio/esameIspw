package ferranti.esame;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class HelloController {
    protected List<String> lista = new ArrayList<String>();

    @FXML
    private Label welcomeText;

    @FXML
    private TextField txtField;

    @FXML
    protected void onHelloButtonClick() {
        lista.clear();
        String[] words = txtField.getText().split(",");
        int i=0;
        while(words.length!=i){
            lista.add(words[i]);
            i++;
        }
        Collections.sort(lista, Collator.getInstance(Locale.ENGLISH));
    }
}