package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        HTMLEditor htmlEditor = new HTMLEditor();

        Button button = new Button("Gem");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                // @TODO add logic
            }
        });

        VBox vBox = new VBox(htmlEditor, button);
        Scene scene = new Scene(vBox);

        primaryStage.setScene(scene);
        primaryStage.setTitle("NotesBlok");
        primaryStage.show(); // comment tat
    }


    public static void main(String[] args) {
        launch(args);
    }


}
