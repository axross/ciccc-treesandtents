package treesandtents.View;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class Rules {

    public static void display () {
        Stage window = new Stage();
        String title = "Dogs and Bones";
        String message = " + Bones are placed in a grid. \n" +
               " + You have to place a dog next to each bone. \n" +
               " + The other cells must have grass. \n + The numbers around the grid\n" +
               "tell you the number of dogs in \nthe corresponding row or\n" +
               "column.\n + Each dog must be next to\n" +
               "a bone (horizontally or \n" +
               "vertically but not \n" +
               "diagonally). \n + The dogs cannot touch\n" +
               "each other, not even \n" +
               "diagonally. \n";
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        window.setMinHeight(450);

        Label rulesText = new Label();
        rulesText.setText(message);
        rulesText.setStyle("-fx-font-family: 'Rubik'; -fx-font-size: 20;");
        Button closeButton = new Button("Close");
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(20);
        layout.getChildren().addAll(rulesText, closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

    }
}
