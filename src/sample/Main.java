package sample;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.web.HTMLEditor;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;

import static sample.FileHandling.*;


public class Main extends Application {

    HTMLEditor htmlEditor = new HTMLEditor();


    @Override
    public void start(Stage primaryStage) {

        Button button = new Button("Gem");

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                FileChooser fileChooser = new FileChooser();

                FileChooser.ExtensionFilter extensionFilter = new FileChooser.ExtensionFilter("TXT files", "(*.html)");
                fileChooser.setSelectedExtensionFilter(extensionFilter);

                File file = fileChooser.showSaveDialog(primaryStage);
                String save = htmlEditor.getHtmlText();
                FileHandling createfile = new FileHandling();
                createFile("pastototre.html");
                createfile.updateFile("pastototre.html", save);
                }

        });
//pas
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
