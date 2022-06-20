package ferranti.esame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class HelloApplication extends Application {
    public static List<String> lista = new ArrayList<String>();

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        lista.add("pluto");
        lista.add("ama");
        lista.add("ciccia");
        lista.add("pap");
        lista.add("ciccio");
        lista.add("Ciccia");
        Collections.sort(lista, Collator.getInstance(Locale.ENGLISH));
        System.out.println("ciao"+ lista);
    }

    public static void main(String[] args) {
        launch();
    }
}