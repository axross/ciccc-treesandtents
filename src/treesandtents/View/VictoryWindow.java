package treesandtents.View;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
        import javafx.event.EventHandler;
        import javafx.geometry.Pos;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.layout.VBox;
        import javafx.stage.Modality;
        import javafx.stage.Stage;
import treesandtents.Controller.BoardController;
import treesandtents.Main;

public class VictoryWindow {

    public static void display(String title, String message) {

        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        BoardController boardController = new BoardController();
        VBox layout = new VBox(30);
        Label messageLabel = new Label();
        messageLabel.setText(message);
        messageLabel.setStyle("-fx-font-family: 'Rubik'; -fx-font-size: 20;");


        Button okButton = new Button();
        okButton.setText("Ok");
        okButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                window.close();
            }
        });

        layout.getChildren().add(messageLabel);
        layout.getChildren().add(okButton);
        layout.setAlignment(Pos.CENTER);


        Scene scene = new Scene(layout, 500, 200);
        window.setScene(scene);
        window.showAndWait();

    }
}
