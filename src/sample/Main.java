package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Creating sample.fxml(Not used atm)
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        //Primary Scene
        primaryStage.setTitle("Hello World"); //Setting stage title
        Button bt = new Button("BIG RED BUTTON"); // Create button named bt
        bt.setPrefSize(200, 100);
        bt.setStyle("-fx-background-color: #ff0000"); // Setting background color of button
        bt.setTextFill(Color.WHITE); //Setting Button text color

        GridPane layout = new GridPane(); //Creates GridPane named layout
        layout.setPadding(new Insets(5));
        layout.setHgap(5);
        layout.setVgap(5);
        layout.add(bt, 20, 30);


        Scene scene1 = new Scene(layout, 400, 400);//Creating scene, holding gridpane + button
        primaryStage.setScene(scene1); //setting scene
        primaryStage.show(); //Showing scene

        //New Stage
        Stage stage = new Stage(); //Creating new stage
        stage.setTitle("Second Stage"); //Setting stage title
        Button bt1 = new Button("Save User"); //Creating new button bt1
        GridPane layout1 = new GridPane(); //Creating new gridpane
        layout1.setPadding(new Insets(5));
        layout1.setHgap(5);
        layout1.setVgap(5);
        Label lb1 = new Label("Name");
        TextField tf1 = new TextField();
        Label lb2 = new Label("Last name");
        TextField tf2 = new TextField();

        //1 Name label
        GridPane.setHalignment(lb1, HPos.RIGHT);
        layout1.add(lb1, 0, 0);//Setting label1 posis

        GridPane.setHalignment(lb2, HPos.RIGHT);
        layout1.add(lb2, 0, 1); //Setting label2 posis

        GridPane.setHalignment(tf1, HPos.LEFT);
        layout1.add(tf1, 1, 0); //Setting Textfield1 posis

        GridPane.setHalignment(tf2, HPos.LEFT);
        layout1.add(tf2, 1, 1); //Setting Textfield2 posis

        GridPane.setHalignment(bt1, HPos.RIGHT);
        layout1.add(bt1, 1, 3); //Setting button1


        stage.setScene(new Scene(layout1, 300, 300));//setting scene to be gridpane + button
        stage.show(); //Showing stage.
    }


    public static void main(String[] args) {
        launch(args);
    }
}
