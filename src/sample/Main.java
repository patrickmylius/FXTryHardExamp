package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Scanner;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Creating sample.fxml(Not used atm)
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        //Primary Scene
        primaryStage.setTitle("Hello World"); //Setting stage title
        Button bt = new Button("Click me Mofo"); // Create button named bt

        GridPane layout = new GridPane(); //Creates GridPane named layout
        layout.getChildren().add(bt); //add button bt to gridpane


        Scene scene1 = new Scene(layout, 400, 400);//Creating scene, holding gridpane + button
        primaryStage.setScene(scene1); //setting scene
        primaryStage.show(); //Showing scene

        //New Stage
        Stage stage = new Stage(); //Creating new stage
        stage.setTitle("Second Stage"); //Setting stage title
        Button bt1 = new Button("Extra Stage Button"); //Creating new button bt1
        GridPane layout1 = new GridPane(); //Creating new gridpane
        layout1.getChildren().add(bt1);//adding button to gridpane

        stage.setScene(new Scene(layout1, 300, 300));//setting scene to be gridpane + button
        stage.show(); //Showing stage.
    }


    public static void main(String[] args) {
        launch(args);
    }
}
