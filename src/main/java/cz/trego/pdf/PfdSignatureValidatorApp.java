package cz.trego.pdf;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PfdSignatureValidatorApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("mainframe.fxml"));
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("PDF Signature Validator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
