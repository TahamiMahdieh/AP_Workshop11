package org.main.workshop11;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalculatorApplication.class.getResource("calculator-view.fxml"));
        Parent root = fxmlLoader.load();
        Controller controller = fxmlLoader.getController();
        Scene scene = new Scene(root);
        stage.setTitle("Calculator!");
        stage.setResizable(false);
        scene.setOnKeyPressed(controller::keyboardPressed);
        stage.setScene(scene);
        stage.show();
        root.requestFocus();
    }

    public static void main(String[] args) {
        launch();
    }
}