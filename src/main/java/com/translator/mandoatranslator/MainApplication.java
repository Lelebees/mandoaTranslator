package com.translator.mandoatranslator;

import com.translator.mandoatranslator.data.JSONReader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("translatorScreen.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            stage.setTitle("Mando'a Translator");
            stage.setScene(scene);
            stage.show();
            JSONReader.Read();
    }

    public static void main(String[] args) {
        launch();
    }
}
