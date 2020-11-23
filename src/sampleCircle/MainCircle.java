/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 23-11-2020
 */
package sampleCircle;

import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.beans.binding.When;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
import javafx.scene.control.Button;

public class MainCircle extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Create shadow
        DropShadow shadow = new DropShadow();
        shadow.setOffsetX(5);
        shadow.setOffsetY(5);
        shadow.setColor(Color.GRAY);

        //Create circle
        Circle circle = new Circle(200, 200, 100, Color.WHITE);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(5);
        circle.setEffect(shadow);

        //Creating text
        Text text = new Text("This is my Circle");
        text.setEffect(new Reflection());
        text.setFont(Font.font("Roboto", FontWeight.BOLD, 22));

        //Create a pane to hold the circle
        StackPane stackPane = new StackPane(circle, text);
        stackPane.setPrefHeight(300);
        stackPane.setPrefWidth(300);

        //Create new rotate animation
        RotateTransition rotate = new RotateTransition(Duration.seconds(3), stackPane);
        rotate.setFromAngle(0);
        rotate.setToAngle(360);
        rotate.setAutoReverse(true);
        rotate.setCycleCount(10);

        //Create new button, which doesnt wanna fucking work
          Button rotatePauseBt = new Button("Rotate");
        rotatePauseBt.setPrefHeight(60);
        rotatePauseBt.setPrefWidth(60);
        rotatePauseBt.setOnAction(event -> {
            if (rotate.getStatus() == Animation.Status.RUNNING)
                rotate.pause();
            else
                rotate.play();
        });

        rotatePauseBt.textProperty().bind(new When(rotate.statusProperty().isEqualTo(Animation.Status.RUNNING)).then("Pause").otherwise("Rotate"));

        HBox hBox = new HBox( stackPane, rotatePauseBt);
        hBox.setAlignment(Pos.CENTER);
        hBox.setStyle("-fx-background-color: red");


        //Create a scene and place it in the stage
        Scene scene = new Scene(hBox, 600, 600);
        primaryStage.setTitle("Rotation transition");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
