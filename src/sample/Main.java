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
        primaryStage.setTitle("Primary Stage"); //Setting stage title
        Button bt = new Button("BIG RED BUTTON"); // Create button named bt
        bt.setPrefSize(200, 100);
        bt.setStyle("-fx-background-color: #ff0000"); // Setting background color of button
        bt.setTextFill(Color.WHITE); //Setting Button text color

        //Creates GridPane named layout
        GridPane layout = new GridPane();
        //specifying layout settings for GridPane "layout"
        layout.setPadding(new Insets(5));
        layout.setHgap(5);
        layout.setVgap(5);
        //specifying layout posistion button bt
        layout.add(bt, 20, 30);


        Scene scene1 = new Scene(layout, 400, 400);//Creating scene, holding gridpane + button
        primaryStage.setScene(scene1); //setting scene
        primaryStage.show(); //Showing scene

        //New Stage
        Stage stage = new Stage(); //Creating new stage
        stage.setTitle("Second Stage"); //Setting stage title
        Button bt1 = new Button("Save User"); //Creating new button bt1
        //Creating new gridpane
        GridPane layout1 = new GridPane();
        //specifying layout settings for GridPane layout1
        layout1.setPadding(new Insets(5));
        layout1.setHgap(5);
        layout1.setVgap(5);

        //Creating labels and textfields
        Label lb1 = new Label("Name");
        TextField tf1 = new TextField();
        Label lb2 = new Label("Last name");
        TextField tf2 = new TextField();

        //specifying layout position for all Children
        layout1.add(lb1, 0, 0);//Setting label1 posis
        layout1.add(lb2, 0, 1); //Setting label2 posis
        layout1.add(tf1, 1, 0); //Setting Textfield1 posis
        layout1.add(tf2, 1, 1); //Setting Textfield2 posis
        layout1.add(bt1, 1, 3); //Setting button1


        stage.setScene(new Scene(layout1, 300, 300));//setting scene to be gridpane + button
        stage.show(); //Showing stage.
    }


    public static void main(String[] args) {
        launch(args);
    }
}
