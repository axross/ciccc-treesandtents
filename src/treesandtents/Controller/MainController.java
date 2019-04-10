package treesandtents.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class MainController{

    @FXML
    public GridPane gridPane;
    @FXML
    public Button btnRules;
    @FXML
    public Button btnStart;
    @FXML
    public AnchorPane anchorPane;

    public void buttonStarClicked(ActionEvent actionEvent) throws IOException {
        BoardController.display();
    }
}
