package core;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/core/view/login.fxml"));
        primaryStage.setTitle("To Do List");
        primaryStage.setScene(new Scene(root, 640, 480));
        primaryStage.show();


    }
}
