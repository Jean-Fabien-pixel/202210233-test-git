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
        primaryStage.setTitle("JavaFX Landscape with Camel");

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

        // Draw the camel
        drawCamel(gc, 400, 400);

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void drawCamel(GraphicsContext gc, double x, double y) {
        gc.setFill(Color.BROWN);

        // Body
        gc.fillOval(x - 50, y - 50, 100, 50);

        // Head
        gc.fillOval(x + 40, y - 60, 40, 30);

        // Neck
        gc.fillOval(x + 20, y - 70, 30, 50);

        // Legs
        gc.fillOval(x - 30, y - 10, 20, 50);
        gc.fillOval(x + 10, y - 10, 20, 50);
//        gc.fillOval(x - 30, y + 30, 20, 50);
//        gc.fillOval(x + 10, y + 30, 20, 50);

        // Hump
        gc.fillOval(x - 10, y - 70, 50, 40);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
