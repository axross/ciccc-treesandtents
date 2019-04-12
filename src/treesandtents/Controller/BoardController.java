package treesandtents.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import treesandtents.Model.BoardModel;
import treesandtents.View.Rules;
import treesandtents.View.VictoryWindow;

import java.io.IOException;
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



    BoardModel boardModel = new BoardModel();

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
            labelC0R1.setTextFill(Color.valueOf("#CCC2A8"));
        }else {
            validate = false;
            labelC0R1.setTextFill(Color.valueOf("#D9522B"));
        }

        if (boardModel.getBoardModelGrid(2,0).equals(labelC0R2.getText())){
            labelC0R2.setTextFill(Color.valueOf("#CCC2A8"));
        }else {
            validate = false;
            labelC0R2.setTextFill(Color.valueOf("#D9522B"));
        }

        if (boardModel.getBoardModelGrid(3,0).equals(labelC0R3.getText())){
            labelC0R3.setTextFill(Color.valueOf("#CCC2A8"));
        }else {
            validate = false;
            labelC0R3.setTextFill(Color.valueOf("#D9522B"));
        }

        if (boardModel.getBoardModelGrid(4,0).equals(labelC0R4.getText())){
            labelC0R4.setTextFill(Color.valueOf("#CCC2A8"));
        }else {
            validate = false;
            labelC0R4.setTextFill(Color.valueOf("#D9522B"));
        }

        if (boardModel.getBoardModelGrid(5,0).equals(labelC0R5.getText())){
            labelC0R5.setTextFill(Color.valueOf("#CCC2A8"));
        }else {
            validate = false;
            labelC0R5.setTextFill(Color.valueOf("#D9522B"));
        }

        //validate colunms
        if (boardModel.getBoardModelGrid(0,1).equals(labelC1R0.getText())){
            labelC1R0.setTextFill(Color.valueOf("#CCC2A8"));
        }else {
            validate = false;
            labelC1R0.setTextFill(Color.valueOf("#D9522B"));
        }

        if (boardModel.getBoardModelGrid(0,2).equals(labelC2R0.getText())){
            labelC2R0.setTextFill(Color.valueOf("#CCC2A8"));
        }else {
            validate = false;
            labelC2R0.setTextFill(Color.valueOf("#D9522B"));
        }

        if (boardModel.getBoardModelGrid(0,3).equals(labelC3R0.getText())){
            labelC3R0.setTextFill(Color.valueOf("#CCC2A8"));
        }else {
            validate = false;
            labelC3R0.setTextFill(Color.valueOf("#D9522B"));
        }

        if (boardModel.getBoardModelGrid(0,4).equals(labelC4R0.getText())){
            labelC4R0.setTextFill(Color.valueOf("#CCC2A8"));
        }else {
            validate = false;
            labelC4R0.setTextFill(Color.valueOf("#D9522B"));
        }

        if (boardModel.getBoardModelGrid(0,5).equals(labelC5R0.getText())){
            labelC5R0.setTextFill(Color.valueOf("#CCC2A8"));
        }else {
            validate = false;
            labelC5R0.setTextFill(Color.valueOf("#D9522B"));
        }

        return validate;
    }

public void tranformModelIntoView(){
        Button[][] boardGrid2 = new Button[][]{
            {btnC1R1, btnC2R1, btnC3R1, btnC4R1, btnC5R1},
            {btnC1R2, btnC2R2, btnC3R2, btnC4R2, btnC5R2},
            {btnC1R3, btnC2R3, btnC3R3, btnC4R3, btnC5R3},
            {btnC1R4, btnC2R4, btnC3R4, btnC4R4, btnC5R4},
            {btnC1R5, btnC2R5, btnC3R5, btnC4R5, btnC5R5}
    };

    for (int i = 1; i < boardModel.getBoardModelGrid().length; i++) {
        for (int j = 1; j < boardModel.getBoardModelGrid().length; j++) {
            if(boardModel.getBoardModelGrid(i,j).equals("Empty")){
                boardGrid2[i-1][j-1].getStyleClass().clear();
                boardGrid2[i-1][j-1].getStyleClass().add("button-empty");
            }
            if(boardModel.getBoardModelGrid(i,j).equals("Dog")){
                boardGrid2[i-1][j-1].getStyleClass().clear();
                boardGrid2[i-1][j-1].getStyleClass().add("button-dog");
            }
            if(boardModel.getBoardModelGrid(i,j).equals("Grass")){
                boardGrid2[i-1][j-1].getStyleClass().clear();
                boardGrid2[i-1][j-1].getStyleClass().add("button-grass");
            }
        }
    }
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
        if(btnClicked.getParent().equals(gridPane)){
            int row = gridPane.getRowIndex(btnClicked);
            int colunm = gridPane.getColumnIndex(btnClicked);

            if(!boardModel.getBoardModelGrid(row,colunm).equals("Bone")){
                switch (boardModel.getBoardModelGrid(row,colunm)){
                    case "Empty":
                        boardModel.setBoardModelGrid(row,colunm,"Grass");
                        btnClicked.getStyleClass().clear();
                        btnClicked.getStyleClass().add("button-grass");

                        break;
                    case "Grass":
                        boardModel.setBoardModelGrid(row,colunm,"Dog");
                        btnClicked.getStyleClass().clear();
                        btnClicked.getStyleClass().add("button-dog");
                        break;
                    case "Dog":
                        boardModel.setBoardModelGrid(row,colunm,"Empty");
                        btnClicked.getStyleClass().clear();
                        btnClicked.getStyleClass().add("button-empty");
                        break;
                    default:
                        boardModel.setBoardModelGrid(row,colunm,"-1");
                        btnClicked.setText(boardModel.getBoardModelGrid(row,colunm));
                        break;
                }
            }
        }

        if (validateNumberOfDogs() && !boardModel.thereIsEmptyCells()){
            VictoryWindow.display("Dogs and Bones", "You won!!");
        }

    }

    public VBox getvBox() {
        return vBox;
    }

    public void buttonResetClicked() {
        boardModel.reset();
        tranformModelIntoView();
    }

    public void buttonTipsClicked() {
        Rules.display();
    }

    public static void display() throws IOException {
        Stage window = new Stage();
        BoardController boardController = new BoardController();
        Parent root = FXMLLoader.load(boardController.getClass().getResource("../View/board.fxml"));

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Dogs and Bones");
        Scene scene = new Scene(root, 1000, 675);
        window.setScene(scene);
        scene.setRoot(root);
        scene.getStylesheets().add("treesandtents/View/css/styles.css");
        window.showAndWait();
    }


}
