module ferranti.esame {
    requires javafx.controls;
    requires javafx.fxml;


    opens ferranti.esame to javafx.fxml;
    exports ferranti.esame;
}