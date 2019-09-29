package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //initButtonListener(root);
        primaryStage.setTitle("Theatre Ticketing");
        primaryStage.setScene(new Scene(root, 500, 600));
        primaryStage.show();
    }

    private void initButtonListener(Parent root){
        Button start = (Button)root.lookup("start");
        start.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }

}


