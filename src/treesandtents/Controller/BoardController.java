package treesandtents.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import java.net.URL;
import java.util.ResourceBundle;

public class BoardController implements Initializable {
    //C == Column   //R == Row
    //Example: labelC1R0 -> Label of column(C) 1 and row(R) 0

    //Labels that will control number of dogs on each column
    @FXML
    private Label labelC1R0;
    @FXML
    private Label labelC2R0;
    @FXML
    private Label labelC3R0;
    @FXML
    private Label labelC4R0;
    @FXML
    private Label labelC5R0;

    //Labels that will control number of dogs on each row
    @FXML
    private Label labelC0R1;
    @FXML
    private Label labelC0R2;
    @FXML
    private Label labelC0R3;
    @FXML
    private Label labelC0R4;
    @FXML
    private Label labelC0R5;

    //Buttons first row(R1)
    @FXML
    private Button btnC1R1, btnC2R1, btnC3R1, btnC4R1, btnC5R1;

    //Buttons second row(R2)
    @FXML
    private Button btnC1R2, btnC2R2, btnC3R2, btnC4R2, btnC5R2;

    //Buttons thirty row(R3)
    @FXML
    private Button btnC1R3, btnC2R3, btnC3R3, btnC4R3, btnC5R3;

    //Buttons fourth row(R4)
    @FXML
    private Button btnC1R4, btnC2R4, btnC3R4, btnC4R4, btnC5R4;

    //Buttons fifth row(R5)
    @FXML
    private Button btnC1R5, btnC2R5, btnC3R5, btnC4R5, btnC5R5;

    //Grid of the board
    @FXML
    private GridPane gridPane;

    private Button[][] boardGrid;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        /// initializing instance variables (properties)
        boardGrid = new Button[][]{
                {btnC1R1, btnC2R1, btnC3R1, btnC4R1, btnC5R1},
                {btnC1R2, btnC2R2, btnC3R2, btnC4R2, btnC5R2},
                {btnC1R3, btnC2R3, btnC3R3, btnC4R3, btnC5R3},
                {btnC1R4, btnC2R4, btnC3R4, btnC4R4, btnC5R4},
                {btnC1R5, btnC2R5, btnC3R5, btnC4R5, btnC5R5}
        };

    }

    /**
     * States:
     * 1 - Bone
     * 0 - Empty
     * 2 - Grass
     * 3 - Dog
     * @param actionEvent
     */
    public void buttonClicked(ActionEvent actionEvent) {
        Button btnClicked = (Button) actionEvent.getSource();

        if(!btnClicked.getText().equals("1")){
            switch (btnClicked.getText()){
                case "0":
                    btnClicked.setText("2");
                    break;
                case "2":
                    btnClicked.setText("3");
                    break;
                case "3":
                    btnClicked.setText("0");
                    break;
                default:
                    btnClicked.setText("-1");
                    break;
            }
        }
    }


}
