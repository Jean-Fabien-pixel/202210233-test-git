package org.calma.test_git;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LandscapeExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Landscape");

        StackPane root = new StackPane();
        Canvas canvas = new Canvas(800, 600);
        root.getChildren().add(canvas);

        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Draw the sky
        gc.setFill(Color.SKYBLUE);
        gc.fillRect(0, 0, 800, 300);

        // Draw the mountains
        gc.setFill(Color.GRAY);
        gc.fillPolygon(new double[]{100, 300, 500}, new double[]{300, 100, 300}, 3);

        // Draw the ground
        gc.setFill(Color.GREEN);
        gc.fillRect(0, 300, 800, 300);

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
