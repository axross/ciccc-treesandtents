package treesandtents.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.FontWeight;
import treesandtents.Model.BoardModel;
import treesandtents.View.VictoryWindow;
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

    @FXML
    public Button btnReset;
    @FXML
    public Button btnTips;

    //Grid of the board
    @FXML
    public VBox vBox;
    @FXML
    public FlowPane flowPane;
    @FXML
    private GridPane gridPane;

    private Button[][] boardGrid;

    private String[][] boardModelGrid = new String[][] {
        {" ", "0", "0", "0", "0", "0"},
        {"0", "0", "0", "0", "0", "0"},
        {"0", "0", "1", "0", "1", "0"},
        {"0", "0", "0", "0", "0", "0"},
        {"0", "1", "1", "0", "0", "0"},
        {"0", "0", "0", "0", "0", "1"}
    };

    BoardModel boardModel = new BoardModel(boardModelGrid);

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

        validateNumberOfDogs();

    }

    public boolean validateNumberOfDogs(){
        boardModel.countNumberOfDogs();
        boolean validate = true;

        //validate rows
        if (boardModel.getBoardModelGrid(1,0).equals(labelC0R1.getText())){
            labelC0R1.setTextFill(Color.BLACK);
        }else {
            validate = false;
            labelC0R1.setTextFill(Color.RED);
        }

        if (boardModel.getBoardModelGrid(2,0).equals(labelC0R2.getText())){
            labelC0R2.setTextFill(Color.BLACK);
        }else {
            validate = false;
            labelC0R2.setTextFill(Color.RED);
        }

        if (boardModel.getBoardModelGrid(3,0).equals(labelC0R3.getText())){
            labelC0R3.setTextFill(Color.BLACK);
        }else {
            validate = false;
            labelC0R3.setTextFill(Color.RED);
        }

        if (boardModel.getBoardModelGrid(4,0).equals(labelC0R4.getText())){
            labelC0R4.setTextFill(Color.BLACK);
        }else {
            validate = false;
            labelC0R4.setTextFill(Color.RED);
        }

        if (boardModel.getBoardModelGrid(5,0).equals(labelC0R5.getText())){
            labelC0R5.setTextFill(Color.BLACK);
        }else {
            validate = false;
            labelC0R5.setTextFill(Color.RED);
        }

        //validate colunms
        if (boardModel.getBoardModelGrid(0,1).equals(labelC1R0.getText())){
            labelC1R0.setTextFill(Color.BLACK);
        }else {
            validate = false;
            labelC1R0.setTextFill(Color.RED);
        }

        if (boardModel.getBoardModelGrid(0,2).equals(labelC2R0.getText())){
            labelC2R0.setTextFill(Color.BLACK);
        }else {
            validate = false;
            labelC2R0.setTextFill(Color.RED);
        }

        if (boardModel.getBoardModelGrid(0,3).equals(labelC3R0.getText())){
            labelC3R0.setTextFill(Color.BLACK);
        }else {
            validate = false;
            labelC3R0.setTextFill(Color.RED);
        }

        if (boardModel.getBoardModelGrid(0,4).equals(labelC4R0.getText())){
            labelC4R0.setTextFill(Color.BLACK);
        }else {
            validate = false;
            labelC4R0.setTextFill(Color.RED);
        }

        if (boardModel.getBoardModelGrid(0,5).equals(labelC5R0.getText())){
            labelC5R0.setTextFill(Color.BLACK);
        }else {
            validate = false;
            labelC5R0.setTextFill(Color.RED);
        }

        return validate;
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
        int row = gridPane.getRowIndex(btnClicked);
        int colunm = gridPane.getColumnIndex(btnClicked);

        if(!btnClicked.getText().equals("1")){
            switch (btnClicked.getText()){
                case "0":
                    boardModel.setBoardModelGrid(row,colunm,"2");
                    btnClicked.setText(boardModel.getBoardModelGrid(row,colunm));

                    break;
                case "2":
                    boardModel.setBoardModelGrid(row,colunm,"3");
                    btnClicked.setText(boardModel.getBoardModelGrid(row,colunm));
                    break;
                case "3":
                    boardModel.setBoardModelGrid(row,colunm,"0");
                   // boardModelGrid[row][colunm]="0";
                    btnClicked.setText(boardModel.getBoardModelGrid(row,colunm));
                    break;
                default:
                    boardModel.setBoardModelGrid(row,colunm,"-1");
                    btnClicked.setText(boardModel.getBoardModelGrid(row,colunm));
                    break;
            }
        }

        if (validateNumberOfDogs() && !boardModel.thereIsEmptyCells()){
            VictoryWindow.display("Dogs and Bones", "You win!!");
        }

    }


}
