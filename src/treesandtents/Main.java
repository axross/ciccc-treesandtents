package treesandtents;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {
//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        //The comment below is to test boardGame screen
//        Parent root = FXMLLoader.load(getClass().getResource("View/board.fxml"));
//        primaryStage.setTitle("Dogs and Bones");
//        primaryStage.setScene(new Scene(root, 1000, 675));
//        root.getStylesheets().add("treesandtents/View/css/styles.css");
//        primaryStage.show();
//    }


    @Override
    public void start(Stage primaryStage) throws Exception{
        //The comment below is to test boardGame screen

        Parent root = FXMLLoader.load(getClass().getResource("View/main.fxml"));
        primaryStage.setTitle("Dogs and Bones");
        primaryStage.setScene(new Scene(root, 1000, 675));
        root.getStylesheets().add("treesandtents/View/css/gameTitle.css");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
