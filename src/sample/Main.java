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

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        HTMLEditor htmlEditor = new HTMLEditor();
        final String save = htmlEditor.getHtmlText();

        Button button = new Button("Gem");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                FileChooser fileChooser = new FileChooser();

                FileChooser.ExtensionFilter extensionFilter = new FileChooser.ExtensionFilter("TXT files", "(*.txt)");
                extensionFilter().add(extensionFilter);

                File file = fileChooser.showSaveDialog(primaryStage);

                if (file != null) {
                    try {
                        SaveFile(save, file);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            private Collection<FileChooser.ExtensionFilter> extensionFilter() {
                return null;
            }
        });


        VBox vBox = new VBox(htmlEditor, button);
        Scene scene = new Scene(vBox);

        primaryStage.setScene(scene);
        primaryStage.setTitle("NotesBlok");
        primaryStage.show(); // comment tat
    }
    private void SaveFile(String content, File file ) throws IOException {
        try {
            FileWriter fileWriter = null;
            fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();
        } catch (IIOException e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }

    }


    public static void main(String[] args) {
        launch(args);
    }


}
